package com.ByteBrawlers.ByteBrawlers.Configure;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ItemConfigure {

    @Bean
    public ModelMapper modelMapperBean() {
        return new ModelMapper();
    }

}
