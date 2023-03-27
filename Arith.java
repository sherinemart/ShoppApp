class Arith
{
 public static void main(String args[])
{
 int a=100;
 int b=20;
try
{
 int c=a/b;
 System.out.println(c);
}
catch(ArithmeticException e)
{
System.out.println(e);
System.out.println("You cannot divide any number by zero");
}
 System.out.println("Rest of the code");
}
}
