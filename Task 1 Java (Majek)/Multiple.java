import java.util.Scanner;
public class Multiple {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter First Integer: ");
        int num1 = input.nextInt();

        System.out.print("Enter Second Integer: ");
        int num2 = input.nextInt();

        int multiple = num1 * num1 * num1;
        int doubled = num2 * num2 ;

        if(multiple % doubled == 0){ 
            System.out.printf("%d is a multiple of %d", multiple, doubled);
        }
        else{
            System.out.printf("%d is not a multiple of %d", multiple, doubled);
        }
    }
}
