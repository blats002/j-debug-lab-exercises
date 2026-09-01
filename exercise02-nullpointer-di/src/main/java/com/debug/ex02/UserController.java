package com.debug.ex02;

public class UserController {

    // Dependency reference to the service layer
    private UserService userService;

    // Solution 1: Default constructor explicitly instantiates required dependency.
    // Why: When invoking printUser(), calling userService.getUserName() on an uninitialized (null) field
    // causes a NullPointerException. Instantiating it in the constructor guarantees it is ready before use.
    public UserController() {
        this.userService = new UserService();
    }

    // Solution 2: Parameterized constructor for Dependency Injection (DI) / Unit Testing.
    // Why: Allows callers (or Spring/Guice DI containers) to pass an existing service or mock.
    public UserController(UserService userService) {
        this.userService = userService;
    }

    public void printUser() {
        // Safe invocation: 'userService' is wired and guaranteed non-null
        System.out.println(userService.getUserName());
    }
}