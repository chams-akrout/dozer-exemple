package com.example.demo.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Dest {

    private String name;
    private int age;
    private String address;

}

//https://howtodoinjava.com/java/library/dozer-bean-mapping-examples/