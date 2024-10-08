package Exercise_1;
public class Graduate extends Student {
    protected String thesisTitle;

    public Graduate(int id, String name, double gpa, String thesisTitle){
        super(id, name, gpa);
        this.thesisTitle = thesisTitle;
    }

    public String setThesisTitle(){
        return thesisTitle;
    }
    public void getThesisTitle(String thesisTitle){
        this.thesisTitle = thesisTitle;
    }

    public String toString(){
        return "Graduate Student: \nID: " + id + "\nName: " + name + "\nGPA: " + gpa + "\nThesis: " + thesisTitle;
    }
}
