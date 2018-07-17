package lab3;

import java.util.Scanner;

public class BMRCal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //input


        System.out.print(" เพศ : ");
        String G = scanner.nextLine();

        System.out.print(" ส่วนสูง : ");
        double H = scanner.nextDouble();

        System.out.print(" น้ำหนัก : ");
        double W = scanner.nextDouble();

        System.out.print(" อายุ : ");
        double A = scanner.nextDouble();



        if (G == "M")
            System.out.println(66+(13.7*W)+(5*H)-(6.8*A));

        else
            System.out.println(655+(9.6*W)+(1.8*H)-(4.7*A));









    }//main




}//class
