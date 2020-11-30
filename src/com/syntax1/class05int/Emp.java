package com.syntax1.class05int;

import static com.syntax1.class05int.Employee.*;

public class Emp {
    public static void main(String[] args) {
        Employee employee1=new Employee();
        employee1.empID=123;
        employee1.salary=200000;
        CEO="Sumair";
        System.out.println(CEO);
        System.out.println(employee1.empID);
        System.out.println(employee1.salary);


        Employee employee2=new Employee();
        employee2.empID=2345;
        employee2.salary=960000;

        System.out.println(CEO);
        System.out.println(employee2.empID);
        System.out.println(employee2.salary);

    }
}
