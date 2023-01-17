package com.example.demo.mapper;

import org.dozer.DozerBeanMapper;

import com.example.demo.entities.Dest;
import com.example.demo.entities.Source;

public class DozerMapper {
    

    public static Dest mapToDestination(){
        Source source = Source.builder()
        .name("source")
        .address("address")
        .age(10)
        .build();
        return new DozerBeanMapper().map(source, Dest.class);
    }
}
