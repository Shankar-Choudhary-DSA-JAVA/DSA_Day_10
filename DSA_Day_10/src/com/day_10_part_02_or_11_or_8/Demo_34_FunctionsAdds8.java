package com.day_10_part_02_or_11_or_8;

public class Demo_34_FunctionsAdds8 {

	public static int add(int a, int b) {
		// helper methods can return and can print both can be done here
		//System.out.println(a+b);
      return a+b;	
      
 // alwys use return not sysout, because then we can check the conditions as well in main methods
      
      // after return we cant print anything, because it says go back
	}

	public static void main(String[] args) { // main methods

		
		
    //System.out.println(add(900, 100));
		int res = add(900, 100);
		
//		if(res % 2 == 0) {
//			System.out.println("Even");
//		}
		
		//or
		
		System.out.println(res % 2 == 0 ? "Even" : "Odd");
			System.out.println(res);
		}


}
