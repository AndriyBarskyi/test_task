package com.example.test_task.mapper;

import org.mapstruct.Builder;
import org.mapstruct.Mapper;
import org.mapstruct.NullValueCheckStrategy;

import com.example.test_task.dto.NumberDTO;
import com.example.test_task.model.NumberEntity;

@Mapper(componentModel = "spring", builder = @Builder(disableBuilder = true), nullValueCheckStrategy = NullValueCheckStrategy.ALWAYS)
public interface NumberMapper {

    NumberDTO toDTO(NumberEntity number);
    NumberEntity toEntity(NumberDTO numberDTO);
}
