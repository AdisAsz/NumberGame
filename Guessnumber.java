import java.util.*;
public class Guessnumber {
    public static void main(String[] args){
        Random rand=new Random();
        Scanner scan=new Scanner(System.in);
        System.out.print("Give me a range: ");
        int range=scan.nextInt();
        int random1=rand.nextInt(range);

        System.out.println("How many tries");
        int try1=scan.nextInt();
        Boolean guesses=false;
        System.out.println(random1);
        while(try1>0){
            System.out.println("Give me the number");
            int shoot=scan.nextInt();
            if(shoot==random1){
                guesses=true;
                break;
            }
            else{
                if(shoot>random1){
                    System.out.println("Too many");
                    try1--;
                }
                else{
                    System.out.println("Too small");
                    try1--;
                }
            }
        }
        if(guesses==true){
            System.out.println("You did it "+random1);
        }
        else{
            System.out.println("You lost "+random1);
        }
    }

}
