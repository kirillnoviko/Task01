package by.htp.project.main;

import java.util.Random;

import by.htp.project.task.Task01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

	public static void main(String[] args) {
	
		Task01 a = new Task01();

		System.out.println(a.valuefunc(1,2,3));
		
		System.out.println(a.valuefunc(1,2,3,4));
		
		a.byteInBigDate(1000);
		
		a.compareNumbers78(14, 5);
		
		System.out.println(a.compareNumbers(56, 13));
		
		a.form(90, 30);
		
		System.out.println(a.minusNumber(0, -1, -7));
		
		System.out.println(a.brickArea(3,4,4,3,5));
		
		a.functionValue(4);
		
		a.outputNumbersBetween2and100();

		a.functionValueWithStep(-10,7,1);
		
		a.tableASCII();
		
		System.out.println(a.sumInput());
		
		System.out.println(a.factorial(5));
		
		System.out.println(a.checkNOD(6,8));
	}

}
