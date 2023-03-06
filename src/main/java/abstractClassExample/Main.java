package abstractClassExample;

import abstractClassExample.humans.Adult;
import abstractClassExample.humans.Baby;
import abstractClassExample.humans.Human;
import abstractClassExample.humans.Teen;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
     Baby baby = new Baby ("Peter", 1);
//Anonymous class:
        /*Human human = new Human("Peter", 1) {
            @Override
            public String move() {
                return null;
            }

            @Override
            public String gotoLocation(String location) {
                return null;
            }
        };*/
//You need to implement methods before you can initialize Human class.
        System.out.println(baby.move());
        System.out.println(baby.gotoLocation("school"));
        System.out.println(baby.gotoLocation("park"));
        System.out.println(baby.getName());
        try {
            baby.grow(3,5);
        } catch (Exception exception) {
            exception.printStackTrace();
        }
        System.out.println(baby.getAge());

        Teen teen = new Teen ("Bella", 15, "rock");
        try {
            System.out.println(baby.move());
            teen.grow(3,5);
            System.out.println(baby.move());
            teen.grow(3,5);
            System.out.println(baby.move());
            teen.grow(3,5);
        } catch (Exception exception) {
            System.out.println(exception);
        }
        System.out.println(teen.getAge());
        System.out.println(teen.gotoLocation("school"));
        System.out.println(teen.gotoLocation("kitchen"));
        System.out.println(teen.gotoLocation("party"));
        Adult adult = new Adult ("Harry", 30, true, "dentist");
        Adult adult2 = new Adult ("Larry", 30, false, "unemployed");

        System.out.println(adult.gotoLocation("work"));
        System.out.println(adult2.gotoLocation("work"));

        ArrayList<Baby> babes = new ArrayList<>();
        babes.add(new Baby("Harry", 15));
        babes.add(new Baby("Harry", 15));
        babes.add(new Baby("Harry", 15));
        ArrayList<Teen> teens = new ArrayList<>();
        teens.add(new Teen ("Bella", 15, "rock"));
        teens.add(new Teen ("Bella", 15, "rock"));
        teens.add(new Teen ("Bella", 15, "rock"));
        ArrayList<Adult> adults = new ArrayList<>();
        adults.add (new Adult ("Larry", 30, false, "unemployed"));
        adults.add (new Adult ("Harry", 30, true, "dentist"));
        ArrayList<Human> humans = new ArrayList<>();
        humans.add(baby);
        humans.add(teen);
        humans.add(adult);

        for (Teen currentTeen : teens) {
            System.out.println(currentTeen.getName());
            try {
               currentTeen.grow(5,7);
            } catch (Exception exception) {
                System.out.println(exception);
            }
        }

        adults.forEach(currentAdult -> System.out.println(currentAdult.getJobPosition()));
        humans.forEach(currentHuman -> System.out.println(currentHuman.getName()));

        for (Human currentHuman : humans) {
            System.out.println(currentHuman.getName() + " is "+ currentHuman.getAge());
            try {
                currentHuman.grow(5,7);
            } catch (Exception exception) {
                System.out.println(exception);
            }
            System.out.println("Final age for "+(currentHuman.getName()) + " is "+ (currentHuman.getAge()));
        }

        }

    }

