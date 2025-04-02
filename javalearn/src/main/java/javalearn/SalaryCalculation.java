//simple type casting, wrapper,boxing and unboxing program//
package javalearn;

import java.util.HashMap;
public class SalaryCalculation {

	public static void main(String[] args) 
	{
		// Step 1: Create a HashMap to store employee salaries (Autoboxing occurs here)
        HashMap<String, Integer> salaryMap = new HashMap<>();

        // Primitive double salary (Type casting from double to int before storing)
        double johnSalary = 55000.75;
        double emmaSalary = 62000.60;

        // Type casting double to int (to store in HashMap as Integer)
        salaryMap.put("John", (int) johnSalary);  // Autoboxing int -> Integer
        salaryMap.put("Emma", (int) emmaSalary);  // Autoboxing int -> Integer

        // Step 2: Retrieve salaries (Unboxing Integer -> int)
        int johnStoredSalary = salaryMap.get("John");
        int emmaStoredSalary = salaryMap.get("Emma");

        // Step 3: Calculate bonus (Using type casting from float to double)
        float performanceBonus = 2600.75f;
        double johnFinalSalary = johnStoredSalary + (double) performanceBonus;  // Type casting float -> double
        double emmaFinalSalary = emmaStoredSalary + (double) performanceBonus;

        // Step 4: Display results
        System.out.println("John's Salary (Original): " + johnSalary);
        System.out.println("John's Stored Salary (Autoboxed & Type Casted): " + johnStoredSalary);
        System.out.println("John's Final Salary with Bonus: " + johnFinalSalary);

        System.out.println("\nEmma's Salary (Original): " + emmaSalary);
        System.out.println("Emma's Stored Salary (Autoboxed & Type Casted): " + emmaStoredSalary);
        System.out.println("Emma's Final Salary with Bonus: " + emmaFinalSalary);


	}

}
