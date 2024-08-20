package Exercise_1;

public class TestStudents{
    public static void main(String[] args) {
        Student t1 = new Student(97000, "Sameer", 3.51);
        Student t2 = new Student(98000, null, 3.22);
        Undergrad u1 = new Undergrad(99000, "Shahid", 2.91, "Junior");
        Graduate g1 = new Graduate(2000000, "Mubin", 3.57, "Algorithm and Complexity");

        System.out.println(t1);
        System.out.println(t2);
        System.out.println(u1);
        System.out.println(g1);
    }
}