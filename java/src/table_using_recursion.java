import java.util.Scanner;
class table{
    static void table(int x){
        if(x==-0){

        }
        else{
            for (int i=1;i<=10;i++){
            System.out.println(x+ "x"+i +"="+x*i);
        }
    }}
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int data = 1;

        while (data!=0){
            System.out.print("Enter the number whose table you want to print else enter 0 to quit: ");
            data = sc.nextInt();
            table(data);
    }
    }
}