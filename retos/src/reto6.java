
import java.util.Scanner;
import java.util.Random;


public class reto6 {
    public static void main(String[] args) {
        

        int num;
        int palabras=0;
        int respuesta;
        String palabra;
        int numero;
        int i=0;
        Random rand = new Random();
        Scanner lectura=new Scanner(System.in);

        System.out.println("Hola Bienvenido A Adivinar La Palabra ");

        System.out.println("Cuantas pPalabras Quieres Adivinar Puedes Escoger Desde 1 Hasta 4");
        numero=lectura.nextInt();

        
        while(i<numero){

        num = random.nextInt(3) + 1;

                if(num==1){

                    System.out.println("es un animal acuatico ");
                    palabra=lectura.next();

                    if(palabra=="pez"){
                        System.out.println("Correcto animal es un pez");
                    } else{
                        System.out.println("la palabra que digitaste  no cumple las caracteristicas");
                    }

                }
                else if(num==2){
                    System.out.println(" es un animal terrestre");
                    palabra=lectura.next();
                

                    if(palabra=="gato"){
                        System.out.println("Correcto el animal es un gato");
                    } else{
                        System.out.println("la palabra que digitaste no cumple las caracteristicas");
                    }

            }
            else if(num==3){
                System.out.println("es un animal invertebrado");
                palabra=lectura.next();
            

                if(palabra=="araña"){
                    System.out.println("Correcto el animal es la araña ");
                } else{
                    System.out.println("la palabra que digitaste  no cumple las caracteristicas");
                }
            }
        
    
        }
                    
        i++;
                    
    
        
    System.out.println("Se acabo el juego, gracias ");
    lectura.close();

                }
            }