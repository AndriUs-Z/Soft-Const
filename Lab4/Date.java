public class Date{
    private int day;
    private int month;
    private int year;
    
    public int getDay(){
        return day;
    }
     public int getMonth(){
        return month;
    }
    public int getYear(){
        return year;
    }
    public void setDay(int day) {
        if (day > 0 && day <= 31) this.day = day;
    }
    public void setMonth(int month) {
       if (month > 0 && month <= 12) this.month = month;
    }
    public void setYear(int year) {
        if (year > 0 && year <= 2024) this.year = year + 543;
    }
    
    public Date(){

    }

    public Date(int day,int month,int year) {
        this.setDay(day);
        this.setMonth(month);
        this.setYear(year);
    }
    public void show(){
        System.out.println("Day : " + day);
        System.out.println("Month : " + month);
        System.out.println("Year : " + year);
    }
    
    public String toString(){
        String s = this.day + "/" + this.month + "/" + this.year;
        return s;
    }
}

