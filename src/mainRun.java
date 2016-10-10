import Problems001_050.* ;
import java.io.IOException;
/**
 *
 * @author thales
 */
public class mainRun {
    
        public static void main(String[] args) throws IOException {
        long start_time = System.currentTimeMillis();
        problem029 pr = new problem029(100) ;
        System.out.println(pr.solve()); 
        System.out.println("running time: " + (System.currentTimeMillis() - start_time)); }
}
