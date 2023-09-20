package com.day_10_part_02_or_11_or_8;

public class Demo_39_FunctionsAdds11PassByValues2 {
	
	
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
		int m =100; //pass by values
		paisaDouble(m);
		System.out.println("Actually you got money : "+ m);
		
		
		
		
		
//		*functions are created or stored in Stack memory
//		 * memory is created only at the time of memory calling
//		 * when functions execution becomes over the corresponding memory also gets destroyed
//that is why actual is 100 and scheme money is 200rs




    		
	}
	
}
