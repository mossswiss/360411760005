package lab5;

import java.util.Arrays;
import java.util.Scanner;

public class ex2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int []num = new int[5];
        System.out.println("Please, enter integers number : ");

        for (int i = 0 ; i < num.length;i++) {
            System.out.print("enter integer "+(i+1)+" : ");
            num[i] = scanner.nextInt();
        }


        //System.out.println("\n Data in Array following : ");
        //for (int i = 0 ; i < num.length; i++) {
           // System.out.print(num[i]+" ");

        //}

        showData(num);
        maximum(num);
        minimum(num);
        average(num);
        sorting(num);

    }
    private static void maximum(int[] num) {

        int max = num[0];
        for (int i = 0 ;i < num.length;i++) {
            if(max< num[i])
                max = num[i];



        }
        System.out.println("\nThe maximum value is :  "+max);


    }
    private static void minimum(int[] num) {

        int min = num[0];
        for (int i = 0 ;i < num.length;i++) {
            if(min > num[i])
                min = num[i];

        }
        System.out.println("\nThe minimum value is :  "+min);

    }

    private static void average(int[] num) {

        int aver=0 ;

        for (int val : num)
                aver += val;
            System.out.println("The average avlue is : " +(aver/num.length));



    }

    private static void sorting(int[] num) {

        Arrays.sort(num);

        System.out.println("Sorting data in array : \n");
        showData(num);
    }




    private static void showData(int[] num) {
        for (int val : num) {
            System.out.print(val + " ");

        }









    }


}
