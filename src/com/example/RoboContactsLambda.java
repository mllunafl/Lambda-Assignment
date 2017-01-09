package com.example;

import java.util.List;
import java.util.function.Predicate;

/**
 * Created by LunaFlores on 1/9/17.
 */
public class RoboContactsLambda {
    public void phoneContacts(List<Person> p1, Predicate<Person> pred){
        for (Person p:p1){
            if (pred.test(p)){
                roboCall(p);
            }
        }
    }

    public void emailContacts(List<Person> p1, Predicate<Person> pred){
        for (Person p:p1){
            if (pred.test(p)){
                roboMail(p);
            }
        }
    }

    public void mailContacts(List<Person> p1, Predicate<Person> pred){
        for (Person p:p1){
            if (pred.test(p)){
                roboMail(p);
            }
        }
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
