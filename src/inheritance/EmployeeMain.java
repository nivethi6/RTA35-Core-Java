package inheritance;

public class EmployeeMain{
    public static void main(String[] args) {
        // Creating FullTimeEmployee and PartTimeEmployee objects
        FulltimeEmployee fullTimeEmployee = new FulltimeEmployee("Nivethitha", "F123", 5000.0);
        ParttimeEmployee partTimeEmployee = new ParttimeEmployee("Nataraja", "P456", 20.0, 80);

        // Displaying details and calculating salaries for both employees
        System.out.println("Full-Time Employee Details:");
        fullTimeEmployee.displayDetails();
        System.out.println("Salary: " + fullTimeEmployee.calculateSalary() + "\n");

        System.out.println("Part-Time Employee Details:");
        partTimeEmployee.displayDetails();
        System.out.println("Salary: " + partTimeEmployee.calculateSalary());
    }
}
