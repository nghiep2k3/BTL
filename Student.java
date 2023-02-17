public class Student {
    String name, address, dob;
    int studentID;

    
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.name = "nghiep";
        student1.address = "Hưng hà - Thái Bình";
        student1.dob = "24/11/2003";

        System.out.println(student1.name);
        System.out.println(student1.address);
        System.out.println(student1.dob);
    }
}