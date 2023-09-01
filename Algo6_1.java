import java.util.Scanner;

public class Algo6_1 {

     private final static Scanner scanner = new Scanner(System.in);

     public static void main(String[] args)
     {

        loop:
        do{

        System.out.println("Enter a sentence : ") ;
        String input = scanner.nextLine();
        char[] chars =input.strip().toCharArray();

        if (chars.length==0)
        {
            System.out.println("text can t be empty") ;
            continue;
        }

        int wordcount=1 ;

        for(int i=0;i<chars.length; i++)
        {
               if(chars[i]>128)
               {
                   System.out.println("non ASCII") ;
                   continue loop;
               }

               if(chars[i]==' ')
               {
                wordcount++ ;
               }
        }

        System.out.println("word count : "+wordcount) ;

        String[] words =new String[wordcount];

        int k=0; 
        int p=0;
        for(int j=0;j<chars.length; j++)
        {
            if(Character.isSpaceChar(chars[j]))
            {
                 String word = input.substring(k, j);
                 k =j+1 ;
                // words[p] =word ;
                 //p++ ;
                 words[--wordcount] =word ;
            }
        }

        String word =input.substring((k));
        words[0] =word ;

        for(int j=0;j<words.length; j++)
        {
             System.out.println(words[j]) ;
        }

        System.out.println(String.join(" ",words)) ;

       }
       while(true);

     }


}
