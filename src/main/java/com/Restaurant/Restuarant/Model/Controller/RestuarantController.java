package com.Restaurant.Restuarant.Model.Controller;

import com.Restaurant.Restuarant.Model.Entity.RestuarantModel;
import com.Restaurant.Restuarant.Model.Services.RestuarantServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class RestuarantController {

    @Autowired
    RestuarantServices restuarantServices;

    @PostMapping("Restuarant")
    public String addRestuarant(@RequestBody List<RestuarantModel> myRestuarant){
       return restuarantServices.addrestuarants(myRestuarant);
    }
    @GetMapping("AllRestuarants")
    public List<RestuarantModel> getAllRestuarants(){
        return restuarantServices.getAllRestuarants();
    }
    @GetMapping("Restuarants/{Id}")
    public RestuarantModel getRestuarantbyid(@PathVariable Integer Id){
        return restuarantServices.searchByid(Id);
    }
    @DeleteMapping("Restuarant/{Id}/remove")
    public String deleteRes(@PathVariable Integer Id){
        return restuarantServices.deleteRestuarant(Id);
    }
    @PutMapping("Resturant/{Id}/speciality/{Speciality}")
    public String updateSpecaility(@PathVariable Integer Id,@PathVariable String Speciality){
        return restuarantServices.updateRes(Id,Speciality);
    }
}
