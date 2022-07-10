import java.util.Scanner;
class recursion{
    static int factor(int x){
        if(x==1 || x==0){
            return 1;
        }
        else{
         return x * factor(x-1);
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number whose factorial you want to  find: ");
        int a = sc.nextInt();
        int fact = factor(a);
        System.out.println(fact);

    }
}