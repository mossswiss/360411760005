package Midterm_Exam;

import java.util.Scanner;

public class midterm_3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n,a ;

        int m,h;

        System.out.println("อัตราโบนัสเงินเดือน");
        System.out.println("1.ชั่วโมงสอนน้อยกว่ำ 12 ชั่วโมง ไม่ได้รับโบนัส");
        System.out.println("2.ชั่วโมงสอน 12 - 16 ชั่วโมง ได้รับโบนัส 5% ของเงินเดือน");
        System.out.println("3.ชั่วโมงสอน 17 - 20 ชั่วโมง ได้รับโบนัส 10% ของเงินเดือน");
        System.out.println("4.ชั่วโมงสอน 21 ชั่วโมงเป็นต้นไป ได้รับโบนัส 15% ของเงินเดือน");


        System.out.print("ชื่อ-สกุล : ");
        n = sc.nextLine();
        System.out.print("คณะ : ");
        a = sc.nextLine();
        System.out.print("เงินเดือน : ");
        m = sc.nextInt();
        System.out.print("ชั่วโมงสอน : ");
        h = sc.nextInt();
        if (h>=0 && h <12){
            System.out.println(m);
        }
        else if (h>=12 && h <=16){
            System.out.println("เงินเดือนรวมโบนัส :" +(m+(m *0.05)));

        }else if (h>=17 && h <=20){
            System.out.println("เงินเดือนรวมโบนัส :" +(m+(m *0.10)));
        }
        else if (h>=21){
            System.out.println("เงินเดือนรวมโบนัส :" +(m+(m *0.15)));
        }
        else {
        }



    }//main
}//class
