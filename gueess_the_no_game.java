import java.util.Random;
import java.util.Scanner;
import static java.lang.System.*;

class take_input{
    int count=0;
    int number;
    public take_input() {
        Random n =new Random();
        number=n.nextInt(100);
    }

    public int number(){
        //user input
        out.println("enter number");
        Scanner sc=new Scanner(System.in);
        int h=sc.nextInt();

        if(number!=h){
            if(h>number){
                out.println("number is too high ");
            }
            else{
                out.println("number is too low");
            }
            for(int i=1;i<100;i++){
                count+=i;
                return number();
            }}
        else{
            System.out.println("you hava guess right number");

        }
        System.out.printf("you hava taken  %d  no. of gusses",count);
        out.println(" ");
        return h;
    }
}
public class gueess_the_no_game {
    public static void main(String[] args) {
        take_input obj =new take_input();
        int y=obj.number();

        System.out.println("yes you did it ,keep it up");
    }
}
