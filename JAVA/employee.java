import java.util.Scanner;

class Employee {

    private String eName;
    private int basicSalary;
    static int countEmployee = 0;

    public Employee() {
        basicSalary = 0;
        eName = null;
        System.out.println("Employee Default constructor: ");
        countEmployee = countEmployee + 1;
    }

    public Employee(String name, int bs) {    // Overloaded constructor
        eName = name;
        basicSalary = bs;
        countEmployee = countEmployee + 1;
    }

    public Employee(Employee e) {      // Copy constructor
        this.eName = e.eName;
        this.basicSalary = e.basicSalary;
        countEmployee = countEmployee + 1;
    }

    public void setEName(String eName) {
        this.eName = eName;
    }

    public String getEName() {
        return eName;
    }

    public void setBasicSalary(int basicSalary) {
        this.basicSalary = basicSalary;
    }

    public int getBasicSalary() {
        return basicSalary;
    }

    public void printEmployeeDetails() {
        System.out.println("Employee Name: " + eName);
        System.out.println("Basic Salary: " + basicSalary);
    }

    public int getNetIncome() {
        // Assuming net income is the same as the basic salary for regular employees
        return basicSalary;
    }

    public static int countEmployees() {
        System.out.println(countEmployee);
        return countEmployee;
    }
}

class SalesManager extends Employee {

    private int salesAmount;

    public SalesManager() {
        System.out.println("SalesManager Default constructor: ");
    }

    public SalesManager(String name, int bs, int sa) {
        super(name, bs);
        salesAmount = sa;
    }

    @Override
    public void printEmployeeDetails() {
        super.printEmployeeDetails();
        System.out.println("Sales Amount: " + salesAmount);
    }

    @Override
    public int getNetIncome() {
        int baseNetIncome = super.getNetIncome();
        // Assuming 5% commission on sales amount
        int commission = (int) (0.05 * salesAmount);
        return baseNetIncome - commission;
    }
}

public class employee {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Employee emp1 = new Employee("Kartik Jaju", 40000);
        Employee emp2 = new Employee(emp1);
        SalesManager sm1 = new SalesManager("Jagrat Pandya", 60000, 10000);

        Employee.countEmployees();

        emp1.printEmployeeDetails();
        System.out.println("Net Income: " + emp1.getNetIncome());

        sm1.printEmployeeDetails();
        System.out.println("Net Income: " + sm1.getNetIncome());

        scanner.close();
    }
}
