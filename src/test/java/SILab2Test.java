package SI_lab2_203090;

import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;


public class SILab2Test {

    //Every Branch

    @Test
    public void test1() {
        User user = null;
        List<User> allUsers = new ArrayList<>();

        RuntimeException exception = assertThrows(RuntimeException.class, () -> {
            SILab2.function(user, allUsers);
        });

        assertEquals("Mandatory information missing!", exception.getMessage());
    }

    @Test
    public void test2() {
        User user = new User("203090", null, "dimitar@example.com");
        List<User> allUsers = new ArrayList<>();

        RuntimeException exception = assertThrows(RuntimeException.class, () -> {
            SILab2.function(user, allUsers);
        });

        assertEquals("Mandatory information missing!", exception.getMessage());
    }

    @Test
    public void test3() {
        User user = new User("203090", "dimitar", null);
        List<User> allUsers = new ArrayList<>();

        RuntimeException exception = assertThrows(RuntimeException.class, () -> {
            SILab2.function(user, allUsers);
        });

        assertEquals("Mandatory information missing!", exception.getMessage());
    }

    @Test
    public void test4() {
        User user = new User(null, "dimitar", "dimitar@example.com");
        List<User> allUsers = new ArrayList<>();

        SILab2.function(user, allUsers);

        assertEquals("dimitar@example.com", user.getUsername());
    }

    @Test
    public void test5() {
        User user = new User("203090", "dimitar", "dimitar@example.com");
        List<User> allUsers = Arrays.asList(
                new User("203174", "dimitar1", "primer@example.com"),
                new User("203090", "dimitar", "dimitar@example.com")
        );

        boolean result = SILab2.function(user, allUsers);

        assertFalse(result);
        assertEquals("203090", user.getUsername());
    }

    @Test
    public void test6() {
        User user = new User("203090", "dimitar", "dimitar@example.com");
        List<User> allUsers = Arrays.asList(
                new User("203090", "dimitar", "dimitar@example.com"),
                new User("203174", "dimitar", "primer@example.com")
        );

        boolean result = SILab2.function(user, allUsers);

        assertFalse(result);
        assertEquals("203090", user.getUsername());
    }

    @Test
    public void test7() {
        User user = new User("203090", "dimitar", "dimitar@example.com");
        List<User> allUsers = new ArrayList<>();

        boolean result = SILab2.function(user, allUsers);

        assertFalse(result);
    }

    @Test
    public void test8() {
        User user = new User("203090", "dimitar", "dimitar@example.com");
        List<User> allUsers = new ArrayList<>();

        boolean result = SILab2.function(user, allUsers);

        assertFalse(result);
    }

    @Test
    public void test9() {
        User user = new User(null, "dimitar", "dimitar@example.com"); // Update the test to pass null as username
        List<User> allUsers = new ArrayList<>();

        boolean result = SILab2.function(user, allUsers);

        assertFalse(result);
        assertEquals("dimitar@example.com", user.getUsername());
    }

    @Test
    public void test10() {
        User user = new User("203090", "dimitar123", "dimitar@example.com");
        List<User> allUsers = Arrays.asList(
                new User("203174", "dimitar", "primer@example.com")
        );

        boolean result = SILab2.function(user, allUsers);

        assertFalse(result);
        assertEquals("203090", user.getUsername());
    }





    //Multiple Condition

    @Test
    public void test01() {
        User user = null;
        List<User> allUsers = new ArrayList<>();

        RuntimeException exception = assertThrows(RuntimeException.class, () -> {
            SILab2.function(user, allUsers);
        });

        assertEquals("Mandatory information missing!", exception.getMessage());
    }

    @Test
    public void test02() {
        User user = new User("203090", null, "dimitar@example.com");
        List<User> allUsers = new ArrayList<>();

        RuntimeException exception = assertThrows(RuntimeException.class, () -> {
            SILab2.function(user, allUsers);
        });

        assertEquals("Mandatory information missing!", exception.getMessage());
    }

    @Test
    public void test03() {
        User user = new User("203090", "dimitar", null);
        List<User> allUsers = new ArrayList<>();

        RuntimeException exception = assertThrows(RuntimeException.class, () -> {
            SILab2.function(user, allUsers);
        });

        assertEquals("Mandatory information missing!", exception.getMessage());
    }

    @Test
    public void test04() {
        User user = new User("203090", "dimitar", "dimitar@example.com");
        List<User> allUsers = new ArrayList<>();

        assertDoesNotThrow(() -> {
            SILab2.function(user, allUsers);
        });
    }
}