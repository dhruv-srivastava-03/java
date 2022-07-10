public class custom_class {
    static class Employee{
        static String name;
        static int salary;
        public static String getName(){
            return name;
        }
        public static int getSalary(){
            return salary;
        }
        public static void changeName(String x){
            name = x;
        }
    }
    public static void main(String[] args) {
        Employee dhruv = new Employee();
        dhruv.name = "Dhruv Srivastava";
        dhruv.salary = 50000;
        System.out.println(Employee.getName());
        System.out.println(Employee.getSalary());
        dhruv.changeName("Aman Gupta");
        System.out.println(Employee.getName());



    }
}
