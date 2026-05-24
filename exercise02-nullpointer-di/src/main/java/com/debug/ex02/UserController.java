package com.debug.ex02;

public class UserController {

    private UserService userService;

    public void printUser() {
        System.out.println(userService.getUserName());
    }
}