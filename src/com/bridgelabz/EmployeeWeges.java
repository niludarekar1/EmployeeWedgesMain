package com.bridgelabz;

public class EmployeeWeges {


    private static int WAGE_PER_HOUR =20;
    private static  final int  IS_PART_TIME=1;
    private static  final int IS_FULL_TIME=2;
    private static final int WORK_DAY_MONTH=20;
    //private static final int MAX_HRS_IN_MONTH=10;

    public void EmpWedges(){
        int eWage = 0;
        int eHrs = 0;
        int totalEmpWages = 0;
        int totalEmpHrs=0;
        int totalWorkingDays=0;


        System.out.println("Employee Wages as Per Working Day in Month");

        for (int i = 1; i <= WORK_DAY_MONTH; i++) {


            double eCheck = Math.floor(Math.random() * 10) % 3; //0.0 -1.0

            //System.out.println(eCheck);

            switch ((int) eCheck) {
                case IS_PART_TIME:
                    System.out.println("Employee is Present on Part Time");
                    eHrs = 4;
                    break;
                case IS_FULL_TIME:
                    System.out.println("Employee is Present on Full Time");
                    eHrs = 8;
                    break;
                default:
                    System.out.println("Employee is Absent");
                    eHrs = 0;
            }
            eWage = WAGE_PER_HOUR * eHrs;
            totalEmpWages= eWage+totalEmpWages;
            System.out.println("Employee Wages Details :- " + eWage);//Wedges as per Hours
        }
        System.out.println("Total Employee Wages"+totalEmpWages);

    }

    public static void main(String[] args) {
        EmployeeWeges e1=new EmployeeWeges();
        e1.EmpWedges();
    }

}
