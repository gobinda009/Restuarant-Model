package com.Restaurant.Restuarant.Model.Services;

import com.Restaurant.Restuarant.Model.Entity.RestuarantModel;
import com.Restaurant.Restuarant.Model.Repository.RestuarantRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class RestuarantServices {

    @Autowired
    RestuarantRepo restuarantRepo;


    public String addrestuarants(List<RestuarantModel> myRestuarant) {
        restuarantRepo.getRestuarants().addAll(myRestuarant);
        return myRestuarant.size() + " Restuarants were added";
    }

    public List<RestuarantModel> getAllRestuarants() {
       return restuarantRepo.getRestuarants();
    }
    public RestuarantModel searchByid(Integer Id){
        for(RestuarantModel restu:restuarantRepo.getRestuarants()){
            if(restu.getId().equals(Id)){
                return restu;
            }
        }
        return null;
    }

    public String deleteRestuarant(Integer id) {
        for(RestuarantModel restu:restuarantRepo.getRestuarants()){
            if(restu.getId().equals(id)){
                restuarantRepo.getRestuarants().remove(restu);
            }
        }
        return "Restuarant Deleted Successfully !!!!";
    }

    public String updateRes(Integer id,String Speciality) {
        for(RestuarantModel restu:restuarantRepo.getRestuarants()){
            if(restu.getId().equals(id)){
                restu.setSpeciality(Speciality);
            }
        }
        return "Speciality updated Successfully !!!!";

    }
}
