package com.Restaurant.Restuarant.Model.DataSource;

import com.Restaurant.Restuarant.Model.Entity.RestuarantModel;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;
@Configuration
public class RestuarantList {
    @Bean
    List<RestuarantModel> getRestuarant(){
        return new ArrayList<>();
    }
}
