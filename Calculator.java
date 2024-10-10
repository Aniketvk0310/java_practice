import java.util.Scanner;
public class Calculator{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the first number : ");
        double num1 = sc.nextDouble();
        
        System.out.println("Enter the second number : ");
        double num2 = sc.nextDouble();
        
        System.out.println("Enter an operator ('+','-','*','/')");
        char operator = sc.next().charAt(0);
        
        double result;
        
        switch(operator)
        {
            case '+':
                result = num1 + num2;
                System.out.println("Sum : " + result);
                break;
                
            case '-':
                result = num1 - num2;
                System.out.println("Difference : "+ result);
                break;
                
            case '*':
                result = num1 * num2;
                System.out.println("Multiplication : "+result);
                break;
                
            case '/':
                result = num1 / num2;
                System.out.println("Division : "+result);
                break;
                
            default:
                System.out.println("Error...enter proper operator");
                break;
        }
        
        sc.close();
    }
}