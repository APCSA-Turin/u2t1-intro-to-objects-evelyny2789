public class StudentRunner {
    public static void main(String[] args) {
        Student student1 = new Student ("Bella", 2.5, 17);
        student1.printStudentInfo();
        student1.introduce(); 

        Student student2 = new Student ("Cathy", 4.5, 15);
        student2.printStudentInfo();
        student2.introduce(); 
    }
}
