package homework_nr_7;

public class Date {

    private int day;
    private int month;
    private int year;

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        if(day>0 && day<31){
        this.day = day;
    } else {
            System.out.println("Invalid day");
        }

    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        if (month>0 && month<12){
        this.month = month;
    }else{
            System.out.println("Invalid month");
        }}

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if(year>0){
        this.year = year;
    }else {
            System.out.println("Invalid year");
        }
    }

    public Date(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;

    }
        public String displayDate() {
            return day + "." +month + "." +year;
        }



    public static void main(String[] args) {
        Date date = new Date(15, 11, 2024);


        date.setDay(0);   //invalid day
        date.setMonth(0);  //invalid month
        date.setYear(0);   //invalid year
        date.displayDate();
        System.out.println(date.displayDate());
        }
    }

