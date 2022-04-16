import java.util.*;

public class conditions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /* System.out.println("Enter a number: ");
        int num1 = sc.nextInt();
        System.out.println("Enter another number: ");   
        int num2 = sc.nextInt();
        if (num1 == num2){
            System.out.println("Num is equal");
        }
        else if(num1 >= num2){
            System.out.println("Num1 is greater");
        }
        else{
            System.out.println("Num1 is less");
        } */
        System.out.println("Enter a number: ");
        int button = sc.nextInt();
        /* if(button == 1){
            System.out.println("Button 1 is pressed");
        }
        else if(button == 2){
            System.out.println("Button 2 is pressed");
        }
        else if(button == 3){
            System.out.println("Button 3 is pressed");
        }
        else{
            System.out.println("Button is not pressed");
        } */
        switch(button){
            case 1: System.out.println("button 1 is pressed");
            break;
            case 2: System.out.println("button 2 is pressed");
            break;
            case 3: System.out.println("button 3 is pressed");
            break;
            default: System.out.println("button is not pressed");
        }
    }
}
