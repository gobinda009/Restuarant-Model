package com.Restaurant.Restuarant.Model.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class RestuarantModel {
    private Integer Id;
    private String RestuarantName;

    public void setSpeciality(String speciality) {
        Speciality = speciality;
    }

    public Integer getId() {
        return Id;
    }

    private String Address;
    private Long number;
    private String Speciality;
    private Integer TotalMembers;
    private Category RestuarantCategory;

}
