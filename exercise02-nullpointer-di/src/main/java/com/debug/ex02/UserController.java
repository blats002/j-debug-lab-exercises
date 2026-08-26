package com.debug.ex02;

public class UserController {

    private UserService userService;

    public UserController() {
        this.userService = new UserService();
    }

    public UserController(UserService userService) {
        this.userService = userService;
    }

    public void printUser() {
        System.out.println(userService.getUserName());
    }
}