package com.example.car_tasknine;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        RegistrationPlate reg1 = new RegistrationPlate("FI", "ABC-123");
        RegistrationPlate reg2 = new RegistrationPlate("FI", "UXE-465");
        RegistrationPlate reg3 = new RegistrationPlate("D", "B WQ-431");

        ArrayList<RegistrationPlate> finnish = new ArrayList<>();
        finnish.add(reg1);
        finnish.add(reg2);

        RegistrationPlate newPlate = new RegistrationPlate("FI", "ABC-123");
        if (!finnish.contains(newPlate)) {
            finnish.add(newPlate);
        }
        System.out.println("Finnish: " + finnish);

        VehicleRegister register = new VehicleRegister();
        register.add(reg1, "Arto");
        register.add(reg3, "Jürgen");

        System.out.println("owners:");
        System.out.println(register.get(new RegistrationPlate("FI", "ABC-123")));
        System.out.println(register.get(new RegistrationPlate("D", "B WQ-431")));
    }
}
