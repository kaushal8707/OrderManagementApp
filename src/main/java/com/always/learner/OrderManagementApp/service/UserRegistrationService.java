package com.always.learner.OrderManagementApp.service;

import com.always.learner.OrderManagementApp.dto.SellerDto;

import java.util.List;

public interface UserRegistrationService {
    String registerSeller(SellerDto sellerDto);
    List<SellerDto> getSellersList();
}
