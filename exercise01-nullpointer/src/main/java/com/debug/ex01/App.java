package com.debug.ex01;

public class App {
    public static void main(String[] args) {
        UserService service = new UserService();
        System.out.println(service.getUser(0));
    }
}