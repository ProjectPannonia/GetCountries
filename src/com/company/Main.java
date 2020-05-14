package com.company;


import com.company.states.CountryCode;
import com.company.states.CountryIso;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        GetAllCountries getAllCountries = new GetAllCountries();

        List<CountryIso> allData = getAllCountries.getNameCodeAndIso();

        for (CountryIso c : allData){
            System.out.println(c.getName() + ", " + c.getCode() + ", " + c.getIso());
        }

    }

}
