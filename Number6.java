package class10GroupProject;

import java.util.Scanner;

public class Number6 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter a number");
        int number=scanner.nextInt();
        int count=0;
        for (int i = 1; i <=number; i++) {
            if(number%i ==0){
                count++;
            }
        }
        if(count==2) {
            System.out.println("Prime Number");
        }else {
            System.out.println("Not a Prime Number");
        }
    }
}
