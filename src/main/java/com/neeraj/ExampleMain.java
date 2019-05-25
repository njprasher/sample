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

        int z[] = main.ReverseTheArray(x);

        System.out.println(z[0]);

        String s1= "Hello";
        String s2=s1;

        s2 = s2.concat("added");

        String s3 = new String("Hello");

        System.out.println(s1);
        System.out.println(s2);

        String s4 = "Lambton College";

        if (s1 == s2)
        {
            System.out.println("S1 = S2");
        }
        else
            {
                System.out.println("S1 != S2");
            }

        if (s1 == s3)
        {
            System.out.println("S1 = S3");
        }
        else
            {
                System.out.println("S1 != S3");
            }

        if (s1.equals(s3))
        {
            System.out.println("S1 = S3");
        }
        else
        {
            System.out.println("S1 != S3");
        }

        char character9 = s4.charAt(9);

        System.out.println(character9);

        boolean contains = s4.contains("Lamb");

        System.out.println(contains);

        if (contains)
        {
            System.out.println("It contains lamb");
        }
        else
        {
            System.out.println("It doesn't contains lamb");
        }

        boolean endingwithcollege = s4.endsWith("College");

        if (endingwithcollege)
        {
            System.out.println("It ends with College");
        }
        else
        {
            System.out.println("It doesn't ends with College");
        }
    }

    public int SumoOfArray(int[] x)
    {
        int sum = 0;

        for (int i = 0; i < x.length; i++)
        {
            sum = sum + x[i];
        }

        return (sum);
    }

    public int[] ReverseTheArray(int[] arr)
    {
        int rev[] = new int[arr.length];

        for (int j = 0, i = arr.length - 1 ; i >= 0 ;i--)
        {

                rev[j++]=arr[i];

        }

        return (rev);
    }
}
