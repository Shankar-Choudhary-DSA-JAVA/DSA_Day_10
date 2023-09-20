package com.day_10_part_02_or_11_or_8;

public class Demo_36_FunctionsAdds10 {
	
	public static boolean login(String name, String password) {
		
		if(password=="123") {
			return true;
		}
		return false;
		
	}
	
	public static void uploadSvideo(String videoName) {
		System.out.println(videoName + "uploaded Successfully");
	}
	

	public static void main(String[] args) {
		
//1
//boolean canUpload = login("Prateek", "123"); // canUpload depend on name and passwords
//if(canUpload) { // if it is true then video uploads Successfully
		
		//2
		// login("Prateek", "123"); // canUpload depend on name and passwords
	//	if(login("Prateek", "123")) { // if it is true then video uploads Successfully
	
	//3
if(login("Prateek", "1234")==true) {		
		
	uploadSvideo("Maths Session 1 ");
	
}else {
	System.out.println("Invalid user name or passwords");
}
		
		
	}


}
