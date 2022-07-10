public class constructors {
    static class StudentID{
        String name;
        int Class;
        int rollno;
        public StudentID(String name1,int Class1,int rollno1){
            name = name1;
            Class = Class1;
            rollno = rollno1;
        }
        public String getName(){
            return name;
        }
        public int getRollno(){
            return rollno;
        }
    }

    public static void main(String[] args) {
        StudentID stu1 = new StudentID("Dhruv",14, 12);
        StudentID stu2 = new StudentID("Dhairya Srivastava",8, 17);
        System.out.println(stu1.getName());
        System.out.println(stu2.getName());
    }
}
