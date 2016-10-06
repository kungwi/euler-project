import Problems001_050.* ;
import java.io.IOException;
/**
 *
 * @author thales
 */
public class mainRun {
    
        public static void main(String[] args) throws IOException {
        long start_time = System.currentTimeMillis();
        problem024 pr = new problem024(10,1000000) ;
        String ans= pr.solve() ;
    
        System.out.println(ans); 
        
        System.out.println("running time: " + (System.currentTimeMillis() - start_time)); }
}
