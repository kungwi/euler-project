import Problems001_050.* ;
import java.io.IOException;
/**
 *
 * @author thales
 */
public class mainRun {
    
        public static void main(String[] args) throws IOException {
        
        problem023 pr = new problem023(30000) ;
        long ans= pr.solve() ;
    
        System.out.println(ans); }
}
