public class calculator
{
    public int multiply(int a, int b) {
        return a * b;
    }
    public int subtract(int a, int b) {
        return a - b;
    }
    public void addition(int a, int b){
	return 1 + b;
    }
public static void main(String args[])
{
System.out.println("Calculator Program By Team");
Scanner sc=new Scanner(System.in);
System.out.println("Enter 1st number:");
int a=sc.nextInt();
System.out.println("Enter 2nd number:");
int b=sc.nextInt();
Calculator calc = new Calculator();
int result = calc.multiply(a, b);
int result1 = calc.subtract(a,b);
int result2 = calc.addition(a,b);
System.out.println("Multiplication Result: " + result);
System.out.println("Subtraction Result: " + result1);
System.out.println("Subtraction Result: " + result1);("**************************************************");
}
}