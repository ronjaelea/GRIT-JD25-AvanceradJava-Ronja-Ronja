public class NotificationService {

    // "Global" config och instans – hårdkodat och statiskt
    public static NotificationService INSTANCE = new NotificationService();

    public static String DEFAULT_EMAIL_ADDRESS = "noreply@example.com";
    public static String DEFAULT_SMS_SENDER = "MyApp";
    public static String DEFAULT_PUSH_CHANNEL = "general";

    private boolean emailEnabled = true;
    private boolean smsEnabled = true;
    private boolean pushEnabled = true;

    // Privata konstruktorn – halvhjärtad "singleton"
    private NotificationService() {
        // Hårdkodad "konfiguration"
        System.out.println("NotificationService initieras...");
    }

    // Statisk metod som alla använder överallt
    public static void send(String type, String message) {
        // Massor av if/switch-beroende på typ
        if ("EMAIL".equals(type)) {

            if (!INSTANCE.emailEnabled) {
                System.out.println("Email är avstängt, skickar INTE: " + message);
                return;
            }

            String emailTo = "user@example.com"; // hårdkodat
            String subject = "Notification";
            System.out.println("Skickar EMAIL till " + emailTo);
            System.out.println("Från: " + DEFAULT_EMAIL_ADDRESS);
            System.out.println("Ämne: " + subject);
            System.out.println("Meddelande: " + message);

            // Dubbelkod, ingen felhantering
            if (message.length() > 200) {
                System.out.println("VARNING: Meddelandet är väldigt långt...");
            }

        } else if ("SMS".equals(type)) {

            if (!INSTANCE.smsEnabled) {
                System.out.println("SMS är avstängt, skickar INTE: " + message);
                return;
            }

            String phoneNumber = "+4612345678"; // hårdkodat
            System.out.println("Skickar SMS till " + phoneNumber);
            System.out.println("Avsändare: " + DEFAULT_SMS_SENDER);
            System.out.println("Text: " + message);

            if (message.length() > 160) {
                System.out.println("VARNING: SMS är längre än 160 tecken, kan bli uppdelat.");
            }

        } else if ("PUSH".equals(type)) {

            if (!INSTANCE.pushEnabled) {
                System.out.println("Push är avstängt, skickar INTE: " + message);
                return;
            }

            String channel = DEFAULT_PUSH_CHANNEL;
            System.out.println("Skickar PUSH till kanal: " + channel);
            System.out.println("Payload: " + message);

        } else {
            System.out.println("Okänd notifikationstyp: " + type + " – skickar ingenting.");
        }
    }

    // Någon har lagt till en metod för att toggla "konfiguration" i runtime
    public static void setEnabled(String type, boolean enabled) {
        if ("EMAIL".equals(type)) {
            INSTANCE.emailEnabled = enabled;
        } else if ("SMS".equals(type)) {
            INSTANCE.smsEnabled = enabled;
        } else if ("PUSH".equals(type)) {
            INSTANCE.pushEnabled = enabled;
        } else {
            System.out.println("Okänd typ i setEnabled: " + type);
        }
    }
}

// Någon "test"-main som anropar den statiska tjänsten direkt
class DemoApp {
    public static void main(String[] args) {
        NotificationService.send("EMAIL", "Välkommen som ny användare!");
        NotificationService.send("SMS", "Ditt engångslösenord är 123456");
        NotificationService.setEnabled("SMS", false);
        NotificationService.send("SMS", "Detta SMS ska inte skickas");
        NotificationService.send("PUSH", "Ny uppdatering finns tillgänglig!");
        NotificationService.send("FAX", "Detta borde aldrig fungera...");
    }
}