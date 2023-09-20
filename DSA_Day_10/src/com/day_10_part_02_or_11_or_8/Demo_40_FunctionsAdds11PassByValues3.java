package com.day_10_part_02_or_11_or_8;

public class Demo_40_FunctionsAdds11PassByValues3 {
	
	
	//# In main method we can give any name to variables and in login method we can give any names to the variables
	//it will not matter, because both methods has their own memory addresses
	
	// this above concept is called pass by values

	// * In java we dont have pass by ref concepts we have only pass by values concepts
	
	// we will see what is happening at memory levels
	// here we will see pass by values concepts
	
	
	//* while calling func and copy the data is known as Pass by values
	// this is called pass by values
	// in pass by values the data gets copied in to the new memory when a func is called / executed
	public static void paisaDouble(int money) {
		money = 2*money; // money is a copy of m
		System.out.println("paisa expected from double Schemes: " +money);
	}
	
	
//	# pass by values means we are passing the copy of data from one func to another func, 
//	we are not passing actual data we only pass copy of the data
	
	// how to double money
	// in pass by values the data gets copied in to the new memory when a func is called / executed

	public static int paisaDoubleJoinScaler(int money) {
		money = 2*money;// money is a copy of m
		return money;

//* return gives you updated values and syso just print the actual values
// in java everythings is pass by values, means all func copy the data from another funcs using arguments
	}
	
	
	public static void main(String[] args) {
		int m =100; //pass by values
		paisaDouble(m);
//		m=paisaDoubleJoinScaler(m); // here we are resigning a new values
		
		int ret=paisaDoubleJoinScaler(m); // here we are resigning a new values

//		System.out.println("Actually you got money : "+ m);

		System.out.println("Actually you got money : "+ ret);

		
		
		
		
//		*functions are created or stored in Stack memory
//		 * memory is created only at the time of memory calling
//		 * when functions execution becomes over the corresponding memory also gets destroyed
//that is why actual is 100 and scheme money is 200rs




    		
	}
	
}
