import java.util.Random;

public class MatrixEffect {
    public static void main(String[] args) throws InterruptedException {
        Random rand = new Random();
        String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789@#$%^&*";
        int width = 80; // Number of columns
        int height = 20; // Number of lines per frame

        while (true) {
            StringBuilder frame = new StringBuilder();
            for (int i = 0; i < height; i++) {
                for (int j = 0; j < width; j++) {
                    frame.append(chars.charAt(rand.nextInt(chars.length()))).append(" ");
                }
                frame.append("\n");
            }
            System.out.print("\033[H\033[2J"); // Clear screen
            System.out.flush();
            System.out.println(frame);
            Thread.sleep(100); // Delay for animation speed
        }
    }
}