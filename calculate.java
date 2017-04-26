import java.util.ArrayList;
import java.util.Scanner;

public class calculate
{

    public static void main(String[] args)
    {

        Scanner scan = new Scanner(System.in);
        int size;
        int values;
        int counter = 0;
        ArrayList<Integer> ar = new ArrayList<Integer>();

        System.out.println("Please enter the size of the array");
        size = scan.nextInt();

        while (counter < size)
        {

            System.out.println("Please enter the number you want to add");
            values = scan.nextInt();
            ar.add(values);
            counter++;

        }
        
        scan.close();

        System.out
                .println("your total is " + calculate.addArray(ar) + " and the size of the array is " + size);

    }

    public static int addArray(ArrayList<Integer> array)
    {

        int add = 0;

        if (array != null)
        {

            for (int i = 0; i < array.size(); i++)
            {

                add += array.get(i);
            }
        }

        return add;

    }

}
