package com.company;

import com.company.states.Country;
import com.company.states.CountryCode;
import com.company.states.CountryIso;

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
    public List<CountryCode> getCountriesNameAndIso(){
        List<CountryCode> countryCodes = new ArrayList<>();

        for(String country : isoCountries){
            Locale locale = new Locale("en",country);
            String name = locale.getDisplayCountry();
            String iso = locale.getISO3Country();
            if (!countryCodes.contains(name)) {
                countryCodes.add(new CountryCode(name,iso));
            }
        }
        return countryCodes;
    }
    public List<CountryIso> getNameCodeAndIso(){
        List<CountryIso> nameCodeIso = new ArrayList<>();
        for(String country : isoCountries){
            Locale locale = new Locale("en",country);
            String name = locale.getDisplayCountry();
            String iso = locale.getISO3Country();
            String code = locale.getCountry();
            if (!nameCodeIso.contains(name)) {
                nameCodeIso.add(new CountryIso(name,iso,code));
            }
        }

        return nameCodeIso;
    }

}
