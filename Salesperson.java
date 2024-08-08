public class Salesperson extends Employee{

    private double commissionpersentage;
    public Salesperson (String name,double salary,int age,double commissionpersentage){
        super(name, salary, age);
        this.commissionpersentage=commissionpersentage;
    }

    public double getcommissionpersentage(){
        return this.commissionpersentage;
    }

    public void raiseCommission(){
        if(this.commissionpersentage<.30){
            this.commissionpersentage=commissionpersentage*1.2;
        }
    }


    
}
