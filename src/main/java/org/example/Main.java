package org.example;

import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
    Employee e1 = new Employee(1500 , "Ahmed");
    Employee e2 = new Employee(2000 , "said");
        List <Employee> Company = new ArrayList<>();
        Company.add(e1);
        Company.add(e2);
        for (Employee employee :Company){
            System.out.println(employee.Name +" get paid "+ employee.salary);
        }

    }
}