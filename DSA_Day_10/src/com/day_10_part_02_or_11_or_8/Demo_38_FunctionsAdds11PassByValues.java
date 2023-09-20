package com.day_10_part_02_or_11_or_8;

public class Demo_38_FunctionsAdds11PassByValues {
	
	
	//# In main method we can give any name to variables and in login method we can give any names to the variables
	//it will not matter, because both methods has their own memory addresses
	
	// this above concept is called pass by values

	// * In java we dont have pass by ref concepts we have only pass by values concepts
	
	// we will see what is happening at memory levels
	
	// here we will see pass by values concepts
	
	public static void paisaDouble(int money) {
		money = 2*money;
		System.out.println("paisa expected from double Schemes: " +money);
	}
	public static void main(String[] args) {
		int money =100;
		paisaDouble(money);
		System.out.println("Actually you got money : "+ money);
    		
	}
	
}
