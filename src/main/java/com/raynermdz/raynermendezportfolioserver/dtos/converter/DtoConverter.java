package com.raynermdz.raynermendezportfolioserver.dtos.converter;


import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class DtoConverter {



    public DtoEntity convertToDto(Object obj, DtoEntity mapper) {
        return new ModelMapper().map(obj, mapper.getClass());
    }

    public Object convertToEntity(Object obj, DtoEntity mapper) {
        return new ModelMapper().map(obj, mapper.getClass());
    }
}