import java.util.Scanner;

public class Algo10 {

    private final static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args)
    {
        String TeleNum;

        do{

        System.out.print("Enter the phone number : ");
        TeleNum =scanner.nextLine();

        if(TeleNum.isBlank())
        {
            System.out.println("Entered number is empty ");
            continue;
        }

      

        if(TeleNum.substring(0,4).equals("+94 ") )
        {
            System.out.println("inside if ");
            int valid =1;
            for(int i =4; i<TeleNum.length();i++)
            {
                if(TeleNum.charAt(6)==' ' || TeleNum.charAt(10)==' ')
                {
                    continue;
                }

                else if (TeleNum.charAt(6)!=' ' || TeleNum.charAt(6)!=' '){
                    System.out.println("Invalid phone number.");
                    valid =0;
                    break;
                    
                }


                if (!Character.isDigit(TeleNum.charAt(i))) {
                    System.out.println("Invalid phone number.");
                    valid =0;
                    break;

                }

            }

            if(valid==1)
            {
                System.out.println("Number is validated ");
            }

        }
        else if((TeleNum.charAt(0) =='0' )&&  (TeleNum.charAt(3)=='-' ))
        {

            int valid1 =1;
            for(int i =0; i<TeleNum.length();i++)
            {
                if(i==0 || i==3)
                {
                    continue;
                }


                if (!Character.isDigit(TeleNum.charAt(i))) {
                    System.out.println("Invalid phone number");
                    valid1 =0;
                    break;

                }

            }
            if(valid1==1)
            {
                System.out.println("Number is validated ");
            }
            
        }

        else{
            
            System.out.println("Invalid phone number");
        }

    }

    while(TeleNum.isBlank());
    
}
}
