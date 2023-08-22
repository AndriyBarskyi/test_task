package com.example.test_task.service.impl;

import org.springframework.stereotype.Service;

import com.example.test_task.dto.NumberDTO;
import com.example.test_task.mapper.NumberMapper;
import com.example.test_task.model.NumberEntity;
import com.example.test_task.repository.NumberRepository;
import com.example.test_task.service.NumberService;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class NumberServiceImpl implements NumberService {

    private final NumberRepository numberRepository;
    private final NumberMapper numberMapper;

    public void saveNumber(NumberDTO value) {
        value.setId(1L);
        numberRepository
            .save(numberMapper
            .toEntity(value));
    }

    public NumberDTO getNumber() {
        NumberDTO number = numberMapper
            .toDTO(numberRepository
                .findById(1L)
                .orElse(new NumberEntity()));
        return number;
    }
}
