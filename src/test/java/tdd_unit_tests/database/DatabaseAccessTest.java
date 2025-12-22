package tdd_unit_tests.database;



import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import tdd.database.Credentials;
import tdd.database.Database;
import tdd_unit_tests.MockitoExtension;

import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class DatabaseAccessTest {
    @Mock
    private Database database;

    private Credentials credentials = new Credentials("user", "password");

    @Test
    void testUserSuccessfulLogin() {
        when(database.login(credentials)).thenReturn(true);
        Credentials sameCredentials = new Credentials("user", "password");
        Assertions.assertTrue(database.login(sameCredentials));
    }

    @Test
    void testUserFailedLogin() {
        when(database.login(credentials)).thenReturn(true);
        Credentials otherCredentials = new Credentials("user", "password");
        otherCredentials.setUsername("otherUser");
        otherCredentials.setPassword("otherPassword");
        Assertions.assertNotEquals(credentials.getUsername(), otherCredentials.getUsername());
        Assertions.assertNotEquals(credentials.getPassword(), otherCredentials.getPassword());
        Assertions.assertNotEquals(credentials.hashCode(), otherCredentials.hashCode());
        Assertions.assertFalse(database.login(otherCredentials));
    }
}
