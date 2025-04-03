package org.example;

import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

@Nested
class LoginTest {

    @Test
    public void testAuthenticate_ValidCredentiaals() {
        Login login= new Login("user", "p@ssword12");

        assertTrue(login.authenticate("user", "p@ssword12"));
    }


    @Test
    public void testAuthenticaton_InvalidUsername() {
        Login login = new Login("user", "p@ssword12");

        assertFalse(login.authenticate("wronguser", "p@ssword12"));
    }
    @Test
    public void testAuthentication_InvalidPassowrd() {
        Login login = new Login("testuser", "password123");

        assertFalse(login.authenticate("user", "wrongpassword"));
    }
}
