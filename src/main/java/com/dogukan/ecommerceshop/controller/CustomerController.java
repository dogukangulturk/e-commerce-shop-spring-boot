package com.dogukan.ecommerceshop.controller;

import com.dogukan.ecommerceshop.dto.request.CustomerRequest;
import com.dogukan.ecommerceshop.dto.response.CustomerResponse;
import com.dogukan.ecommerceshop.dto.response.FavoriteListResponse;
import com.dogukan.ecommerceshop.dto.response.OrderResponse;
import com.dogukan.ecommerceshop.model.FavoriteList;
import com.dogukan.ecommerceshop.model.Order;
import com.dogukan.ecommerceshop.service.CustomerService;
import com.dogukan.ecommerceshop.model.Customer;
import org.modelmapper.ModelMapper;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/customers")
public class CustomerController {
    private final CustomerService customerService;
    private final ModelMapper modelMapper;
    private final PasswordEncoder passwordEncoder;


    public CustomerController(CustomerService customerService, ModelMapper modelMapper, PasswordEncoder passwordEncoder) {
        this.modelMapper = modelMapper;
        this.customerService = customerService;
        this.passwordEncoder = passwordEncoder;
    }

    @PostMapping
    public ResponseEntity<CustomerResponse> createCustomer(@ModelAttribute CustomerRequest customerRequest) {
        Customer customer = modelMapper.map(customerRequest, Customer.class);
        String encryptedPassword = passwordEncoder.encode(customer.getPassword());
        customer.setPassword(encryptedPassword);

        Customer createdCustomer = customerService.createCustomer(customer);
        return ResponseEntity.status(HttpStatus.CREATED).body(modelMapper.map(createdCustomer, CustomerResponse.class));
    }

    @GetMapping("/{customerId}")
    public ResponseEntity<CustomerResponse> getCustomer(@PathVariable String customerId) {
        Customer customer = customerService.getCustomerById(customerId);
        return ResponseEntity.ok(modelMapper.map(customer, CustomerResponse.class));
    }

    @GetMapping("/{customerId}/orders")
    public ResponseEntity<List<OrderResponse>> getCustomerOrders(@PathVariable String customerId) {
        List<Order> orders = customerService.getCustomerOrders(customerId);
        List<OrderResponse> orderResponses = orders.stream()
                .map(order -> modelMapper.map(order, OrderResponse.class))
                .collect(Collectors.toList());
        return ResponseEntity.ok(orderResponses);
    }

    @GetMapping("/{customerId}/favorite-lists")
    public ResponseEntity<List<FavoriteListResponse>> getCustomerFavoriteLists(@PathVariable String customerId) {
        List<FavoriteList> favoriteLists = customerService.getCustomerFavoriteLists(customerId);
        List<FavoriteListResponse> favoriteListResponses = favoriteLists.stream()
                .map(favoriteList -> modelMapper.map(favoriteList, FavoriteListResponse.class))
                .collect(Collectors.toList());
        return ResponseEntity.ok(favoriteListResponses);
    }
}
