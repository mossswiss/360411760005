package lab7;

import java.util.Scanner;

public class EmployeeApp {


    public static void main(String[] args) {


        Employee emp1 = new Employee("Swiss",
                "EMP005",
                "Programmer",
                15000.00,
                "moss.swiss@gmail.com");
        System.out.println(emp1.toString());
        emp1.setName("Swiss Limmahasukhon");
        System.out.println(emp1.toString());

        Employee emp2 = new Employee();

        emp2 = inputData(emp2);





    }

    private static Employee inputData(Employee emp2) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name : ");
        emp2.setName(sc.nextLine());
        System.out.print("Enter your ID : ");
        emp2.setID(sc.nextLine());
        System.out.print("Enter your position : ");
        emp2.setPosition(sc.nextLine());
        System.out.print("Enter your email : ");
        emp2.setEmail(sc.nextLine());
        System.out.print("Enter your salary : ");
        emp2.setSalary(sc.nextDouble());


        return emp2;





    }


}
