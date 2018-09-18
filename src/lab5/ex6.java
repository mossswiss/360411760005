package lab5;

import java.util.StringTokenizer;

public class ex6 {
    public static void main(String[] args) {

        StringBuffer strbuf = new StringBuffer("I am at RUTS");
        strbuf.insert(0, "MT: ");
        System.out.println(strbuf);
        System.out.println(strbuf.reverse());

        StringBuilder strbui = new StringBuilder("I am at RUTS");
        strbui.append(" :MT");
        System.out.println(strbui);
        System.out.println(strbui.reverse());

        StringTokenizer strtok = new StringTokenizer("I am at RUTS");

        System.out.println("Word count in message = " + strtok.countTokens());

        while (strtok.hasMoreTokens()) {
            System.out.println(strtok.nextToken());


        }

    }






}
