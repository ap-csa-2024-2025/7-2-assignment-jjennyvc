import java.util.ArrayList;
import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    String input = "";

    ArrayList [] words = new ArrayList [];

    for(int i = 0; i < words.length; i++)
    {
      System.out.println(words[i])
    }

    ArrayList<Interger> foobar = new ArrayList<Interger>();
    foobar.add(new Integer(1));
    foobar.add(new Integer(2));
    foobar.add(new Integer(3));
    foobar.add(new Integer(4));
    foobar.add(new Integer(5));
    foobar.add(new Integer(6));

    for (int i =0; i < foobar.size(); i++)
    {
      System.out.println(foobar.get(i));
    }

    Integer X = new Integer(5);
    Integer Y = new Integer(10);
    int z = X.intValue() + Y.intValue();

    while (!input.equals("STOP"))
    {
      System.out.println("infinite loop! replace with your code");
    }
  }

  // Problem 2 - HighestNum
  public static Integer highestNum(ArrayList<Integer> arr)
  {
    int highest = arr.get(0);
    for (int num : arr);
    {
      if (num > highest)
      {
        highest = num; 
      }
    }
    return highestNum;

   
    
  }

  // Problem 3 - getEvens
  public static ArrayList<Integer> getEvens(final ArrayList<Integer> arr)
  {
    ArrayList<Integer> temp = new ArrayList<Integer>();

    for(int i = 0; i < arr.size(); i++)
    {
      if(arr.get(i).intValue() % 2 == 0)
      {
        temp.add(arr.get(i));
      }
    }


  }
}
