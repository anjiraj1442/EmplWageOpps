package com.bridgelabz;

/**
 * Employee Wage Program By Using ops Concept
 *
 * @author : Anji Raj Ardula
 * @version : 16.0
 * @since : 02/10/2021
 */

public class EmployeeWageOps {
    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Program By using Ops concept");
        int IS_PRESENT = 1;

        int empCheck = (int) Math.floor(Math.random() * 10) % 2;
        if (empCheck == IS_PRESENT)
            System.out.println(" Employee is Present");
        else
            System.out.println(" Employee is Absent");
    }
}


