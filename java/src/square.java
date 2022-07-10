import java.util.Scanner;
class Square {
    static int side;
    public static int area(){
        return side*side;

    }
    public static int perimeter(){
        return (4*side);
    }
    public static int volume(){
        return (side*side*side);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the side of the square: ");
        int x = sc.nextInt();
        Square sq = new Square();
        sq.side = x;
        System.out.println("Enter the following commands:\n 1 - area \n 2- Permimeter \n 3- volume");
        int choice = sc.nextInt();
        switch (choice){
            case 1 : {
                System.out.println("Area is : "+ sq.area() + "cm^2");
            }
            case 2 : {
                System.out.println("Area is : "+ sq.perimeter() + "cm");
            }
            case 3 : {
                System.out.println("Area is : "+ sq.volume() + "cm^3");
            }
            default:{
                System.out.println("Invalid choice");

            }
        }

    }
}
