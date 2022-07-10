public class array {
    public static  void main(String[] args) {

        int[] marks = {12, 1, 3, 13, 42};
        int sum =0;
        for(int element: marks){
            sum = sum+element;
        }
        System.out.println(sum);
    }}