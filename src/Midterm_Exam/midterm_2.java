package Midterm_Exam;

import java.util.Scanner;

public class midterm_2 {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    int a,b,c,d,sum ;


        do {
            System.out.print("คะแนนสอบย่อย : ");
            a = sc.nextInt();
            if (a > 20 || a < 0)
            System.out.println("กรุณากรอกคะแนนใหม่");
        }while (a > 20 || a < 0) ;
        do {
            System.out.print("คะแนนปฏิบัติ : ");
            b = sc.nextInt();
            if (b > 20 || b < 0)
                System.out.println("กรุณากรอกคะแนนใหม่");
        }while (b > 20 || b < 0) ;
        do {
            System.out.print("คะแนนสอบกลางภาค : ");
            c = sc.nextInt();
            if (c > 30 || c < 0)
                System.out.println("กรุณากรอกคะแนนใหม่");
        }while (c > 30 || c < 0) ;
        do {
            System.out.print("คะแนนสอบปลายภาค : ");
            d = sc.nextInt();
            if (d > 30 || d < 0)
                System.out.println("กรุณากรอกคะแนนใหม่");
        }while (d > 30 || d < 0) ;

        System.out.println("ผลคะแนนรวม :"+(a+b+c+d));

        if ((a+b+c+d)>=0 && (a+b+c+d)<=49){
            System.out.println("F");
        }
        else if ((a+b+c+d) >=50 &&(a+b+c+d)<=59){
            System.out.println("D");

        }else if ((a+b+c+d)>=60 &&(a+b+c+d)<=69){
            System.out.println("C");
        }
        else if ((a+b+c+d)>=70 && (a+b+c+d)<=79){
            System.out.println("B");
        }
        else if ((a+b+c+d)>=80 && (a+b+c+d)<=100){
            System.out.println("A");
        }
        else {
                System.out.println("กรุณากรอกคะแนนใหม่");
        }



    }//main




}//class
