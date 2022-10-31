import java.awt.*;

public class Main {
    public static void main(String[] args) {
        try {
            Robot r = new Robot();
            while (true) {
                r.mouseMove((int) (Math.random() * 10000), (int) (Math.random() * 10000));
                Thread.sleep(5 * 10);
            }

        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } catch (AWTException e) {
            throw new RuntimeException(e);
        }
    }
}