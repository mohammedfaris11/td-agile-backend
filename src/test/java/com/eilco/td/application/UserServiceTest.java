package com.eilco.td.application;

import com.eilco.td.domain.User;
import org.junit.jupiter.api.Test;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

class UserServiceTest {

    @Test
    void createUserAndFindByName() {
        UserService userService = new UserService();

        Optional<User> createdUser = userService.createUser("Alice", "alice@example.com", "FEMALE");

        assertTrue(createdUser.isPresent());
        assertNotNull(createdUser.get().getUserId());
        assertEquals("Alice", createdUser.get().getName());
        assertEquals("alice@example.com", createdUser.get().getEmail());
        assertEquals(createdUser, userService.getActualUserByName("Alice"));
    }
}
