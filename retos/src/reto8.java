import java.util.Random;
import java.util.Scanner;

public class JuegoDeDados {
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    Random random = new Random();
    int jugador1, jugador2;
    String respuesta;
    
    do {
      System.out.println("¡Bienvenidos al juego de dados!");
      System.out.println("Presione Enter para lanzar los dados.");
 
      // Generar un número aleatorio entre 1 y 6 para cada jugador
      jugador1 = random.nextInt(6) + 1;
      jugador2 = random.nextInt(6) + 1;
      
      System.out.println("Jugador 1: " + jugador1);
      System.out.println("Jugador 2: " + jugador2);
      
      // Determinar al ganador
      if (jugador1 > jugador2) {
        System.out.println("¡Jugador 1 es el ganador!");
      } else if (jugador2 > jugador1) {
        System.out.println("¡Jugador 2 es el ganador!");
      } else {
        System.out.println("¡Empate!");
      }
      
      // Preguntar si los jugadores quieren jugar de nuevo
      System.out.println("¿Quieren jugar de nuevo? (s/n)");
      respuesta = sc.nextLine();
      
    } while (respuesta.equals("s")) ;
    
    System.out.println("¡Gracias por jugar!");
  }
}
