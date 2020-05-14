package com.company;

import com.company.states.Country;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class GetAllCountries {


    private String[] isoCountries = Locale.getISOCountries();

    public List<Country> getOnlyCountriesNames(){
        List<Country> countries = new ArrayList<>();

        for(String country : isoCountries){
            Locale locale = new Locale("en",country);
            String iso = locale.getDisplayCountry();
            if (!countries.contains(iso)) {
                countries.add(new Country(iso));
                System.out.println(iso);
            }
        }
        return countries;
    }

}
