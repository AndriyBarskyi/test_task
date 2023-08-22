package com.example.test_task.service;

import org.springframework.stereotype.Service;

import com.example.test_task.dto.NumberDTO;

@Service
public interface NumberService {

    NumberDTO getNumber();

    void saveNumber(NumberDTO value);

}
