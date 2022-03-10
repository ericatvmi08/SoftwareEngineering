import java.util.Scanner;

public class SoftwareEngineering
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int x;      //1st input number
        int y;      //2nd input number
        int z;      //result of x and y

        System.out.print("Enter the 1st integer: ");
        x = input.nextInt();

        System.out.print("Enter the 2nd integer: ");
        y = input.nextInt();

        z = x + y;
        System.out.println("The result of your numbers added is: " + z + ".");
    }
}
