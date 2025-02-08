import java.time.*;
import java.time.format.DateTimeFormatter;


class Date_And_Time{

    void m1(){
         // 1. Getting the Current Date, Time, and DateTime

        LocalDate localDate =  LocalDate.now();                      // Current Date.
        LocalTime localTime = LocalTime.now();                       // Current Time.
        LocalDateTime localDateTime = LocalDateTime.now();           // Current Date and Time.
        ZonedDateTime zonedDateTime = ZonedDateTime.now();            // Current date and time with time zone.
        Instant timeStamp = Instant.now();                           // Current timestamp in UTC.


        System.out.println(localDate);              
        System.out.println(localTime);
        System.out.println(localDateTime);
        System.out.println(zonedDateTime);
        System.out.println(timeStamp);

    }

    void m2(){

        // Formatting.

        LocalDateTime localDT = LocalDateTime.now();
        System.out.println(localDT);

        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm");
        String myDate = localDT.format(format);                                                   // We have take the upper date (localDT) and put in formatter.
        System.out.println(myDate);

    }

    public static void main(String...args){

        Date_And_Time a1 = new Date_And_Time();
         a1.m1();
        a1.m2();


        LocalDate hundredFourty = LocalDate.ofYearDay(2017, 140);            // To find out particular date in a year by giving number.
        System.out.println(hundredFourty);

    }
}