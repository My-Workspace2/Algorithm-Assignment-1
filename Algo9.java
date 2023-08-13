import java.util.Scanner;

public class Algo9 {

     private final static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args)
    {
        String word ;
        do{

            System.out.printf("Enter a word : ");
            word =scanner.nextLine();

            String[] words = word.split(" ") ;

            if(words.length>1 || word.isBlank()) 
            {
                System.out.println("Enter only a word") ;
                continue ;
            }

            char[] chars =word.toCharArray();

            int j=chars.length-1 ;
           
            int charCount=0;
            for (int i=0;i<chars.length/2; i++)
            {
                if(chars[i] == chars[j]) {
                     charCount++ ;
                }
                j--;
                
            }

            if(charCount==chars.length/2)
            {
                System.out.println("Entered word is palindrom") ;
            }
            else{
                System.out.println("Entered word is not palindrom") ;
            }

        }

        while(word.isBlank()) ;



        
    }
    
}
