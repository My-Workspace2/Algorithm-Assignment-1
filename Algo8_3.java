public class Algo8_3 {

    public static void main(String[] args)
    {

    int[] numA = {5, 7, -2, 3, 4, 6, 7};
    int[] numB = {7, 8, -8, 2, 1, -9, 6};

    int[] num1 =new int[numA.length] ;


    for(int i=0; i<numA.length; i++)
    {
        num1[i] =numA[i] - numB[i] ;
    }

    System.out.print("numA/numB :{");

    for (int j=0;j<num1.length;j++)
    {
        System.out.print(num1[j]) ;
        System.out.print(" ") ;
    }
     System.out.print("}");

    }
    
}
