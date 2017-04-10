/**
 * Created by Matt on 3/30/2017.
 */
public class Student {
    String lastName;
    double gpa;
    int age;

    public Student(String lastName, double gpa, int age) {
        this.lastName = lastName;
        this.gpa = gpa;
        this.age = age;
    }

    public int compareTo(Student s) {
        if (gpa == s.gpa) {
            return 0; // this student gpa = s gpa
        } else if (gpa < s.gpa) {
            return -1; // this student gpa < s gpa
        } else {
            return 1; // this student gpa > s gpa
        }
    }

    public String toString() {
        return lastName + "\t" + gpa + "\t" + age;
    }

    public double getGPA() {
        return gpa;
    }
}
