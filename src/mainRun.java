import Problems001_050.* ;
import java.io.IOException;
/**
 *
 * @author thales
 */
public class mainRun {
    
        public static void main(String[] args) throws IOException {
        
        problem022 pr = new problem022("src/p022_names.txt") ;
        long ans= pr.solve() ;
    
        System.out.println(ans); }
}
