package CoreJava.CoreJava01.Arrays;

class Student {
    String name;
    int rollNo;
    int marks;
}

public class Ex26 {
    public static void main(String[] args) {
       Student s1 = new Student();
       s1.name = "John";
       s1.rollNo = 1;
       s1.marks = 80;

       Student s2 = new Student();
       s2.name = "Alice";
       s2.rollNo = 2;
       s2.marks = 90;

       Student s3 = new Student();
       s3.name = "Bob";
       s3.rollNo = 3;
       s3.marks = 70;

       Student students[] = new Student[3];
       students[0] = s1;
       students[1] = s2;
       students[2] = s3;

       for (Student student : students) {
           System.out.println("Name: " + student.name + ", Roll No: " + student.rollNo + ", Marks: " + student.marks);
       }

    }
}
