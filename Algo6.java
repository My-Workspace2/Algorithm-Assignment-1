import java.util.Scanner;

public class Algo6 {

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

        for (int i=0;i<words.length/2-p; i++)
        {
            String k;

            k =words[i] ;
            words[i] = words[j] ;
            words[j]=k ;
            j--;
            

        }

        String revSentence ="";

        for (int i=0;i<words.length;i++)
        {
            revSentence +=words[i] ;
            revSentence +=" " ;
        }

        System.out.println(revSentence) ;

    }

    while(true) ;




        




        
    

    }
    
}
