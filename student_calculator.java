package codesoft;
import java.util.*;
import java.util.Scanner;

public class student_calculator {
    public static void main(String[] args) {
        int t,n;
        int sum=0;
        float avg_percent;
        Scanner sc=new Scanner(System.in);

        System.out.println("enter number of subject");
         t=sc.nextInt();
     sc.nextLine();

        for(int i=1;i<=t;i++){
            System.out.printf("enter subject %d name::",i);
            String j=sc.nextLine();
            System.out.printf("enter  %s marks",j);
            n=sc.nextInt();
           sc.nextLine();
//            System.out.printf("subject: %s=%d",j,n);
            System.out.println();
            sum+=n;
    }
        System.out.println("your total marks are:"+sum);
        avg_percent=(sum/t*100.0f)/100;
        System.out.printf("your avg percent is %.2f:",avg_percent);
        System.out.println(" ");
        if(avg_percent<=60){
            System.out.println("grade C");
        } else if (avg_percent<=70) {
            System.out.println("grade B");
        } else if (avg_percent<=80) {
            System.out.println("grade B++");
        }
        else if (avg_percent<=90){
            System.out.println("grade A");
        }
        else{
            System.out.println("grade A++");
        }
    }
}
