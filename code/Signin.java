import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.Buffer;
import java.time.LocalDateTime;
import java.util.Scanner;

public class Signin {
    public static void main(String[] args) throws IOException {

        Scanner keyboard = new Scanner(System.in);
        String choice = null;
        do {
            BufferedWriter writer = new BufferedWriter(new FileWriter("Attendance " + LocalDateTime.now().toLocalDate() + ".txt", true));
            /*
            writer.write("\t\t############################################\n");
            writer.write("\t\t############################################\n");
            writer.write("\t\t##Started collecting data at: " + LocalDateTime.now() + "##\n");
            writer.write("\t\t############################################\n");
            writer.write("\t\t############################################\n");
             */
            System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
            System.out.println("Welcome to class! Type your name in and press enter to sign in to class.");
            System.out.println("¡Bienvenido a la clase! Escriba su nombre y presione Entrar para iniciar sesión en la clase.");
            System.out.println("Byenveni nan klas la! Tape non w epi peze Enter pou w konekte nan klas la.");
            System.out.println("Bem-vindo à aula! Digite seu nome e pressione Enter para entrar na aula");
            if(choice != null) System.out.println("\nHi / Hola / Halo / Oi, " + choice + "!");
            choice = keyboard.nextLine();
            if(choice != null && !choice.isBlank() && !choice.equals("quit")){
                writer.write(choice + " signed in at " + LocalDateTime.now() + "\n");
            }
            writer.close();
        } while(!choice.equals("quit"));
    }
}
