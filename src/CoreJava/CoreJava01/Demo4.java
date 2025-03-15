package CoreJava.CoreJava01;

class Student{
    public String name(String name){
        return name;
    }
    public String grade(int grade){
        return grade >= 90? "A" : grade >= 80? "B" : grade >= 70? "C" : grade >= 60? "D" : "F";
    }
    public String subject(String subject){
        return subject.equalsIgnoreCase("Math")? "Mathematics" : subject.equalsIgnoreCase("Science")? "Science" : subject.equalsIgnoreCase("English")? "English" : "Unknown Subject";
    }
}

public class Demo4 {
    public static void main(String[] args) {
        Student student1 = new Student();

        System.out.println("Name: " + student1.name("Royalkarann"));
        System.out.println("Grade: " + student1.grade(95));
        System.out.println("Subject: " + student1.subject("Math"));
        System.out.println("Subject: " + student1.subject("Science"));
        System.out.println("Subject: " + student1.subject("English"));
        System.out.println("Subject: " + student1.subject("History"));


        Student student2 = new Student();
        System.out.println("Name: " + student2.name("John Doe"));
        System.out.println("Grade: " + student2.grade(80));
        System.out.println("Subject: " + student2.subject("Science"));
        System.out.println("Subject: " + student2.subject("English"));
        System.out.println("Subject: " + student2.subject("French"));
        System.out.println("Subject: " + student2.subject("History"));
    }
}
