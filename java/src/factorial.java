import java.util.Scanner;
class factorial{
    public static int factor(int x){
        int result = 1;
        for(int i = x; i>=1;i--){
            result *= i;
        }
        return result;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number whose factorial you want: ");
        int a = sc.nextInt();
        int fact = factor(a);
        System.out.println("Factorial is " + fact);
    }
}