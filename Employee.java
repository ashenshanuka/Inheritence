public class Employee{
    private String name;
    protected double salary; // uses in analyst class
    private int age;

    public Employee (String name,double salary,int age){
        this.name=name;
        this.salary=salary;
        this.age=age;
    }

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

    public double getSalary(){
        return salary;
    }

    public void raiseSalary(){
        this.salary = this.salary*1.2;
    }

}