package com.example.car_tasknine;

public class RegistrationPlate {
    private final String regCode;
    private final String country;

    public RegistrationPlate(String regCode, String country) {
        this.regCode = regCode;
        this.country = country;
    }

    public String toString(){
        return country + " " + regCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        RegistrationPlate that = (RegistrationPlate) obj;
        return regCode.equals(that.regCode) && country.equals(that.country);
    }

    @Override
    public int hashCode() {
        int result = regCode.hashCode();
        result = 31 * result + country.hashCode();
        return result;
    }
}
