package com.spring.henallux.pinthouse.Service;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;

@Service
public class DateService {
    private ArrayList<String> days = new ArrayList<>();
    private ArrayList<String> months = new ArrayList<>();
    private ArrayList<String> years = new ArrayList<>();

    public DateService() {
        days.add("Jour");
        for (int i = 1; i <= 31; i++){
            days.add(String.valueOf(i));
        }
        months.add("Mois");
        for (int i = 1; i <= 12; i++){
            months.add(String.valueOf(i));
        }
        GregorianCalendar now = new GregorianCalendar();
        int yearMax = now.get(Calendar.YEAR);
        years.add("Année");
        for (int i = 1950; i <= yearMax; i++){
            years.add(String.valueOf(i));
        }
    }

    public ArrayList<String> getDays() {
        return days;
    }

    public ArrayList<String> getMonths() {
        return months;
    }

    public ArrayList<String> getYears() {
        return years;
    }
}
