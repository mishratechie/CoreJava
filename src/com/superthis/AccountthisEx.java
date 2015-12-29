package com.superthis;

class AccountthisEx{
int a;
int b;
 
 public void setData(int a ,int b){
  //a = a;
  //b = b;
  this.a = a;
  this.b = b;


 }
 public void showData(){
   System.out.println("Value of A ="+a);
   System.out.println("Value of B ="+b);
 }
 public static void main(String args[]){
   AccountthisEx obj = new AccountthisEx();
   obj.setData(2,3);
   obj.showData();
 }
}