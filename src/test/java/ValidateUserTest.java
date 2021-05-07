import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ValidateUserTest {
    @Test
    void givenFirstName_WhenProper_ShouldReturnTrue() {
        ValidateUser validator = new ValidateUser();
        boolean result = ValidateUser.validateFirstName("Swapnil");
        Assertions.assertEquals(true, result);
    }
    @Test
    public void givenFirstName_WhenShort_ShouldReturnFalse() {
        ValidateUser validator = new ValidateUser();
        boolean result = ValidateUser.validateFirstName("Sw");
        Assertions.assertEquals(false, result);
    }

    @Test
    public void givenLastName_WhenProper_ShouldReturnTrue() {
        ValidateUser validator = new ValidateUser();
        boolean result = ValidateUser.validateLastName("Bhoyar");
        Assertions.assertEquals(true,result);
    }

    @Test
    public void givenLastName_WhenShort_ShouldReturnFalse() {
        ValidateUser validator = new ValidateUser();
        boolean result = ValidateUser.validateLastName("Bho");
        Assertions.assertEquals(false,result);
    }

    @Test
    public void givenEmail_WhenProper_ShouldReturnTrue() {
        ValidateUser validator = new ValidateUser();
        boolean result = ValidateUser.validateEmail("abc.xyz@bl.co.in");
        Assertions.assertEquals(true,result);
    }

    @Test
    public void givenMobNumber_WhenProper_ShouldReturnTrue() {
        ValidateUser validator = new ValidateUser();
        boolean result = ValidateUser.validateMobNumber("91 8974563210");
        Assertions.assertEquals(true,result);
    }
    @Test
    public void givenMobNumber_WhenDifferent_ShouldReturnFalse() {
        ValidateUser validator = new ValidateUser();
        boolean result = ValidateUser.validateMobNumber("91 86mj88B638");
        Assertions.assertEquals(false, result);
    }
    @Test
    public void givenPasswordRule1_WhenProper_ShouldReturnTrue() {
        ValidateUser validator = new ValidateUser();
        boolean result = ValidateUser.validatePasswordRule1("mkijhgtr");
        Assertions.assertEquals(true,result);
    }

    @Test
    public void givenPasswordRule2_WhenProper_ShouldReturnTrue(){
        ValidateUser validator = new ValidateUser();
        boolean result = ValidateUser.validatePasswordrule2("Ghutkytf");
        Assertions.assertEquals(true,result);

    }

    @Test
    public void givenPasswordRule3_WhenProper_ShouldReturnTrue() {
        ValidateUser validator = new ValidateUser();
        boolean result = ValidateUser.validatePasswordRule3("jdF5iOj8");
        Assertions.assertEquals(true, result);
    }

    @Test
    public void givenPasswordRule4_WhenProper_ShouldReturnFalse() {
        ValidateUser validator = new ValidateUser();
        boolean result = ValidateUser.validatePasswordRule4("Eyu6@uyh");
        Assertions.assertEquals(false,result);

    }

    @Test
    public void givenFirstName_WhenProper_ShouldReturnHappy() {
        ValidateUser validator = new ValidateUser();
        String result = ValidateUser.validatefirstname("Swapnil");
        Assertions.assertEquals("Happy", result);
    }

    @Test
    public void givenFirstName_WhenShort_ShouldReturnSad() {
        ValidateUser validator = new ValidateUser();
        String result = ValidateUser.validatefirstname("Sw");
        Assertions.assertEquals("Sad", result);
    }

    @Test
    public void givenLastName_WhenProper_ShouldReturnHappy() {
        ValidateUser validator = new ValidateUser();
        String result = ValidateUser.validatelastname("Bhoayr");
        Assertions.assertEquals("Happy", result);
    }

    @Test
    public void givenLastName_WhenShort_ShouldReturnSad() {
        ValidateUser validator = new ValidateUser();
        String result = ValidateUser.validatelastname("Bho");
        Assertions.assertEquals("Sad", result);
    }

    @Test
    public void givenEmail_WhenProper_ShouldReturnHappy() {
        ValidateUser validator = new ValidateUser();
        String result = ValidateUser.validateemail("abc.xyz@bl.co.in");
        Assertions.assertEquals("Happy", result);
    }

    @Test
    public void givenEmail_WhenNotProper_ShouldReturnSad() {
        ValidateUser validator = new ValidateUser();
        String result = ValidateUser.validateemail("ascffrg");
        Assertions.assertEquals("Sad", result);
    }

    @Test
    public void givenMobNumber_WhenNotProper_ShouldReturnSad() {
        ValidateUser validator = new ValidateUser();
        String result = ValidateUser.validatelMobNumber("9689887638");
        Assertions.assertEquals("Sad", result);
    }

    @Test
    public void givenPassword_WhenProper_ShouldReturnHappy() {
        ValidateUser validator = new ValidateUser();
        String result = ValidateUser.validatPassword("A6rtr59k");
        Assertions.assertEquals("Happy", result);
    }

    @Test
    public void givenPassword_WhenNotProper_ShouldReturnSad() {
        ValidateUser validator = new ValidateUser();
        String result = ValidateUser.validatPassword("A6@tr59k");
        Assertions.assertEquals("Sad", result);
    }

}