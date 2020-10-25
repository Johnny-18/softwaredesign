package com.company;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        User user1 = new User("Ivan Zherybor", "Laboratory work 2", "18:48");
        User user2 = new User("Ivan Zherybor", "Laboratory work 2", "18:48");

        System.out.println(user1.equals(user2) ? "Equals" : "Not equals");

        var user3 = (User)user1.clone();

        System.out.println("Hash code: " + user3.hashCode());
        System.out.println(user3.toString());
    }
}