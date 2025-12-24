package com.backend.day1;

public class SlowMethodDemo {
    public static void main(String[] args)
{
   System.out.println("Before slow method");
   slowmethod();
   System.out.println("After slow method");
}
static void slowmethod()
{
    try {
        Thread.sleep(3000);//pretend db call
    }catch (Exception e){}
}
}





