import java.util.Scanner;

public class Algo7 {

     private final static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {


        do {
        String sentence;
        System.out.print("Enter thr sentences : ") ;
        sentence =scanner.nextLine();

        if (sentence.isBlank())
        {
            continue ;
        }
        String[] words = sentence.split(" ") ;

        int j=words.length-1 ;

        int p =0;
        if(words.length%2==0)
        {
           p=1 ;
        }

        

        String minLenWord=words[0];
        String maxLenWord ="";

        for (int i=0;i<words.length;i++)
        {
            if (minLenWord.length()> words[i].length())
            {
                minLenWord =words[i];
            }

            if (maxLenWord.length()< words[i].length())
            {
                maxLenWord =words[i];
            }

           
        }

        System.out.printf("max len word is %s and min len word is %s\n",maxLenWord,minLenWord);

        

    }

    while(true) ;




        




        
    

    }
    
}
