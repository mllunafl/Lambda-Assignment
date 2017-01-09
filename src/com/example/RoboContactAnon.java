package com.example;

import java.util.List;

/**
 * Created by LunaFlores on 1/9/17.
 */
public class RoboContactAnon {

    public void phoneContacts (List<Person> p1, MyTest<Person> aTest){
        for (Person p:p1){
            if (aTest.test(p)){
                roboCall(p);
            }
        }
    }

    public void emailContacts(List<Person> p1, MyTest<Person> aTest){
        for (Person p:p1){
            if (aTest.test(p)){
                roboEmail(p);
            }
        }
    }

    public void mailContacts(List<Person> p1, MyTest<Person> aTest){
        for (Person p:p1){
            if (aTest.test(p)){
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

    public interface MyTest<T>{
        public boolean test(T t);
    }
}
