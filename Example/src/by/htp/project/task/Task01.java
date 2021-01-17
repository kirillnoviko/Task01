package by.htp.project.task;

import java.util.Scanner;

public class Task01 {

	
	//  1. Вычислить значение выражения по формуле 
	//  (все переменные принимают действительные значения)
	public double valuefunc(double a, double b, double c) {
		double y = 0;
		y = (b + Math.sqrt(Math.pow(a, 2) + 4 * a * c)) / (2 * a) - Math.pow(a, 3) * c + Math.pow(b, -2);
		return y;
	}

	
	//	2. Вычислить значение выражения по формуле 
	//	(все переменные принимают действительные значения)	
	public double valuefunc(double a, double b, double c, double d) {
		double y = 0;
		y = ((a * b) / (c * d)) - ((a * b - c) / (c * d));
		return y;
	}

	
	//	3. Дана величина А, выражающая объем информации в байтах. Перевести А в более крупные
	//	единицы измерения информации.
	public void byteInBigDate(int b) {
		double temp = b;
		System.out.println("байт: " + temp);
		temp = temp / 1024;
		System.out.println("Kбайт: " + temp);
		temp = temp / 1024;
		System.out.println("Мбайт: " + temp);
		temp = temp / 1024;
		System.out.println("Гбайт: " + temp);
		temp = temp / 1024;
		System.out.println("Тбайт: " + temp);
	}

	
	// 	4. Составить программу сравнения двух чисел 1 и 2. Если 1 меньше 2 – вывести на экран цифру
	//	7, в противном случае – цифру 8.
	public void compareNumbers78(int a, int b) {
		if (a < b) {
			System.out.println(7);
		} else {
			System.out.println(8);
		}
	}

	
	//	5. Составить программу: определения наименьшего из двух чисел а и b.
	public int compareNumbers(int a, int b) {
		if (a > b) {
		return b;
		}else {
			return a;
		}
	}
	

	//	6. Даны два угла треугольника (в градусах). Определить, существует ли такой треугольник, и
	//	если да, то будет ли он прямоугольным.
	public void form(int a, int b) {
		if (a + b >= 180) {
			System.out.println(" такого треугольника не существует");
		} else if (a == 90 || b == 90 || a + b == 90) {
			System.out.println("треугольник прямоугольный");
		}
	}

	
	// 7. Подсчитать количество отрицательных среди чисел а, b, с.
	public int minusNumber(int a, int b, int c) {
		int count = 0;

		if (a < 0) {
			count++;
		}
		
		if (b < 0) {
			count++;
		}
		
		if (c < 0) {
			count++;
		}

		return count;
	}

	
	//	8. Заданы размеры А, В прямоугольного отверстия и размеры х, у, z кирпича. Определить,
	//	пройдет ли кирпич через отверстие.	
	public boolean brickArea(int a, int b, int x, int y, int z) {
		int count=0;
		
		if(x <= a || x <= b) {
			count++;
		}
		
		if(y <= a || y <= b) {
			count++;
		}
		
		if(z <= a || z <= b) {
			count++;
		}
		
		if(count < 2) {
			return false;
		}
		
		return true;
	}

	
	// 9. Вычислить значение функции:
	public void functionValue(int x) {
		double y = 0;
		
		if (x > 3) {
			y = 1 / (Math.pow(x, 3) + 6);
		} else {
			y = (Math.pow(x, 2)) - (3 * x) + 9;
		}
		
		System.out.println("y= " + y + "при х=" + x);
	}

	
	//	10. С помощью оператора while напишите программу вывода всех четных чисел в диапазоне
	//	от 2 до 100 включительно.
	public void outputNumbersBetween2and100() {
		int a = 2;
		
		while (a <= 100) {
			
			if (a % 2 == 0) {
				System.out.println(a);
			}
			
			a++;
		}
	}

	
	// 11. Вычислить значения функции на отрезке [а,b] c шагом h:
	public void functionValueWithStep(int a, int b, int h) {

		for (int i = a; i < b; i += h) {

			System.out.println("значение функции на промежутке [" + a + " , " + b + "]  с шагом h =" + h);
			
			if (i > 2) {
				System.out.println(" y = " + i);
			} else {
				System.out.println(" y = " + (-i));
			}
		}
	}

	
	//	12. Вывести на экран соответствий между символами и их численными обозначениями в
	//	памяти компьютера (Таблицу ASCII).
	public void tableASCII() {
		char ch;
		
		for (int i = 0; i < 256; i++) {
			ch = (char) i;
			System.out.println("number " + i + " : " + ch);
		}
	}

	
	//	13. Напишите программу, где пользователь вводит любое целое положительное число. А
	//	программа суммирует все числа от 1 до введенного пользователем числа.
	public int sumInput() {

		int num;
		int sum;
		Scanner sc;

		sum = 0;
		num = 0;
		sc = new Scanner(System.in);

		do {
			System.out.println("введите целое число:");
			num = sc.nextInt();
		} while (num < 0);

		sc.close();

		for (int i = 0; i <= num; i++) {
			sum += i;
		}

		return sum;

	}

	
	// 14. Требуется определить факториал числа, которое ввел пользователь.	
	public int factorial(int a) {
		if (a <= 1) {
			return 1;
		} else {
			return a * factorial(a - 1);
		}
	}

	
	// 15. Найти НОД двух целых положительных чисел.
	public int checkNOD(int a, int b) {
		int temp;
		int temp1;
		int d;

		d = 0;

		if (a >= b) {
			temp = a;
			temp1 = b;
		} else {
			temp = b;
			temp1 = a;
		}

		while (true) {
			if (temp % temp1 == 0) {
				return temp1;
			} else {
				d = temp1;
				temp1 = temp % temp1;
				temp = d;
			}
		}

	}
}
