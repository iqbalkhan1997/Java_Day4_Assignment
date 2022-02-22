package com.blz.employewage;

public class EmployeWage {
        public static final int FULL_TIME=1;
        public static final int PART_TIME=2;
        public static final int EMP_WAGE_PER_HR=20;
        public static final int MAX_WORKING_DAYS=20;
        public static final int MAX_WORKING_HRS=100;
        public static final int PROBLEMATIC_SCENARIO=36;
    public static void main(String[] args) {
        int empHr=0;
        int empCheck=0;
        int totalWorkingDays=0,totalEmpHrs=0,totalEmpWage=0;
	    System.out.println("Welcome to Employee Wage Computation Program");

        while(totalEmpHrs < MAX_WORKING_HRS && totalWorkingDays < MAX_WORKING_DAYS)
        {
            if (totalEmpHrs==PROBLEMATIC_SCENARIO) {
                empCheck = PART_TIME;
            }
            else {
                empCheck = (int) (Math.random() * 10) % 3;
            }

                switch (empCheck) {
                    case FULL_TIME:
                        System.out.println("Employee is working Full Time  on day " + totalWorkingDays);
                        empHr = 8;
                        break;
                    case PART_TIME:
                        System.out.println("Employee is working Part Time  on day " + totalWorkingDays);
                        empHr = 4;
                        break;
                    default:
                        System.out.println("Employee is Absent on day " + totalWorkingDays);
                        empHr=0;
                }
            totalWorkingDays++;
            totalEmpHrs =+ empHr + totalEmpHrs;
            }
            totalEmpWage = EMP_WAGE_PER_HR * totalEmpHrs;
            System.out.println("Employee worked for "+totalWorkingDays+" days "+totalEmpHrs+" hours");
            System.out.println("Employe's Monthly wage is " + totalEmpWage);
    }
}
