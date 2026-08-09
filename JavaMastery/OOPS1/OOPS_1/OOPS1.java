class Student{
    private String Name;
    private int rollno;
    private int marks;
    private String Grade;
    
    public Student(String name, int rollno, int marks, String grade) 
    {
        this.Name = name;
        this.rollno = rollno;
        this.marks = marks;
        this.Grade = grade;
    }

    public String getName() {
        return Name;
    }

    public int getRollno() {
        return rollno;
    }

    public int getMarks() {
        return marks;
    }

    public String getGrade() {
        return Grade;
    }

    @Override
    public String toString() {
        return "Alpha [Name=" + Name + ", rollno=" + rollno + ", marks=" + marks + ", Grade=" + Grade + "]";
    }


}


public class OOPS1 {

    public static void main(String[] args) {
        System.out.println("OOPS Lesson 1 - Constructor, Getter, Setter and ToString() Implementation");
        Student s1 = new Student("Rais", 30, 90, "A");
        System.out.println(s1);
        
    }
}
