package com.company;


import com.company.states.Country;
import com.company.states.CountryCode;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        GetAllCountries getAllCountries = new GetAllCountries();
        //List<Country> countriesNames = getAllCountries.getOnlyCountriesNames();
        List<CountryCode> namesAndIso = getAllCountries.getCountriesNameAndCode();

        for (CountryCode cc : namesAndIso){
            System.out.println(cc.getName() + " " + cc.getCode());
        }
    }

}
