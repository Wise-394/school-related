package una;

import java.util.Scanner;

public class Main {
public static String name = "renniel";
public static int id = 1;
//salary
public static float salary = 30000;
public static float riceAllowance = 1000;
public static float fareAllowance = 1000;
//deductions
public static float sss = 500;
public static float philhealth = 500;
public static float pagibig = 500;
public static float sssLoan = 1000;
public static float tax = 0.12f;
public static int absent = 1;

public static void main(String[] args) {
	Scanner scn = new Scanner(System.in);

	System.out.println("1: SHOW GROSS PAY \n2:SHOW DEDUCTION \n3;CALCULATE NET PAY");
	int operation = scn.nextInt();
	if(operation == 1) 
	{
	System.out.println("gross pay: " + grossPay(salary,riceAllowance,fareAllowance));	
	}
	if(operation == 2) 
	{
		System.out.println("deduction is: "+ deduction(sss,philhealth,pagibig,sssLoan,tax,absent)); 
	}
	if(operation == 3)
	{
		System.out.println("net pay is: " + total());
	}


}
public static float grossPay(float salary, float riceAllowance, float fareAllowance)
{
	return salary + riceAllowance + fareAllowance;
}
public static float deduction(float sss,float phil,float pagibig,float sssloan,float tax , float absent) 
{
	return sss + phil + sssloan + tax + absent;
}
public static float total() 
{
	return grossPay(salary, riceAllowance, fareAllowance) - deduction(sss, philhealth, pagibig, sssLoan, tax, absent);
}

}



