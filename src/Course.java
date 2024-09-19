import java.util.ArrayList;
import java.util.List;

public class Course {
    String courseName;
    String professorName;
    int year;
    List<Student> students;

  
    public Course(String courseName, String professorName, int year) {
        this.courseName = courseName;
        this.professorName = professorName;
        this.year = year;
        this.students = new ArrayList<>();
    }


    public void enroll(Student student) {
        students.add(student);
    }

   
    public void enroll(Student[] studentsArray) {
        for (Student student : studentsArray) {
            students.add(student);
        }
    }


    public void unEnroll(Student student) {
        if (students.contains(student)) {
            students.remove(student);
        }
    }

 
    public int countStudents() {
        return students.size();
    }


    public int bestGrade() {
        int bestGrade = 0;
        for (Student student : students) {
            if (student.grade > bestGrade) {
                bestGrade = student.grade;
            }
        }
        return bestGrade;
    }

   
    public double averageGrade() {
        if (students.isEmpty()) return 0;
        int totalGrades = 0;
        for (Student student : students) {
            totalGrades += student.grade;
        }
        return (double) totalGrades / students.size();
    }

 
    public void ranking() {
        students.sort((s1, s2) -> s2.grade - s1.grade); // Sorting in descending order by grade
        for (Student student : students) {
            System.out.println(student);
        }
    }

    
    public void checkAboveAverage() {
        double average = averageGrade();
        for (Student student : students) {
            String result = student.grade >= average ? "above" : "below";
            System.out.println(student.firstName + " is " + result + " the average.");
        }
    }
}
