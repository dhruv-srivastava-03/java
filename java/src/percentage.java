import java.util.Scanner;
class percentage{
    static float percen(int []x){
        int per = 0;
        for (int ele: x){
            per += ele;

        }
        float temp = per/(x.length*100);
        return temp*100;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the total number of subjects: ");
        int subjects = sc.nextInt();
        int []marks = new int [subjects];
        for (int i=0;i<=subjects-1;i++){
            System.out.print("Enter marks in subject"+ (i+1) +" : ");
            marks[i]=sc.nextInt();
        }
        System.out.println("Percentage is : " + percen(marks) + "%" );


        
    }
}