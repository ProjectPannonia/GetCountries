package com.company;

import com.company.states.Country;
import com.company.states.CountryIso;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        GetAllCountries getAllCountries = new GetAllCountries();

       List<Country> myList = getAllCountries.getOnlyCountriesNames();
       for (Country c : myList){
           System.out.println(c.getName());
       }

    }

}
