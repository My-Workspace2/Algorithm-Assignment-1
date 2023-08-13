import java.util.Scanner;

public class Algo1{

    private final static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        
        int num =scanner.nextInt();
        scanner.nextLine();


        int fib_num=2;
        int i =1;
        String output="0,1,";

        do{

        output += i ;
        output += "," ;
         int k =0 ;
         k =fib_num ;
         fib_num =fib_num + i ;
         i =k ;

         


        }


        while(i<= num);
        
        System.out.println("Febonachi sequence : "+ output);



    }



        
    }





