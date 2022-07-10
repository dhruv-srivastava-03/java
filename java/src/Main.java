import java.util.Scanner;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter marks in maths");
        float maths = sc.nextInt();
        System.out.println("Enter marks in english");
        float english = sc.nextInt();
        System.out.println("Enter marks in hindi");
        float hindi = sc.nextInt();
        System.out.println("Enter marks in sanskrit");
        float sanskrit = sc.nextInt();
        System.out.println("Enter marks in science");
        float science = sc.nextInt();
        float per = (maths+english+hindi+sanskrit+science)/500;
        System.out.println(per*100+"%");
    }
}