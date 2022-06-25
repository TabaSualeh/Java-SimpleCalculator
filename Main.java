
public class Main {

	public static void main(String[] args) {
		Calculator c= new Calculator();
		c.calculateSquare(2);
		c.calculateCube(6);
		c.calculateFactorial(5);
		c.calculateTable(9);
		System.out.println();
		Calculator c1=new Calculator(4);
		c1.show();

	}

}
