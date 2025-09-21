import java.util.*;
public class Calculator{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("\t\t\t\t\t\t\tThis is a simple CALCULATOR\n"); 
        System.out.print("Enter the First number : ");
        double n1 = sc.nextDouble();
        System.out.print("\nEnter the Second number : ");
        double n2 = sc.nextDouble();
        System.out.print("\nEnter operation that is to be done ( + , - , * , /) : ");
        char c = sc.next().charAt(0);
        double result = 0;
        System.out.println("\n\t\t\tHmmm..... Let Me Think Buddy");
        System.out.println("\nHere's the Answer Thank me Later :-) \n");
        switch(c){
            case '+':
                System.out.print("The Addition of the this two number is "+n1+" "+c+" "+n2+" : ");
                result = n1+n2;
                break;
            case '-':
                System.out.print("The Subtraction of the this two number is "+n1+" "+c+" "+n2+" : ");
                result = n1-n2;
                break;
            case '*':
                System.out.print("The Multiplication of the this two number is "+n1+" "+c+"" +n2+" : ");
                result = n1*n2;
                break;
            case '/':
                System.out.print("The Division of the this two number is "+n1+" "+c+" "+n2+" : ");
                result = n1/n2;
                break;
            default:
                System.out.print("Invalid Operation Entered");
                return;
        }
        System.out.print(result);
    }
}