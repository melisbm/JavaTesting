package javaTesting.Resources;

public class AppParameters {

    public static final String DOMAIN = "127.0.0.1";
    public static final String PORT = "80";

    // public static final Object BD_CON = new ClasseConnexioBDDD();

    // public static Object MESSAGES_TRANSLATIONS ;

    // implementar SINGLETON PATTERN
    private static AppParameters instance;

    private AppParameters() {
    }

    public static AppParameters getInstance() {
        if (instance == null) {
            instance = new AppParameters();
        }
        return instance;
    }

    public void initApp() {
        // codi necessari per la inicialitzacio de l'app
    }

    public void resetApp() {
        // codi per reconfigurar l'App
    }

    public static String deployedURL() {
        return "https://" + DOMAIN + ":" + PORT;
    }
}