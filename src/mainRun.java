import Problems001_050.* ;
import java.io.IOException;
/**
 *
 * @author thales
 */
public class mainRun {
    
        public static void main(String[] args) throws IOException {
        long start_time = System.currentTimeMillis();
        problem025 pr = new problem025(1000) ;
        System.out.println(pr.solve()); 
        System.out.println("running time: " + (System.currentTimeMillis() - start_time)); }
}
