

public class Employee {

    // constant
    String Date;
    String[] Date2;
    int Day;
    int Month;
    int Years;


    // конструктор
    public Employee(String date) {
        this.Date = date;
        this.Date2 = Date.split("\\.", 3);
        this.Day = Integer.parseInt(Date2[0]);
        this.Month = Integer.parseInt(Date2[1]);
        this.Years = Integer.parseInt(Date2[2]);
    }

    // getter setter

    public int getDay() {
        return Day;
    }

    public void setDay(int day) {
        this.Day = day;
    }

    public int getMonth() {
        return Month;
    }

    public void setMonth(int month) {
        this.Month = month;
    }

    public int getYears() {
        return Years;
    }

    public void setYears(int years) {
        this.Years = years;
    }

    public String getDate() {
        return Date;
    }

    public void setDate(String date) {
        this.Date = date;
    }

    public int compareTo(Employee b) {
        if (this.getYears() > b.getYears()) {
            return 0;
        }
        if (this.getYears() < b.getYears()) {
            return 1;
        }
        return 0;
    }


}

