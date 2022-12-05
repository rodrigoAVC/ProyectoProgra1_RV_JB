
package proyectoprogra1;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;

public class ProyectoProgra1 {

    public static void main(String[] args) {
        menu();
    }
    
    public static void menu(){
        Scanner fenrir = new Scanner(System.in);
        System.out.println("---------------------------------------------------------------------------------");
        System.out.println("~~~ B I E N V E N I D O S   A   M I   P R O Y E C T O   D E   P R O G R A   I ~~~");
        ArrayList<Personaje> character = new ArrayList<Personaje>();
        int[] luck = new int[10];
        for (int i = 0; i < luck.length; i++) {
            luck[i] = new Random().nextInt((99-0)+1)+0;
        }
        character.add(new Personaje("Lancer", 650, 70, 37, 55, 20, 25, 60, luck[0], "Earth", "Spear"));
        character.add(new Personaje("Gottlieb", 700, 65, 60, 25, 35, 40, 45, luck[1], "Fire", "Sword"));
        character.add(new Personaje("Skuggi", 400, 80, 30, 75, 30, 40, 20, luck[2], "Wind", "Bow"));
        character.add(new Personaje("Berserker", 900, 70, 30, 40, 15, 30, 50, luck[3], "Fire", "Broadsword"));
        character.add(new Personaje("Priestess", 65, 70, 37, 40, 20, 25, 80, luck[0], "Earth", "Spear"));
        character.add(new Personaje("Assassin", 65, 70, 37, 40, 20, 25, 80, luck[0], "Earth", "Spear"));
        character.add(new Personaje("Samurai", 65, 70, 37, 40, 20, 25, 80, luck[0], "Earth", "Spear"));
        character.add(new Personaje("Gunner", 65, 70, 37, 40, 20, 25, 80, luck[0], "Earth", "Spear"));
        character.add(new Personaje("Sage", 65, 70, 37, 40, 20, 25, 80, luck[0], "Earth", "Spear"));
        character.add(new Personaje("Joker", 65, 70, 37, 40, 20, 25, 80, luck[0], "Earth", "Spear"));
        /*System.out.println("1. Personaje #1");
        System.out.println("1. Personaje #2");
        System.out.println("1. Personaje #3");
        System.out.print("Eliga su personaje: ");
        String chooseCharacter = fenrir.nextLine();
        System.out.println("---------------------------------------------------------------------------------");*/
        
        int juego = principio();
        boolean bandera;
        do{
            switch (juego){
                case 1:
                    unjug();
                    bandera = false;
                    break;
                case 2:
                    bandera = false;
                    break;
                case 3:
                    Scanner caso3 = new Scanner(System.in);
                    System.out.println();
                    char back;
                    System.out.println("""
                                       1. Este juego esta basado en los dos juegos de pelea Super Smash Bros y Mortal Kombat
                                          y no queremos que nada de lo visto en estos momentos se practique en casa ni en cualquier otro lado. \n
                                       2. En el modo de juego de un jugador seras tu contra la maquina, seras capaz de elegir tu combatiente
                                          mientras la maquina elegira uno al azar. Cuando esten en la batalla tendras que elegir que ataque quieres hacer
                                          para que tu oponente reciba golpes y puede bajar su vida.\n
                                       3. El ganador es el que quede con vida no hay mas.\n
                                       4. En el modo de dos jugadores, las dos personas tendran que elegir sus combatientes y batallar hasta que quede uno
                                          quede vivo, y como se dice en el mundo real... QUE GANE EL MEJOR.\n
                                       5. Asi como seras capaz de elegir que combatiente quieres utilizar tambien seras capaz de crear tu propio personaje
                                          con sus propios golpes y mas.\n
                                       6. Este juego esta creado por la organizacion RJPogra1 Society Project (RJPSP) y esta creado no solo por el simple
                                          hecho de que valga puntos, si no por que queremos que sea el mejor proyecto que se presente en esta aula y que
                                          gane los Grammys y de paso los Oscar el proximo year. (No gana el mundial por que es un proyecto y no un pais)\n
                                       7. Septima y ultima regla pero no menos importante, Disfrute :).
                                       """);
                    do{
                        System.out.print("Presione la letra [v] para volver: ");
                        back = caso3.next().charAt(0);
                        if ((back!='v')&&(back!='V')) {
                            System.out.println("Solo se puede la letra v, ninguna mas. (Para que haya mas validaciones jajaja)");
                        }
                    }while((back!='v')&&(back!='V'));
                    juego = principio();
                    bandera = true;
                    break;
                case 4:
                    bandera = false;
                    break;
                default:
                    System.out.println("Modo de juego no valido.");
                    bandera = true;
                    break;
            }
        }while(bandera);
        System.out.println("Gracias por jugar este maravilloso y merecedor de todos los puntos juego.");
    }
    public static int principio(){
        Scanner modo = new Scanner(System.in);
        System.out.println("---------------------------BIENVENID@ A SUPERKOMBAT I---------------------------");
        System.out.println  ("""
                             Las reglas se diran como dice la inge a grosso modo, es un juego de dos personas, 
                             1 vs 1 o tu eliges si lo quieres jugar contra la maquina pero ten cuidado que la 
                             maquina le sabe bastante pero no te preocupes, seras capaz de elgir la dificultad.
                             
                             SIN MAS DILATACION......................................QUE EMPIEZE LA DIVERSION""");
        System.out.println("--------------------------------------------------------------------------------");
        System.out.println();
        System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<< SELECCIONE EL MODO DE JUEGO QUE DESEA JUGAR >>>>>>>>>>>>>>>>>>>>>>>>>>");
        System.out.println();
        System.out.println("                          [1. UN JUGADOR]                                            ");
        System.out.println("                          [2. DOS JUGADORES]                                         ");
        System.out.println("                          [3. INSTRUCCIONES]                                         ");
        System.out.println("                          [4. SALIR]                                                 ");
        System.out.println();
        int juego;
        do{
            System.out.print("Ingrese el modo de juego [1] o [2] que desee, [3] para saber las instrucciones, [4] para salir: ");
            juego = modo.nextInt();
            if ((juego>4)||(juego<1)){
                System.out.println("Modo de juego o seleccion no es valida, intentelo de nuevo.");
            }
        }while((juego>4)||(juego<1));
        return juego;
    }
    public static void unjug(){
        
    }
}
