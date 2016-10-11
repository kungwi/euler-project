import Problems001_050.* ;
import java.io.IOException;
/**
 *
 * @author thales
 */
public class mainRun {
    
        public static void main(String[] args) throws IOException {
        long start_time = System.currentTimeMillis();
        problem034 pr = new problem034() ;
        System.out.println(pr.solve()); 
        System.out.println("running time: " + (System.currentTimeMillis() - start_time)); }
}
