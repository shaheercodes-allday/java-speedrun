
import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

class MusicPlayer {
    public static void main(String[] args) {
        Clip clip;

        try {
            File file = new File("assets/Brave.wav");
            AudioInputStream audioStream = AudioSystem.getAudioInputStream(file);
            clip = AudioSystem.getClip();
            clip.open(audioStream);
        } catch (UnsupportedAudioFileException e) {
            System.out.println("Unsupported audio file format");
            return;
        } catch (IOException e) {
            System.out.println("Error playing audio file");
            return;
        } catch (LineUnavailableException e) {
            System.out.println("Audio line unavailable");
            return;
        } catch (Exception e) {
            System.out.println("An unexpected error occurred: " + e.getMessage());
            return;
        }

        try (Scanner scanner = new Scanner(System.in)) {
            while (true) {
                System.out.print("Press 'q' = Quit, p = Play, s = Stop, r = Reset: ");
                String input = scanner.nextLine();
                switch (input.toLowerCase()) {
                    case "q" -> {
                        clip.stop();
                        clip.close();
                        System.out.println("Exiting music player...");
                        return;
                    }
                    case "p" -> {
                        if (!clip.isRunning()) {
                            clip.start();
                            System.out.println("Playing audio...");
                        } else {
                            System.out.println("Audio is already playing.");
                        }
                    }
                    case "s" -> {
                        if (clip.isRunning()) {
                            clip.stop();
                            System.out.println("Audio stopped.");
                        } else {
                            System.out.println("Audio is not playing.");
                        }
                    }
                    case "r" -> {
                        clip.setFramePosition(0);
                        System.out.println("Audio reset.");
                    }
                    default -> System.out.println("Invalid input. Please enter 'q', 'p', 's', or 'r'.");
                }
            }
        } catch (Exception e) {
            System.out.println("Error reading input: " + e.getMessage());
        }
    }
}