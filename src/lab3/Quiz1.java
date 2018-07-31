package lab3;

public class Quiz1 {

    public static void main(String[] args) {

        int i = 0;
        int sum = 0;

        for (int x = 500; x < 1000; x++) {
            //statement for
            if (x % 3 == 0 && x % 6 == 0) {

                System.out.print(x + " ");
                i++;
                sum +=x;
            }

        }

        System.out.println( "\nNumber of value is "+i);
        System.out.println( "The summation is "+sum);
        System.out.println( "The average avlue is "+(sum/i));

    }//main



}//class
