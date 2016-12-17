package com.javapgm1;

import javax.script.Invocable;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class MyFirstJavaProgram {

	public MyFirstJavaProgram() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) throws ScriptException, NoSuchMethodException {
		String[] months = 
			{"Jan",  "Feb",  "Mar",   "Apr",  "May", "Jun",   "Jul",  "Aug",
			 "Sep",  "Oct",  "Nov",  "Dec"};
			Double[] temper = 
			    {70.3, 70.8, 73.8, 77.0, 80.7, 83.4, 84.5, 84.4, 83.4, 80.2, 76.3, 72.0};
			Double[] humid = 
			    {69.0, 67.0, 66.0, 64.0, 66.0, 69.0, 67.0, 67.0, 70.0, 69.0, 69.0, 70.0};

			System.out.printf("            %7s%7s%7s%7s%7s%7s%7s%7s%7s%7s%7s%7s\n",
			    (Object[])months);
			System.out.printf("________________________________________"
			    + "________________________________________________________\n");
			System.out.printf("Temperature:%7.1f%7.1f%7.1f%7.1f%7.1f"
			    + "%7.1f%7.1f%7.1f%7.1f%7.1f%7.1f%7.1f\n", 
			    (Object[])temper);
			System.out.printf("   Humidity:%7.1f%7.1f%7.1f%7.1f%7.1f"
			    + "%7.1f%7.1f%7.1f%7.1f%7.1f%7.1f%7.1f\n",
			    (Object[])humid);
			
			
			System.out.printf("            %7s%7s%7s%7s%7s%7s%7s%7s%7s%7s%7s%7s\n", (Object[])months);
		}
	
		
		
	 }
	
		

	


