package com.company.states;

public class CountryIso extends CountryCode{

    private String iso;

    public CountryIso(String name, String code,String iso) {
        super(name, code);
        this.iso = iso;
    }

    public String getIso() {
        return iso;
    }
}
