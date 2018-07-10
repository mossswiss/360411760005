package lab2;

import java.util.Scanner;

public class Ex4 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        //input
        //name
        System.out.print("What is your name? : ");
        String name = scanner.nextLine();
        //age
        System.out.print("How old are you? : ");
        int age = scanner.nextInt();
        //weight
        System.out.print("How much do you weigh? : ");
        double weight = scanner.nextDouble();

        //output
        System.out.println(name);
        System.out.println(age);
        System.out.println(weight);













    }//main



}//class
