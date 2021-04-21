import java.util.Scanner;
import java.util.*;

public class Question5
{
  public static void main(String[] args)
  {
    /**
     * Prompt the user for number. This input indicates the number of integers the user will be entering next. 
     * Print out the mode (highest occurrence) from the set of integers. 
     *    e.g.
     *     > 5
     *     > 2
     *     > 4
     *     > 1
     *     > 3
     *     > 4
     *     4
     * 
     *    e.g.
     *     > 4
     *     > 2
     *     > 2
     *     > 3
     *     > 3
     *     2
     * Hint: Use a loop to get input. Use another 2 loops to find the mode
     */
     
    Scanner in = new Scanner(System.in);
    // System.out.print("Enter a number: ");
    int totalint = in.nextInt();
    int max = 0, mode = 0, count = 0;
    List<Integer> l1 = new ArrayList<Integer>(); 
    for(int x = 0; x < totalint; x++)
    {
      // System.out.print("Please enter another number: ");
      int numbs = in.nextInt();
      l1.add(numbs);
    }
    
    for (int x : l1)
    {
      // System.out.println(x);
      for (int y : l1)
      {
        // System.out.println(y);
        if(y == x)
        {
          count += 1;
        }
      }
      if (count > max)
      {
        max = count;
        mode = x;
      }
      count = 0;
    }

    System.out.println(mode);
  }
}
