package com.example.test_task.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.test_task.dto.NumberDTO;
import com.example.test_task.service.NumberService;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/numbers")
public class NumberController {

    private final NumberService numberService;

    @PostMapping
    public void saveNumber(@RequestBody NumberDTO numberDto) {
        numberService.saveNumber(numberDto););
    }

    @GetMapping
    public NumberDTO getNumber() {
        return numberService.getNumber();
    }
}

