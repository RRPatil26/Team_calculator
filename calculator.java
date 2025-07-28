public class calculator
{
    public int multiply(int a, int b) {
        return a * b;
    }
public static void main(String args[])
{
System.out.println("Calculator Program By Team");
Scanner sc=new Scanner(System.in);
Calculator calc = new Calculator();
System.out.println("Enter 1st number for multiplication:");
int a=sc.nextInt();
System.out.println("Enter 2nd number for multiplication:");
int b=sc.nextInt();
int result = calc.multiply(a, b);
System.out.println("Multiplication Result: " + result);
System.out.println("**************************************************");

}
}