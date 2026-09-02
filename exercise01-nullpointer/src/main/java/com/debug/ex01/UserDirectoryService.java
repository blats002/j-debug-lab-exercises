package com.debug.ex01;

/**
 * UserDirectoryService provides high-level business operations for user directory lookups.
 */
public class UserDirectoryService {

    private final UserProfileRepository repository = new UserProfileRepository();

    public UserProfile getUser(Long id) {
        return repository.findById(id);
    }
}
