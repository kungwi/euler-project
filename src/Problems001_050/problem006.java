
package Problems001_050;

/**
 *
 * @author thales
 */
public class problem006 {

    int lim ;
    
    public problem006(int a) {
        lim = a ;
    }
    
    public int solve() {
        int ans = 0 ;
        
        for(int i=1 ; i<lim ; i++)
            for(int j=i+1 ; j<=lim ; j++)
                ans += i*j ;
    return 2*ans ; }
    
}
