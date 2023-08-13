import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Algo8_1 {

    public static void main(String[] args)
    {
    
    int[] numA = {5, 7, -2, 3, 4, 6, 7};
    int[] numB = {7, 8, -8, 2, 1, -9, 6};

    int[] num1 =new int[4];
    ArrayList<Integer> dynamicArray = new ArrayList<>();

    

    int count=0 ;
    for(int i=0;i<numA.length; i++)
    {
        int a =numA[i];
        System.out.println("a"+a);
        for(int j=0; j<numB.length; j++)
        {
            
            if(a==numB[j] && !dynamicArray.contains(a) )
            {
                System.out.println("numB[j] "+numB[j]);
                dynamicArray.add(a);
                count++;
                break ;
            }
        }
    }

    String output1 ="numA numB : {" ;
    for (int j=0;j<dynamicArray.size();j++)
    {
       
         output1 += dynamicArray.get(j)+" " ;
    }
    output1 +="}";

    System.out.println(output1);
    
    }
}
