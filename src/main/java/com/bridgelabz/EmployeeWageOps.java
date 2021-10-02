package com.bridgelabz;

/**
 * Employee Wage Program By Using ops Concept day-9
 *
 * @author : Anji Raj Ardula
 * @version : 16.0
 * @since : 02/10/2021
 */

public class EmployeeWageOps {
    public static final int IS_FULL_TIME = 1;
    public static final int IS_PART_TIME = 2;
    public static double empCheck = Math.floor(Math.random() * 10) % 3;

    public int multiCompany(String company, int empRatePerHr, int numWorkingDays, int maxHrs) {
        int empHrs = 0, totalEmpHrs = 8, totalWorkingDays = 0;
        while (totalEmpHrs < maxHrs && totalWorkingDays < numWorkingDays) {
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
        }
        int totalEmpWage = totalEmpHrs * empRatePerHr;
        System.out.println("Company Name : " + company);
        System.out.println("Emp Rate perHr : " + empRatePerHr);
        System.out.println("Number Of Working Days : " + numWorkingDays);
        System.out.println("Max Hours : " + maxHrs);
        System.out.println("Total EmpWage : " + totalEmpWage);
        return totalEmpWage;
    }

    public static void main(String[] args) {
        System.out.println("Welcome to EmployeeWage builder");
        EmployeeWageOps dMart = new EmployeeWageOps();
        dMart.multiCompany("Dmart", 25, 22, 100);
        EmployeeWageOps relianceDigital = new EmployeeWageOps();
        relianceDigital.multiCompany("Reliance Digital", 40, 25, 200);
    }
}


