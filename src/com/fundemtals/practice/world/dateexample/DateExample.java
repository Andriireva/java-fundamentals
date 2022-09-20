package com.fundemtals.practice.world.dateexample;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.*;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalUnit;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class DateExample {
    public static void main(String[] args) {
        long oneDay = 1000 * 60 * 60 * 24;

        Date now = new Date(); // Legacy date type

        Date nowAndOneDay = new Date(now.getTime() + oneDay);
        // date.getTime() will return milliseconds from JAN 01 1970 year
//        System.out.println(now.getTime());
//        System.out.println(now);
//        System.out.println(nowAndOneDay);

        DateFormat defaultFormat = new SimpleDateFormat();
        String formatedDate = defaultFormat.format(now);
        DateFormat onlyDateFormat = new SimpleDateFormat("dd-MM-yy hh:mm:ss Z"); // 13-09-2022
        String formatedUkDate = onlyDateFormat.format(now);
        System.out.println(now);
        System.out.println(formatedDate);
        System.out.println(formatedUkDate);

        Instant instantNow = Instant.now(); // New Date type ( java 8 ) since 2014 year
        System.out.println("===== Instant Examples =======");
        System.out.println(instantNow);
        Instant instantAndOneDay = instantNow.plus(-30, ChronoUnit.MINUTES);

        System.out.println(instantAndOneDay);
        System.out.println(instantNow.isAfter(instantAndOneDay));
        OffsetDateTime offsetDateTime = instantNow.atOffset(ZoneOffset.ofHours(3));
        System.out.println(offsetDateTime);

        // convert from Date to Instant
        Instant instant = now.toInstant();
        // convert from Instant to Date
        Date date = new Date(instant.getEpochSecond());

        System.out.println("===== Local date examples =======");
        LocalDate localDate = LocalDate.now();
        LocalDateTime localDateTime = LocalDateTime.now(); // almost the same as Date
        System.out.println(localDate);
        System.out.println(localDateTime);

        // Be default there are Gregorian Calendar...
        Calendar calendar = Calendar.getInstance();


        // 25 dec // gegorian calndar -> jul 11 dec
        // 25 dec -> 7 Jan



    }
}
