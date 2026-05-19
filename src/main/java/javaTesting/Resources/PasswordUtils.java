package javaTesting.Resources;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Random;

public class PasswordUtils {
    private static final Random RANDOM = new SecureRandom();
    private static final String ALPHABET = "0123456789ABCDEFG"; // aixo hauria de ser mes complet

    public static String genSalt() {
        return genSalt(8);
    }

    public static String genSalt(int l) {
        StringBuilder valor = new StringBuilder(l);

        for (int k = 0; k < l; k++) {
            valor.append(ALPHABET.charAt(RANDOM.nextInt(ALPHABET.length())));
        }

        return new String(valor);
    }

    public static String genSecurePassword(String password, String salt) {
        String result = null;

        return result;
    }

    public static String hashedPassword(String password , String salt) {
        MessageDigest md;
        String result = "";

        try {
            md = MessageDigest.getInstance("SHA-256");
            md.update((password + salt).getBytes());
            //result = (md.digest()).toString();
            result = new String(md.digest());

        } catch (NoSuchAlgorithmException nsae) {

            System.out.println("Algoritme de hash erroni");
            System.exit(1);
        }

        return result;
    }

    public static boolean verifyUserPassword( String passwordEntered, String userSalt, String securePassword ) {
        return securePassword.equals(hashedPassword(passwordEntered, userSalt));
    }
}