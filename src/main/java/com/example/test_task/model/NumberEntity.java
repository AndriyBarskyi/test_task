package com.example.test_task.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@Table("NUMBER")
public class NumberEntity {
    @Id
    private Long id;

    @Column("NUMBER_VALUE")
    private Long numberValue;

}

