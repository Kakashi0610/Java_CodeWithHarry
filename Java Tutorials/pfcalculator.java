/* RAKSHI EXAMPLE

import java.util.*;

public class pfcalculator{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Name: ");
        String name = sc.next();

        System.out.println("Enter a salary: ");
        float salary = sc.nextFloat();

        System.out.println("Enter a pf percentage: ");
        float pfpercentage = sc.nextFloat();

        FullTimeEmployee obj = new FullTimeEmployee();
        if(obj.validateInput(pfpercentage, salary)){
            obj.setName(name);
            obj.setSalary(salary);
            
            System.out.println(obj.getName());
            System.out.println(obj.getSalary());
            System.out.println(obj.calculateNetSalary(pfpercentage, salary));
        }
        else{
            System.out.println("Error!!! Unable to calculate the NetSalary");
        }

    }
}

class Employee{
    // Variables 
    private String name;
    private float salary;
    private String address;
    private int id;
    private float netSalary;

    // Setters
    public void setName(String name){
        this.name = name;
    }

    public void setSalary(float salary){
        this.salary = salary;
    }

    public void setAddress(String address){
        this.address = address;
    }

    public void setID(int id){
        this.id = id;
    }

    public void setNetSalary(float netSalary){
        this.netSalary = netSalary;
    }

    // Getters
    public String getName(){
        return this.name;
    }

    public float getSalary(){
        return this.salary;
    }

    public String getAddress(){
        return this.address;
    }

    public int getID(){
        return this.id;
    }

    public float getNetSalary(){
        return this.netSalary;
    }
}

class FullTimeEmployee extends Employee{
    private float percentage;
    private float pfamount;


    public double calculateNetSalary(float percentage, float salary){
        pfamount = (salary * percentage)/100;
        salary = salary - pfamount;
        return salary;
    }

    public boolean validateInput(float percentage, float salary){
        if(percentage >= 0 && salary > 0){
            return true;
        }
        return false;
    }
}
*/



/* OUTPUT

Enter a salary: 
30000
Enter a pf percentage: 
2.5
aniket
30000.0
29250.0

*/