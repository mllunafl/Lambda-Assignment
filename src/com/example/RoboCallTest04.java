package com.example;

import java.util.List;
import java.util.function.Predicate;

/**
 * Created by LunaFlores on 1/9/17.
 */
public class RoboCallTest04 {

    public static void main(String[] args) {

        List<Person> p1 = Person.createShortList();
        RoboContactsLambda robo = new RoboContactsLambda();

        //Predicates
        Predicate<Person> allDrivers = p -> p.getAge() >= 16;
        Predicate<Person> allDraftees = p -> p.getAge() >= 18 && p.getAge() <= 25 && p.getGender() == Person.Gender.MALE;
        Predicate<Person> allPilots = p -> p.getAge() >= 23 && p.getAge() <= 65;

        System.out.println("\n=== Test 04 ===");
        System.out.println("\n=== Calling all Drivers ===");
        robo.phoneContacts(p1, allDrivers);

        System.out.println("\n=== Emailing all Draftees ===");
        robo.emailContacts(p1,allDraftees);

        System.out.println("\n=== Mail all Pilots ===");
        robo.mailContacts(p1,allPilots);

        //Mix and match becomes easy
        System.out.println("\n=== Mail all Draftees ===");
        robo.mailContacts(p1, allDraftees);

        System.out.println("\n=== Call all Pilots ===");
        robo.phoneContacts(p1,allPilots);

    }
}
