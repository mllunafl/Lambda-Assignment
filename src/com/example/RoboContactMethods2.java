package com.example;

import java.util.List;

/**
 * Created by LunaFlores on 1/9/17.
 */
public class RoboContactMethods2 {

    public void callDrivers(List<Person> p1){
        for (Person p: p1){
            if (isDriver(p)){
                roboCall(p);
            }
        }
    }

    public void emailDraftees (List<Person> p1){
        for (Person p:p1){
            if (isDraftee(p)){
                roboEmail(p);
            }
        }
    }

    public void mailPilots(List<Person> p1){
        for (Person p:p1){
            if (isPilort(p)){
                roboMail(p);
            }
        }
    }

    public boolean isDriver(Person p){
        return p.getAge() >= 16;
    }

    public boolean isDraftee (Person p){
        return p.getAge() >= 18 && p.getAge() <= 25 && p.getGender() == Person.Gender.MALE;
    }

    public boolean isPilort(Person p){
        return p.getAge() >= 23 && p.getAge() <= 65;
    }

    public void roboCall (Person p) {
        System.out.println("Calling " + p.getGivenName() + " " + p.getSurName() + " age " + p.getAge() + " at " + p.getPhone());
    }

    public void roboEmail (Person p){
        System.out.println("EMailing " + p.getGivenName() + " " + p.getSurName() + " age " + p.getAge() + " at " + p.geteMail());
    }

    public void roboMail (Person p){
        System.out.println("Mailing " + p.getGivenName() + " " + p.getSurName() + " age " + p.getAge() + " at " + p.getAddress());
    }
}
