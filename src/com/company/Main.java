package com.company;


import com.company.states.Country;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        GetAllCountries getAllCountries = new GetAllCountries();
        List<Country> countriesNames = getAllCountries.getOnlyCountriesNames();
    }
}
