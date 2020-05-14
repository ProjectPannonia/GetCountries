package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class GetAllCountries {

    private List<String> countries;
    private String[] isoCountries = Locale.getISOCountries();

    public List<String> getAllCountries(){
        countries = new ArrayList<>();
        for(String country : isoCountries){
            Locale locale = new Locale("en",country);
            String iso = locale.getDisplayCountry();
            if (!countries.contains(iso)) {
                countries.add(iso);
                System.out.println(iso);
            }
        }
        return countries;
    }
}
