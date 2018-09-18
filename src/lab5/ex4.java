package lab5;

import java.util.ArrayList;

public class ex4 {
    public static void main(String[] args) {


        ArrayList myList = new ArrayList();
        myList.add("swiss");
        System.out.println(myList);
        myList.add("jay");
        myList.add("mook");
        myList.add("kiw");
        myList.add("may");
        myList.add("boat");
        System.out.println(myList);
        myList.add(2,"bb");
        System.out.println(myList);
        myList.remove(4);
        System.out.println(myList);
        myList.remove("may");
        System.out.println(myList);

        System.out.println(myList.indexOf("jay"));

        System.out.println(myList.size());








    }













}
