package lab4;

public class ex1 {

    public static void B(String msg){
        System.out.println(msg);

        A();
    }

    public static void main(String[] args) {

        System.out.println("Hello Main.");

        A();
        System.out.println("Hello Main. 2");

        B( "Swiss");

        int num = C(10,10);
        System.out.println(num);
        System.out.println(C(20,20));
    }//main

    public static void A(){

        System.out.println("Hello A.");


    }//A

    public static int C(int x,int y){
        System.out.println("Hello C.");

        return x+y;

    }

}//class
