import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UserRegistrationTest {
    //UC1 firstname
    @Test
    void givenFirstName_WhenProperFirstName_ShouldReturnTrue() {
        UserRegistration userRegistration = new UserRegistration();
        boolean result = userRegistration.addFirstName("Avinash");
        Assertions.assertTrue(result);
    }

    //UC1 firstname false
    @Test
    void givenFirstName_WhenNotProperFirstName_ShouldReturnFalse() {
        UserRegistration userRegistration = new UserRegistration();
        boolean result = userRegistration.addFirstName("avinash");
        Assertions.assertFalse(result);
    }

}
