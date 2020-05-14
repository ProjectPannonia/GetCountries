package com.company;


import java.util.List;

public class Main {

    public static void main(String[] args) {
        GetAllCountries getAllCountries = new GetAllCountries();
        List<String> countriesNames = getAllCountries.getAllCountries();
    }
}
