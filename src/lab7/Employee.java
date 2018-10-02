package lab7;

public class Employee {

    private String name;
    private String ID;
    private String position;
    private double salary;
    private String email;

    public Employee(){}
    public Employee(String name,String ID,String position,double salary,String email){
        this .name = name;
        this .ID = ID;
        this .position = position;
        this .salary = salary;
        this .email = email;

    }
    public String getname(){
        return this.name;
    }
    public void setName(String name) {

        this.name = name;
    }

    public String getID(){
        return this.ID;
    }
    public void setID(String ID) {

        this.ID = ID;
    }
    public String getPosition(){
        return this.position;
    }
    public void setPosition(String position) {

        this.position = position;
    }
    public double getSalary(){
        return this.salary;
    }
    public void setSalary(double salary) {

        this.salary = salary;
    }
    public String getEmail(){
        return this.email;
    }
    public void setEmail(String email) {

        this.email = email;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", ID='" + ID + '\'' +
                ", position='" + position + '\'' +
                ", salary=" + salary +
                ", email='" + email + '\'' +
                '}';
    }
}
