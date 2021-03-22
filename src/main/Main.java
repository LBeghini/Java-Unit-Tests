package main;

import java.util.Scanner;


public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter height: ");
        float height = scanner.nextFloat();

        System.out.println("Enter weight: ");
        float weight = scanner.nextFloat();

        System.out.println("Enter gender (f | m): ");
        String gender = scanner.next();

        IMC imc = new IMC(height, weight, Gender.evaluate(gender) );

        System.out.println(imc.condition());

    }
}
