package JavaTesting;

import javaTesting.Resources.AppParameters;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class AppParametersTest {

    public static final String DOMAIN_EXPECTED = "127.0.0.1";
    public static final String PORT_EXPECTED = "80";

    @Test
    public void domainURLCorrect() {
        assertEquals("Retorna la part FQDN", DOMAIN_EXPECTED, AppParameters.DOMAIN);
    }

    @Test
    public void correctPORT() {
        assertEquals("Retorna el port correcte", PORT_EXPECTED, AppParameters.PORT);
    }

    @Test
    public void correctURL() {
        String URL_EXPECTED = "https://" + DOMAIN_EXPECTED + ":" + PORT_EXPECTED;
        assertEquals("Retorna la URL de forma correcte", URL_EXPECTED, AppParameters.deployedURL());
    }

    @Test
    public void SingletonCorrectness() {
        AppParameters inst1 = AppParameters.getInstance();
        AppParameters inst2 = AppParameters.getInstance();

        assertTrue("Comprovacio unicitat instancia del singleton", inst1 == inst2);
    }
}