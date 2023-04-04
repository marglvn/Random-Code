import java.util.Scanner;

class Dollars
{
    public static void main(String[] args)
    {
        final int WASHINGTON = 1;
        final int LINCOLN = 5;
        final int HAMILTON = 10;
        final int JACKSON = 20;
        int num, one, five, fiveLeftover, tenner, tenLeftover, twenty, twentyLeftover;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the dollar amount you want converted >> ");
        num = input.nextInt();

        twenty = num / JACKSON;
        twentyLeftover = num % JACKSON;
        tenner = twentyLeftover / HAMILTON;
        tenLeftover = twentyLeftover % HAMILTON;
        five = tenLeftover / LINCOLN;
        fiveLeftover = tenLeftover % LINCOLN;
        one = fiveLeftover / WASHINGTON;

        //$452 converted is 22 $20s, 1 $10s, 0 $5s, and 2 $1s

        System.out.println("$" + num + " converted is " + twenty + " $20s, " +
        tenner + " $10s, " + five + " $5s, and " + one + " $1s");
    }
}