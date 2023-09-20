package com.day_10_part_02_or_11_or_8;

public class Demo_37_FunctionsAdds10 {
	
	
	//# In main method we can give any name to variables and in login method we can give any names to the variables
	//it will not matter, because both methods has their own memory addresses
	
	// this above concept is called pass by values

	// * In java we dont have pass by ref concepts we have only pass by values concepts
	
	// we will see what is happening at memory levels
	public static boolean login(String name, String password) {
		
//		if(password=="123") {// for String use .equals() methods
		if(password.equals("123")) {// for String use .equals() methods

			return false;
		}
		return true;
		
	}
	
	public static void uploadSvideo(String videoName) {
		System.out.println(videoName + "uploaded Successfully");
	}
	

	public static void main(String[] args) {
		
		String n = "prateek";
		String p = "1234";
boolean canUpload = login(n, p); // canUpload depend on name and passwords

if(canUpload) { // if it is true then video uploads Successfully
	uploadSvideo("Maths Session 1 ");
	
}else {
	System.out.println("Invalid user name or passwords");
}
		
		
	}


}
