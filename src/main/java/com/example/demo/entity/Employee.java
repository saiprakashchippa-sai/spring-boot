package com.example.demo.entity;

import com.azure.spring.data.cosmos.core.mapping.Container;
import com.azure.spring.data.cosmos.core.mapping.PartitionKey;
import lombok.Data;
import org.springframework.data.annotation.Id;


@Data
@Container(containerName = "employee", autoCreateContainer = false)
public class Employee {

    @Id
    @PartitionKey
    private String id;
    private String name;

    private String  dept;

   private double salary;


}
