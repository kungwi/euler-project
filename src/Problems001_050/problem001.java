package Problems001_050;

/**
 *
 * @author thales
 */

public class problem001 {
    
    int limit ; // = 1000 ;
    
    public problem001(int a) {
        limit = a ;
    }
    
    public int solve() {
       
        int sum = 0 ;
        
        for(int i=0 ; i<limit ; i++) 
            if (i%3==0||i%5==0) sum = sum + i ;
    
        return sum; }
}
