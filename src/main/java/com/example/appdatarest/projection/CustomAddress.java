package com.example.appdatarest.projection;

import com.example.appdatarest.entity.Address;
import org.springframework.data.rest.core.config.Projection;

@Projection(types = Address.class)
public interface CustomAddress {
    Integer getId();
    String getCity();
    String getStreet();

}
