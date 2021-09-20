package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int firstn = 0;
        double secondn = 0;
        char repeat;
        Numbers num = new Numbers(firstn, secondn);

        do {
            System.out.print("\nInput first number (integer): ");
            firstn = sc.nextInt();
            num.setFirstNum(firstn);
            System.out.print("\nInput second number (double): ");
            secondn = sc.nextDouble();
            num.setSecondNum(secondn);

            System.out.println("\nFirst number: " + num.getFirstNum() + "\n"
                    + "Second number: " + num.getSecondNum() + "\n"
                    + "Sum: " + num.sum(firstn, secondn) + "\n"
                    + "Average: " + num.average(firstn, secondn) + "\n"
                    + "First number to Binary: " + num.convertToBinary(firstn) + "\n"
                    + "Second number to Hexadecimal: " + num.convertToHexa(secondn));

            System.out.println("\nStart over? (Y/N)");
            repeat = sc.next().charAt(0);
        } while(repeat == 'Y' || repeat == 'y');
    }
}
