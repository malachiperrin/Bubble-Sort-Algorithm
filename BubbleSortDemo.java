// Filename: BubbleSortDemo.java
// Author: Malachi
// Date: 2/12/19

import java.util.*;

public class BubbleSortDemo
{
    public static void main(String[] args)
    {
        // Variables and constants
        int[] someNums = new int[5];
        int comparisonsToMake = someNums.length - 1;
        Scanner keyboard = new Scanner(System.in);
        int a, b, temp;

        // for loop that will ask the user to enter up to 5 numbers, we store those numbers in our someNums array
        for(a = 0; a < someNums.length; a++)
        {
            System.out.print("Enter number " + (a + 1) + " >> ");
            someNums[a] = keyboard.nextInt();
        }

        // Calls the display method which accepts the array and the number of iterations the sort loop has done so far
        display(someNums, 0);

        // Bubble sort algorithm
        for(a = 0; a < someNums.length - 1; a++)
        {
            for(b = 0; b < comparisonsToMake; b++)
            {
                if(someNums[b] > someNums[b + 1])
                {
                    temp = someNums[b];
                    someNums[b] = someNums[b + 1];
                    someNums[b + 1] = temp;
                }
            } // b for loop is finished
            display(someNums, (a + 1));
            --comparisonsToMake;
        }
    }

    public static void display(int[] someNums, int a)
    {
        System.out.print("Iteration " + a + ": ");
        // for loop simply displays all 5 array values
        for(int x = 0; x < someNums.length; x++)
        System.out.print(someNums[x] + " ");
        System.out.println();
    }
}
