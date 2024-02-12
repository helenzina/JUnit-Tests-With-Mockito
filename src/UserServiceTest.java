import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.*;

public class UserServiceTest {

    UserService userService;
    UserDb userDb;

    @Before
    public void setUp(){
        userDb= Mockito.mock(UserDb.class);
        userService= new UserService(userDb);
    }

    @Test
    public void testChangePasswordSuccess(){
        Mockito.when(userDb.changePassword("username", "password")).thenReturn(true);
        boolean actual= userService.changePassword("username", "password");
        assertTrue(actual);
    }

    @Test
    public void testChangePasswordFailed(){
        Mockito.when(userDb.changePassword("username", "password")).thenReturn(false);
        boolean actual= userService.changePassword("username", "password");
        assertFalse(actual);
    }

    @Test
    public void testChangePasswordWhenItsWeak(){
        Mockito.when(userDb.changePassword("username", "p")).thenReturn(false);
        boolean actual= userService.changePassword("username", "p");
        assertFalse(actual);
    }
}
