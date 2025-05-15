import java.util.*;
class Employee
{
    Scanner sc=new Scanner(System.in);
    int eNo,eSalary;
    String eName;
    Employee(int n){
        System.out.println("\t\t\tEnter Details for Employee "+n);
        System.out.print("Enter Employee Number: ");
        eNo=sc.nextInt();
        System.out.print("Enter Employee Name: ");
        eName=sc.next();
        System.out.print("Enter Salary: ");
        eSalary=sc.nextInt();

    }
}

class EmployeeObj{
    public static void main(String[] args)
    {
    Scanner sc=new Scanner(System.in);
        Employee emp[] = new Employee[3];

        for(int i=0;i<3;i++){
            emp[i]=new Employee(i+1);
        }

        System.out.println("\nEnter Employee Number to search: ");
        int num=sc.nextInt();
        int flag=0;
        for(int i=0;i<3;i++){
            if(emp[i].eNo==num){
                System.out.println("EMployee found with " +emp[i].eNo + " " +emp[i].eSalary);
                flag=1;
            }
        }
        if(flag==0){
            System.out.println("Not registered");
        }
    }
}