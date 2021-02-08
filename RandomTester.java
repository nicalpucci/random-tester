import java.util.Random;
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
}
