import java.util.Scanner;

public class Mini{

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int myNumber = (int) (Math.random()*100);

        int userNumber = 0;
        do{
            System.out.println("Guess the number : ");
            userNumber = sc.nextInt();

            if (userNumber == myNumber) {

                System.out.println("!..HAY IS A CORRECT ANSWER..!");
            }
            else if(userNumber > myNumber)
            {
                System.out.println("The number is too large");
            }
            else{
                System.out.println("The number is too small");
            }
        } 
        while (userNumber >= 0);

        System.out.println("My number was : ");
        System.out.println(myNumber);
    }
}