package Exercise_1;
public class Undergrad extends Student {
    protected String year;

    public Undergrad(int id, String name, double gpa, String year){
        super(id, name, gpa);
        this.year = year;
    }
    public String setYear(){
        return year;
    }

    public void getYear(String year){
        this.year = year;
    }

    public String toString(){
        return "Undergraduate Student: \nID: " + id + "\nName: " + name + "\nGPA: " + gpa + "\nYear: " + year;
    }
}
