package com.debug.ex01;

public class UserDirectoryService {

    private final UserProfileRepository repository = new UserProfileRepository();

    public UserProfile getUser(Long id) {
        return repository.findById(id);
    }
}
