package com.backend.day1;

public class ReturnFlow
{
    public static void main(String[] args)
 {
System.out.println("Main Start");
int ans= square(4);
System.out.println("Answer is: "+ans);
System.out.println("Main end");

}
static int square(int x)
{
System.out.println("Inside square");
int result=x*x;
return result;//after return is called the stack frame created for square() gets destroyed
}
}