import java.time.LocalDateTime;

public class SmartLogger implements Logger {
    int counter = 0;

    boolean IsItError(String msg) {
        return msg.toLowerCase().contains("error".toLowerCase());
    }

    @Override
    public void log(String msg) {
        for (int i = 0; i < 1; i++) {
            counter++;
            if (IsItError(msg)) {
                System.out.println("ERROR#" + counter + " [" + LocalDateTime.now() + "] " + msg);
            } else {
                System.out.println("INFO#" + counter + " [" + LocalDateTime.now() + "] " + msg);
            }
        }
    }
}

