package com.Restaurant.Restuarant.Model.Repository;

import com.Restaurant.Restuarant.Model.Entity.RestuarantModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public class RestuarantRepo {

    @Autowired
    private List<RestuarantModel> restuarants;

    public List<RestuarantModel> getRestuarants() {
        return restuarants;
    }
}
