public class setters_getters {
    static class Employee{
        private static String name;
        static void setName(String n){
            name = n;
        }
        String getName(){
            return name;
        }
    }
    public static void main(String[] args) {
        Employee dhruv = new Employee();
        dhruv.setName("Dhairya Srivastava");
        System.out.println(dhruv.getName());

    }
}
