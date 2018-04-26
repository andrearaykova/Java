import java.util.ArrayList;
import java.util.Scanner;

public class AverageGrades {
     static class Student {
        public String Name;

        public ArrayList<Double> Grades;

        public double AverageGrade() {
            double sum = 0;
            int count = Grades.size();

            for (Double grade : Grades) {
                sum += grade;
            }
            return sum / count;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        ArrayList<Student> students = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String[] inputArguments = scanner.nextLine().split(" ");

            Student student = new Student();

            student.Name = inputArguments[0];
            student.Grades = new ArrayList<>();

            for (int j = 1; j < inputArguments.length; j++) {
                student.Grades.add(Double.parseDouble(inputArguments[j]));
            }
            students.add(student);
        }
        ArrayList<Student> filtredStudents = new ArrayList<>();

        for (Student student : students) {
            if (student.AverageGrade() >= 5.00) {
                filtredStudents.add(student);
            }
        }

       filtredStudents.sort((student1, student2) -> {
            int result = student1.Name.compareTo(student2.Name);

            if (result == 0) {
                result =
                        Double.compare(student2.AverageGrade(),student1.AverageGrade());
            }
            return result;
       });
        for (Student sortedStudent : filtredStudents) {
            System.out.println(sortedStudent.Name + " -> "
            + String.format("%.2f",sortedStudent.AverageGrade()));

        }
    }
}
