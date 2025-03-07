public class Calendar {
    int year;
    int month;
    int day;
    public Calendar(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }
    void ilerlet(){
        day++;
        if(day == 31){
            day = 1;
            month++;
        }
        if (month==12) {
            month = 1;
            year++;

        }

    }

}
