package com.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

@Component
@PropertySource("classpath:application.properties")
public class PropertyValue {

    @Autowired
    private Environment env;

    public String getProperty(String key){
        return env.getProperty(key);
    }
}
