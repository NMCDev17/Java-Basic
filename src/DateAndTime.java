import java.time.*;
import java.time.format.DateTimeFormatter;

//static now() tra ve ngay thang nam hien tai;
//static of(int year,int month, int day) gan 1 ngay thang nam bat ky;
//int getDayOfYear() tra ve ngay trong nam;
//int getDayOfMonth() tra ve thang trong nam;
// DateTimeFormatter.ofPattern() dinh dang ngay thang nam;
//  boolean isLeapYear() kiem tra xem nam do co phai nam nhuan khong

public class DateAndTime {
    public static void main(String[] args) {
        LocalDate mydate = LocalDate.now();
        LocalTime mytime = LocalTime.now();
        System.out.println("Mydate 1: " + mydate);
        System.out.println("my time: " + mytime);
        // LocalDateTime mydt = LocalDateTime.now();
        // System.out.println(mydt);
        DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        // String formattedDate = mydt.format(myFormatObj);
        // System.out.println(formattedDate);
        LocalDate test = LocalDate.of(2003, 8, 24);
        mydate = test;
        String formattedDate = mydate.format(myFormatObj);
        System.out.println("Mydate 2: " + formattedDate);// test assingmet LocalDate;
        LocalDate tmp = LocalDate.now();
        int tmp2 = mydate.getDayOfYear();
        System.out.println(tmp2);
    }
}
