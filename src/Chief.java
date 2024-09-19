

public class Chief extends Employee{

    static int rang = 1;


    public Chief(int day, int month, int year, int salary) {
        super(day, month, year, salary);
    }

     @Override
    public int getSalary() {
        return super.getSalary();
    }

    @Override
    public void setSalary(int salary) {
        super.setSalary(salary);
    }

    @Override
    public int compareTo(Employee b) {
        // TODO Auto-generated method stub
        return super.compareTo(b);
    }

    @Override
    public int getDay() {
        // TODO Auto-generated method stub
        return super.getDay();
    }

    @Override
    public int getMonth() {
        // TODO Auto-generated method stub
        return super.getMonth();
    }

    @Override
    public int getYear() {
        // TODO Auto-generated method stub
        return super.getYear();
    }

    @Override
    public void setDay(int day) {
        // TODO Auto-generated method stub
        super.setDay(day);
    }

    @Override
    public void setMonth(int month) {
        // TODO Auto-generated method stub
        super.setMonth(month);
    }

    @Override
    public void setYear(int year) {
        // TODO Auto-generated method stub
        super.setYear(year);
    }


}
