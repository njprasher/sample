package com.neeraj;

public class ExampleMain
{
    public static void main(String[] args)
    {
        int x[] = new int[5]; //{ };
        int y[] = { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100 };

        x[0]=100;
        x[1]=200;
        x[2]=300;
        x[3]=400;
        x[4]=500;

        for(int i = 0; i < x.length; i++){
            System.out.println("x[" + i +"]" +  x[i]);
        }

        for(int i = 0; i < y.length; i++){
            System.out.println("y[" + i +"]" +  y[i]);
        }

        ExampleMain main = new ExampleMain();
        int s = main.SumoOfArray(x);

        System.out.println("Sum of Array " + s);
    }

    public int SumoOfArray(int x[])
    {
        int sum = 0;

        for (int i = 0; i < x.length; i++)
        {
            sum = sum + x[i];
        }

        return (sum);
    }
}
