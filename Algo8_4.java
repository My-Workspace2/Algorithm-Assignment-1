public class Algo8_4 {

    public static void main(String[] args)
    {

    int[] numA = {5, 7, -2, 3, 4, 6, 7};
    int[] numB = {7, 8, -8, 2, 1, -9, 6};

    int[] num1 =new int[numA.length] ;


    for(int i=0; i<numB.length; i++)
    {
        num1[i] =numB[i] -numA[i] ;
    }

    System.out.print("numB/numA :{");

    for (int j=0;j<num1.length;j++)
    {
        System.out.print(num1[j]) ;
        System.out.print(" ") ;
    }
     System.out.print("}");

    }
    
}
