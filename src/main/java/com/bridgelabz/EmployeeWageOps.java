package com.bridgelabz;

/**
 * Employee Wage Program By Using ops Concept day-9
 *
 * @author : Anji Raj Ardula
 * @version : 16.0
 * @since : 07/10/2021
 */

public class EmployeeWageOps {
    public static final int IS_FULL_TIME = 1;
    public static final int IS_PART_TIME = 2;

    private final String company;
    private final int empRatePerHr;
    private final int numWorkingDays;
    private final int maxHoursPerMonth;
    private int totalEmpWage;

    public EmployeeWageOps(String company, int empRatePerHr, int numWorkingDays, int maxHoursPerMonth) {
        this.company = company;
        this.empRatePerHr = empRatePerHr;
        this.numWorkingDays = numWorkingDays;
        this.maxHoursPerMonth = maxHoursPerMonth;
    }

    public int multiCompany() {
        int empHrs = 0, totalEmpHrs = 8, totalWorkingDays = 0;
        while (totalEmpHrs < maxHoursPerMonth && totalWorkingDays < numWorkingDays) {
            totalWorkingDays++;
            int empCheck = (int) Math.floor(Math.random() * 10) % 3;
            switch (empCheck) {
                case IS_PART_TIME:
                    empHrs = 4;
                    break;
                case IS_FULL_TIME:
                    empHrs = 8;
                    break;
                default:
                    empHrs = 0;
            }
            totalEmpHrs += empHrs;
            System.out.println("Day:" + totalWorkingDays + " Emp Hr:" + empHrs);
        }
        totalEmpWage = totalEmpHrs * empRatePerHr;
        return empHrs;
    }

    public String toString() {
        return ("Total emp Wage for company :" + company + " is: " + totalEmpWage);
    }

    public static void main(String[] args) {
        System.out.println(" Welcome to EmployeeWage builder ");
        EmployeeWageOps dMart = new EmployeeWageOps("Dmart", 20, 20, 100);
        EmployeeWageOps reliance = new EmployeeWageOps("Reliance", 10, 20, 110);
        dMart.multiCompany();
        System.out.println(dMart);
        reliance.multiCompany();
        System.out.println(reliance);
    }

}

