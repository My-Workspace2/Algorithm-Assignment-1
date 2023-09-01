import java.util.Scanner;

public class Algo5 {

    private final static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        String text;
        loop:
        do{
        System.out.print("Enter thr text : ") ;
        text =scanner.nextLine().strip();  // here we want to validate the ASCII as well

        if(text.isBlank())
        {
            continue;
        }

        char[] chars =text.toCharArray() ; // ASCII should be in 0-128  there for need to cheack the chars[i] <128 as well
                                        
        int j=chars.length-1 ;

        int p =0;
        if(chars.length%2==0)
        {
           p=1 ;
        }

        for (int i=0;i<chars.length/2-p; i++)
        {
            
             char k;
            k =chars[i] ;
            chars[i] = chars[j] ;
            chars[j]=k ;
            j--;
            

        }

        String revString = new String(chars);
        System.out.println(revString);

    }

    while(true);

    

       



    }
    
}
