package bishwo;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        /*System.out.print("Enter your location: ");
        String area= input.next();
        System.out.println("Your area is: "+area);

        System.out.print("Enter your wheels of vehichel:");
        int wheel = input.nextInt();
        if(wheel == 3)
        {
            Balaganj b= new Balaganj();
            b.Mechanic(wheel);
        }*/

        MechanicInfo m = new MechanicInfo();
        m.addMechanicInfo();
    }
}
