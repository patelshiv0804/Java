import java.util.Scanner;

class name{

    private int salary;
    private String ename;

    public name(){
        salary =0;
        ename ="NULL";
        System.out.println("this is default constructor ");
        
    }

    // public name(String name,int basicsalary){
    //     salary = basicsalary ;
    //     ename = name ;
    //     System.out.println("this is overloaded constructor ");

    // }

    public name(String ename,int salary){
        this.ename=ename;
        this.salary=salary;
        System.out.println("this is parametrized constructor ");
    } 

    public name (name N){
        this.salary = N.salary ;
        this.ename=N.ename;
        System.out.println("this is copy constructor ");
    }
}

public class constructor {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        System.out.printf("enter the salary:");
        int n = scanner.nextInt();
        Scanner sc= new Scanner(System.in);
        System.out.printf("enter the name:");
        String n1=sc.nextLine();
        name emp1 = new name(n1, n);
        name emp2 = new name(emp1);

        name emp3=new name();
    
}
}
