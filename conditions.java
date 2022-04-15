import java.util.*;

public class conditions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
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
        }
    }
}
