package pl.ageno.tests;

import pl.ageno.tests.base.BaseTest;
import pl.ageno.tests.pages.ContactPage;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ContactFormEmailValidationTest extends BaseTest {

    record EmailCase(String notEmailValue, String expectedMessage) { }

    static Stream<EmailCase> emailValidationCases() {
        return Stream.of(
            new EmailCase(
                "fsfdadfsafsaf",
                "Proszę wpisać adres e-mail."
            )
        );
    }

    @ParameterizedTest(name = "Walidacja email: \"{0}\" -> \"{1}\"")
    @MethodSource("emailValidationCases")
    void shouldShowExactEmailValidationMessage(EmailCase tc) {
        ContactPage page = new ContactPage(driver)
            .open()
            .clickEmail()
            .typeEmail(tc.notEmailValue())
            .leaveEmailByTab();

        String actual = page.waitAndGetEmailValidationMessageText();
        assertEquals(tc.expectedMessage(), actual);
    }
}