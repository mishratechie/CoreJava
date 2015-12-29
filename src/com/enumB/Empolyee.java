package com.enumB;



//package com.enumB;

public enum Empolyee {
 
	//Name(code,"address")
	John(21,"California"), Tom(177,"India"), Sant(23,null), Ram(24), Etc(25);
 
 //Declaring two variables to store code and address
 private int code;
 private String address;
 
 //protected or public access modifier is not allowed for Enum Constructor
 //Enum Employee Constructor with one Parameter
   
  Empolyee(int c) {
	   code = c;
}
  
  //Enum Employee Constructor with two Parameter //code =empID
  Empolyee(int empId,String address) {
   code = empId;
   this.address = address;
 }
 
  //Method to return code
 public int getCode() {
   return code;
 }
  //Method to return address
 public String getAddress() {
	   return address;
	 }
}

