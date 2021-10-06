package oop;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner input = new Scanner (System.in);
        System.out.print("Enter your location: ");
        String area= input.next();
        System.out.println("Your area is: "+area);
        Balaganj b = new Balaganj();
        System.out.println("Enter your wheels of vehicle:");
        int wheel=input.nextInt();
        if(wheel==3)
        {
            b.Mechanic(wheel);
        }
    }
}
