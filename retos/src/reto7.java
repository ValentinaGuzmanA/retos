import java.util.Scanner;

public class FormularioRegistro {
  public static void main(String[] args) {
    
    Scanner lectura = new Scanner(System.in);
    String nombre, email, contrasena;
    int edad;
    String respuesta = "S" ;
    int i = 0;
    
    while (respuesta. equals("s") ) {
      i++;
      System.out.println("¡Bienvenido al formulario de registro #" + contador + "!");
      
      // Solicitar la información del usuario
      System.out.print("Nombre completo: ");
      nombre = lectura.nextLine();
      
      System.out.print("Correo electrónico: ");
      email = lectura.nextLine();
      
      System.out.print("Contraseña: ");
      contrasena = lectura.nextLine();
      
      System.out.print("Edad: ");
      edad = lectura.nextInt();
   
      
      // Imprimir los datos del usuario
      System.out.println("Datos del usuario #" +i);
      System.out.println("Nombre: " + nombre);
      System.out.println("Correo electrónico: " + email);
      System.out.println("Contraseña: " + contrasena);
      System.out.println("Edad: " + edad);
      
      // Preguntar si el usuario quiere registrar a alguien más
      System.out.println("¿Quieres registrar a alguien más? (s/n)");
      respuesta = lectura.nextLine();
    }
    
    System.out.println("¡Gracias por registrar a " + lectura + " usuario(s)!");
  }
}