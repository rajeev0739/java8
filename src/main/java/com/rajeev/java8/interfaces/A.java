package com.rajeev.java8.interfaces;

public interface A {
	
	
	
	   void method1(String str);
	   
	   
	
	   default void foo(){
	       System.out.println("Calling A.foo()");
	    }
	
	   default void foo1(){
	       System.out.println("Calling A.foo()");
	    }default void foo2(){
	        System.out.println("Calling A.foo()");
	    }
	    
	    
     
	    static boolean isNull(String str) {
			System.out.println("Interface Null Check");

			return str == null ? true : "".equals(str) ? true : false;
		}
	    
	     static void main(String[] args) {
	    	System.out.println("Interface main method");
		}
	    
	     // static void m2(); static method w/o body can't define
	
}
