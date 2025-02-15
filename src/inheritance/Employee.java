package inheritance;

 class Employee {
    String name;
    String employeeid;

    //Constructor Employee
    public Employee(String name, String employeeid){

        this.name= name;
        this.employeeid= employeeid;
    }

    //Method to Calculate Salary(will be overridden in the derived class)
    public double calculateSalary(){
        return 0.0;
    }

     public void displayDetails() {
         System.out.println("Name: " + name);
         System.out.println("Employee ID: " + employeeid);
     }

}

class FulltimeEmployee extends Employee{
    private double monthlySalary;

//Constructor for FulltimeEmployee
    public FulltimeEmployee(String name, String employeeid, double monthlySalary){
        super(name,employeeid);
        this.monthlySalary=monthlySalary;
    }

    //Overriding calculateSalary
    @Override
    public double calculateSalary(){
        return monthlySalary;
    }
}

class ParttimeEmployee extends Employee{
    private double hourlywage;
    private int hoursworked;

    //Constructor for Part time Employee
    public ParttimeEmployee(String name,String employeeid, double hourlywage, int hoursworked){
        super(name,employeeid);
        this.hourlywage=hourlywage;
        this.hoursworked=hoursworked;

    }

    //Overriding calculateSalary
    @Override
    public double calculateSalary(){
        return hourlywage*hoursworked;
    }
}

