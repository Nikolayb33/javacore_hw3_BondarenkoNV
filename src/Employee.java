// дз
// написать прототип компаратора сравнивающий 2 даты без использования условного оператора
//написать класс руководителя, который наследуется от работника перенести статический метод повышения зарплаты
//модифицировать метод, чтобы можно было поднимать всем сотрудникам зарплаты кроме руководителя 
// в основном коде создать руководителя и поместить в список сотрудников и проследить, чтобы у руководителя не повысилась зарплата\\



public class Employee {

    // поля
    int Day;
    int Month;
    int Year;
    int salary;




    // конструктор
    public Employee(int day, int month, int year, int salary) {
        this.Day = day;
        this.Month = month;
        this.Year = year;
        this.salary = salary;
    }

    /*
    геттеры и сеттеры
     */
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

    public int getYear() {
        return Year;
    }

    public void setYear(int year) {
        this.Year = year;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    /*
    сравнение даты рождения
     */
    public int compareTo(Employee b) {
        if (this.getYear() > b.getYear()) {
            return -1;
        }
        if (this.getYear() < b.getYear()) {
            return 1;
        }
        if (this.getYear() == b.getYear()){
            if(this.getMonth() > b.getMonth()){
                return -1;
            }
            if(this.getMonth() < b.getMonth()){
                return 1;
            }
            if(this.getMonth() == b.getMonth()){
                if (this.getDay() > b.getDay()) {
                    return -1;
                }
                if (this.getDay() < b.getDay()) {
                    return 1;
                }
            }
        }
        return 0;
    }


    /*
    повышение зарплаты
     */

    static int increaseSalary(int salary, int persent){
        int salary_before_increase ;
        int salary_after_increase;
        salary_before_increase = salary;
        salary_after_increase = salary_before_increase * persent;
        return salary_after_increase;
    }

}

