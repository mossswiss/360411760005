package lab2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex3 {


    public static void main(String[] args) throws IOException {
//using BufferedReader
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        //input
        //name
        System.out.print("what is your name? : ");
        String name = reader.readLine();
        //age
        System.out.print("How own are you?: ");
        int age = Integer.parseInt(reader.readLine());

        //weight
        System.out.print("How much do you weigh? : ");
        int weight = Integer.parseInt(reader.readLine());

        //output
        System.out.println("Hello, "+name);
        System.out.println("You are "+age+" year old.");
        System.out.println("Your weight is "+weight+" kilograms.");






    }//main



}//class
