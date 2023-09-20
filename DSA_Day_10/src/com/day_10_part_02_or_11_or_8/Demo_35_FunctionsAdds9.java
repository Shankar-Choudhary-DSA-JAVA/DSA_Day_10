package com.day_10_part_02_or_11_or_8;

public class Demo_35_FunctionsAdds9 {
	
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
		
		String name = "prateek";
		String password = "1234";
boolean canUpload = login(name, password); // canUpload depend on name and passwords

if(canUpload) { // if it is true then video uploads Successfully
	uploadSvideo("Maths Session 1 ");
	
}else {
	System.out.println("Invalid user name or passwords");
}
		
		
	}


}
