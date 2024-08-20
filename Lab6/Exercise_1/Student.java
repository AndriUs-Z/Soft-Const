package Exercise_1;
public class Student {
    
    protected String name;
    protected int id;
    protected double gpa;

    public Student(int id, String name, double gpa){
        this.name = name;
        this.id = id;
        this.gpa = gpa;
    }

    public String getName(){
        return name;
    }
    public int getID(){
        return id;
    }
    public double getGPA(){
        return gpa;
    }
    public void setName(String name){
        this.name = name;
    }
    public String toString(){
        return "Student: \nID: " + id + "\nName: " + name + "\nGPA: " + gpa;
    }
}
