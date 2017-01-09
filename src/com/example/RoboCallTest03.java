package com.example;

import java.util.List;

/**
 * Created by LunaFlores on 1/9/17.
 */
public class RoboCallTest03 {

    public static void main(String[] args) {

        List<Person> p1 = Person.createShortList();
        RoboContactAnon robo = new RoboContactAnon();

        System.out.println("\n=== Test 03 ===");
        System.out.println("\n=== Calling all Drivers ===");
        robo.phoneContacts(p1, new RoboContactAnon.MyTest<Person>() {
            @Override
            public boolean test(Person person) {
                return person.getAge() >=16;
            }
        });

        System.out.println("\n=== Emailing all raftees ===");
        robo.emailContacts(p1, new RoboContactAnon.MyTest<Person>() {
            @Override
            public boolean test(Person person) {
                return person.getAge() >= 18 && person.getAge() <= 25 && person.getGender() == Person.Gender.MALE;
            }
        });

        System.out.println("\n=== Mail all Pilots ===");
        robo.mailContacts(p1, new RoboContactAnon.MyTest<Person>() {
            @Override
            public boolean test(Person person) {
                return person.getAge() >= 23 && person.getAge() <= 65;
            }
        });
    }
}
