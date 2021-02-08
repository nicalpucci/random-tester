import java.util.Random;
import java.util.ArrayList;
/**
 * RandomTester class will teach me to use Random().
 * 
 * @author (Nicolas Alfonso Pucci) 
 * @version (1.0)
 */
public class RandomTester
{
    private Random azar = new Random();
    /**
     * Constructor for objects of class RandomTester
     */
    public RandomTester()
    {
        
    }

    /**
     * no recibe parámetros e imprime por pantalla 
     * un número aleatorio.
     */
    public void printOneRandom(){
        System.out.println(azar.nextInt());
    }
    
    /**
     * recibe un parámetro de tipo int para especificar 
     * cuántos números queremos y luego imprime por pantalla 
     * la cantidad apropiada de números aleatorios.
     * 
     * @maxNum
     */
    public void printMultiRandom(int maxNum) {
        int position = 1;
        int i = 0;
        while(i < maxNum) {
            System.out.println(position + "-. " + 
            azar.nextInt());
            i++;
            position++;
        }
    }
    
    /**
     * no recibe parámetros y que devuelva un número aleatorio 
     * comprendido entre 1 y 6 (ambos inclusive), para simular 
     * el lanzamiento de un dado.
     */
    public void lanzarDado() {
        int num = 7;
        int ran = azar.nextInt(num - 1) + 1;
        System.out.println(ran);
        
    }
    
    /**
     * no recibe parámetros y que devuelva aleatoriamente una 
     * de las cadenas "si", "no" o "quizás".
     */
    public void getRespuesta(){
        ArrayList <String> respuestas = new ArrayList <String>();
        respuestas.add("si");
        respuestas.add("no");
        respuestas.add("quizá");
        System.out.println(respuestas.get(azar.nextInt(3)));
    }
    
    /**
     * admite un parámetro max y genere un numero aleatorio 
     * comprendido en el rango entre 1 y max (inclusive).
     * 
     * @max
     */
    public void getNumeroEntre1Y (int max) {
        int ran = azar.nextInt(max) + 1;
        System.out.println(ran);
    }
    
    /**
     * admita un parámetro max y genere un numero aleatorio 
     * comprendido en el rango entre 1 y max (inclusive).
     * 
     * @max
     * @min
     */
    public void getNumeroEntre (int min, int max) {
        int ran = azar.nextInt(max + 1 - min) + min;
        System.out.println(ran);
    }
}
