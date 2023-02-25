package com.firstmaven;

import java.util.HashMap;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        HashMap<String, String> dayTranslations = new HashMap<>();
        dayTranslations.put("Monday", "Lundi");
        dayTranslations.put("Tuesday", "Mardi");
        dayTranslations.put("Wednesday", "Mercredi");
        dayTranslations.put("Thursday", "Jeudi");
        dayTranslations.put("Friday", "Vendredi");
        dayTranslations.put("Saturday", "Samedi");
        dayTranslations.put("Sunday", "Dimanche");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a day name in English: ");
        String dayName = scanner.nextLine();

        String frenchDayName = dayTranslations.get(dayName);

        if (frenchDayName == null) {
            System.out.println("Sorry, I don't know the French translation for \"" + dayName + "\"");
        }
        else {
            System.out.println(dayName + " is \"" + frenchDayName + "\" in French.");
        }
    }    }
}
