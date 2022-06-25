import java.util.Date;

public class Calculator {
	int square =2;
	int cube = 3;
	double sqrnum;
	double cubenum;
	int fact;
	int num;
	Date d = new Date();
//	Default Constructor
	Calculator(){
		System.out.println(d+"\n");
		System.out.println("Inside Default Constructor");
	}
//	Parameterize 
	Calculator(int num){
		System.out.println("Inside Parameterized Constructor");
		this.num=num;
		calculateSquare();
		calculateCube();
		calculateFactorial();
		calculateTable();
	} 
	void  calculateSquare(int num){
		this.num=num;
		sqrnum=Math.pow(num, square);
		System.out.println("Square  root of "+num+" is "+sqrnum);
	} 
	double calculateSquare() {
		sqrnum=Math.pow(num, square);
		return sqrnum;
	}
	void calculateCube(int num) {
		this.num=num;
		cubenum=Math.pow(num,cube);
		System.out.println("Cube of "+num+" is "+cubenum);
	}
	double calculateCube() {
		cubenum=Math.pow(num, cube);
		return cubenum;
	}
	void calculateFactorial(int num) {
		this.num=num;
		int j=1;
		for(int i=1;i<=num;i++) {
			j=j*i;
		}
		fact=j;
		System.out.println("Factorial of  "+num+" is "+fact);
	}
	int calculateFactorial() {
		int j=1;
		for(int i=1;i<=this.num;i++) {
			j=j*i;
		}
		fact=j;
		return fact;
	}
	void calculateTable(int num) {
		System.out.println("The multiplication Table of "+num);
		for(int i=1;i<=10;i++) {
			System.out.println(num+" x "+i+" = "+num*i);
		}
	}
	void calculateTable() {
		System.out.println("The Multiplication Table of "+this.num);
		for(int i=1;i<=10;i++) {
			System.out.println(this.num+" x "+ i +" = "+this.num*i);
		}
	}
	void show() {
		System.out.println("Square  root of "+num+" is "+sqrnum);
		System.out.println("Cube root of "+num+" is "+cubenum);
		System.out.println("Factorial of "+num+" is "+fact);
	}
}
