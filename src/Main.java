import java.util.Scanner;
import com.company.Player;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Player player = new Player();

        System.out.println("¿QUIEN QUIERE SER MILLONARIO?");
        System.out.println("Se le realizaran una serie de preguntas, contesta bien y ganaras cada vez mas dinero por pregunta");
        System.out.println("Si respondes de manera correcta puedes retirarte con tu monto, pero si respondes de manera incorrecta perderas el dinero");
        System.out.println("");
        System.out.println("Ingresa tu nombre completo");
        player.setPlayerName(scanner.nextLine());
        System.out.println(player.getPlayerName());

    }
}
