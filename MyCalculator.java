package week1.day2;

public class MyCalculator {
	public static void main(String[] args) {
		Calculator calc=new Calculator();
		System.out.println(calc.add(24, 36, 50));
		System.out.println(calc.sub(30, 20));
		System.out.println(calc.mul(30, 10));
		System.out.println(calc.div(10.5f, 5.5f));
	}
}