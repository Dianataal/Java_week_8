package com.example.car_tasknine;

import java.util.HashMap;

public class VehicleRegister {
    private final HashMap<RegistrationPlate, String> owners;

    public VehicleRegister() {
        this.owners = new HashMap<>();
    }

    public boolean add(RegistrationPlate plate, String owner) {
        if (!owners.containsKey(plate)) {
            owners.put(plate, owner);
            return true;
        }
        return false;
    }

    public String get(RegistrationPlate plate) {
        return owners.get(plate);
    }

    public boolean delete(RegistrationPlate plate) {
        if (owners.containsKey(plate)) {
            owners.remove(plate);
            return true;
        }
        return false;
    }

    public void printRegistrationPlates() {
        for (RegistrationPlate plate : owners.keySet()) {
            System.out.println(plate);
        }
    }

    public void printOwners() {
        HashMap<String, String> uniqueOwners = new HashMap<>();
        for (String owner : owners.values()) {
            uniqueOwners.put(owner, owner);
        }
        for (String uniqueOwner : uniqueOwners.keySet()) {
            System.out.println(uniqueOwner);
        }
    }
}

