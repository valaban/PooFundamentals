public class Main {

    public static void main(String[] args) {        // Creating some students
        Student student1 = new Student("Alice", "Smith", 1001, 75, 2);
        Student student2 = new Student("Bob", "Johnson", 1002, 55, 2);
        Student student3 = new Student("Charlie", "Williams", 1003, 85, 2);

    
        Course course = new Course("Mathematics", "Dr. Brown", 2);

     
        course.enroll(student1);
        course.enroll(student2);
        course.enroll(student3);

                System.out.println("Number of students: " + course.countStudents());
        System.out.println("Best grade in the course: " + course.bestGrade());

        
        System.out.println("Student Ranking:");
        course.ranking();

       
        System.out.println("Checking if students are above average:");
        course.checkAboveAverage();

 
        Student[] newStudents = {
            new Student("David", "Brown", 1004, 90, 2),
            new Student("Emma", "Davis", 1005, 65, 2)
        };
        course.enroll(newStudents);
        System.out.println("Number of students after enrolling more: " + course.countStudents());
    }
}
