import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Algo8_2 {

    public static void main(String[] args)
    {
    
    int[] numA = {5, 7, -2, 3, 4, 6, 7};
    int[] numB = {7, 8, -8, 2, 1, -9, 6};

    
    ArrayList<Integer> dynamicArray = new ArrayList<>();


    for(int i=0;i<numA.length; i++)
    {
        if(!dynamicArray.contains(numA[i]))
        {
           dynamicArray.add(numA[i]);
        }
        

    }

    for(int j=0;j<numB.length; j++)
    {
        if(!dynamicArray.contains(numB[j]))
        {
           dynamicArray.add(numB[j]);
        }
    }

    


    String output2 ="numA numB : {" ;
    for (int j=0;j<dynamicArray.size();j++)
    {
       
         output2 += dynamicArray.get(j)+" " ;
    }
    output2 +="}";

    System.out.println(output2);
    
    }
}
