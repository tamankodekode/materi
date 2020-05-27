package com.project;

import java.util.Scanner;

public class Fatkhan { // Constanta Case
    public static void main (String [] args) {

        // Program Kalkulator
        // a operator b

        Scanner inputUser;
        float a,b,hasil;
        String operator;

        inputUser = new Scanner(System.in);

        System.out.print("Nialai a : ");
        a = inputUser.nextFloat();
        System.out.print("Operator : ");
        operator = inputUser.next();
        System.out.print("Nialai b : ");
        b = inputUser.nextFloat();

        System.out.println("Input User  = " + a + " " + operator + " " + b);

        // Operasi Penjumlahan
        if (operator.equals("tambah") || operator.charAt(0) == '+') {
            hasil = a + b;
            System.out.println("Hasilnya adalah  = " + hasil);

        } else  if (operator.equals("dikurangi") || operator.charAt(0) == '-') {
            hasil = a - b;
            System.out.println("Hasilnya adalah  = " + hasil);

        }
    }
}
