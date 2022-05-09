package Loops;

import java.util.ArrayList;

public class Foreach {
	  String name;
	  int age;
	  String moblie;
      public Foreach(String name,int age,String mobile) {
    	  this.name=name;
    	  this.age=age;
    	  this.moblie=mobile;
      } 
	public static void main(String[] args) {
		 Foreach f=new Foreach("parthiban",21,"1234567890");
		 ArrayList al=new ArrayList<String>();
         al.add(f.name);
         al.add(f.age);
         al.add(f.moblie);
        System.out.println(al);
         for(Object o:al) {
        	 System.out.println(o);
         }
	}
	

}
