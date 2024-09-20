public class Student {
    
    private String name;
    private double gpa;
    private int age;
    
    public Student(String studentName, double studentGpa, int studentAge){
        name = studentName; 
        gpa = studentGpa;
        age = studentAge; 
    }
    public void introduce() {
        System.out.print("Hello my name is " + name );
        if (gpa <= 3.5) {
            System.out.println(" and my grades are not doing so well.");
        } else {
            System.out.println(" and I am excelling.");
        }
        
    }
    
    public void printStudentInfo() {
        System.out.println("Name: " + name);
        System.out.println("GPA: " + gpa);
        System.out.println("Age: " + age);

 }
}