/*
		Write an application that accepts any number of String values from a user
		until they enter zzz or have entered 15 strings, and display them in
		ascending order (alphabetical order).

		Case should be a factor when ordering the values. For example, uppercase
		'B' comes before lowercase 'a'. 
*/

import java.util.*;

public class StringSort2						// Programming Exercise 9-1B
{
    public static void main(String[] args)
    {
        String[] ballOfYarn = new String[14];
        //final String QUIT = "zzz";
        int count = 0;
        int quantity = 0;
        int arrayLength = ballOfYarn.length;
        
        Arrays.fill(ballOfYarn,  "zzzzzzz");						//	Fills the array with dummy values
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter statements: ");
        ballOfYarn[count] = input.nextLine();
        
        //count = 1;
        while(!ballOfYarn[count].equals("zzz") && count < arrayLength)					//	Having trouble canceling out of the loop
        {
        	System.out.println("Enter statements: ");
        	ballOfYarn[count] = input.nextLine();
        	++count;
        }
        quantity = count;
        
        Arrays.sort(ballOfYarn, 0, quantity);
        
        for(count = 0; count < quantity; ++count)
        {
        	System.out.println(ballOfYarn[count] + " ");
        }
    }
}
