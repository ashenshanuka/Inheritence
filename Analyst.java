public class Analyst extends Employee {

    public Analyst(String name,double salary,int age){
   
    super(name, salary, age);
        
    }

    public double getAnnualbonus(){
        //return this.salary * 0.5; same as super
        return super.salary * 0.5;
    }

    
}
