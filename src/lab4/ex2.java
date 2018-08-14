package lab4;


import com.sun.org.apache.bcel.internal.generic.Select;

import java.util.Scanner;

// 1. summation (+)
// 2. submation (-)
// 3. multipie (*)
// 4. Devided (/)
public class ex2 {

    public static int summation(int x,int y){
        return x+y;
    }
    public static int submation(int x,int y){
        return x-y;
    }
    public static int multipie(int x,int y){
        return x*y;
    }
    public static int Devided(int x,int y){
        return x/y;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x,y,select;

        System.out.println("Please input 2 integers and choose your option.....");

        System.out.println("input number 1 : ");
        x = input.nextInt();
        System.out.println("input number 2 : ");
        y = input.nextInt();


        do {
        System.out.println("1. summation.");
        System.out.println("2. submation.");
        System.out.println("3. multipie.");
        System.out.println("4. Devided.");

        System.out.print("Option : ");
        select = input.nextInt();
        }while (select < 1 || select > 4) ;

        int r=0;
            switch (select) {
                case 1:
                    r = summation(x, y);
                    break;
                case 2:
                    r = submation(x, y);
                    break;
                case 3:
                    r = multipie(x, y);
                    break;
                case 4:
                    r = Devided(x, y);
                    break;
                default:
                    System.out.println("Please select option (1-4) only.");
            }
            System.out.println("Output : " + r);




        }











}//class
