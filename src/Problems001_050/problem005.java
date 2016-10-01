package Problems001_050;
import java.math.*;
/**
 *
 * @author thales
 */
public class problem005 {
    
    int lim ;
    int[] prime ; 
    
    public problem005(int a) {
        prime = new int[10000] ;
        lim=a ; 
        int np=2 ;
        prime[0]=2 ; prime[1]=3 ;
        int k=5 ;
        
        while(k<=2*lim) {
            boolean primeQ = true ;
            
            for(int i=1 ; prime[i]*prime[i]<=k ; i++) 
                if (k%prime[i]==0) { primeQ = false ; break ; }
            
            if (primeQ) { prime[np]=k ; np++ ; }    
            k = k + 2 ; }    
    }
    
    private int power(int a , int b) {
        if (b==0) return 1 ;
        else return power(a,b-1)*a ;
    }
    
    public int solve() {
        int ans = 1 ;
        
        for(int i=0 ; prime[i]<=lim ; i++) {
            int ex = (int)(0.000001 + Math.log(lim)/Math.log(prime[i])) ;
            ans = ans * power(prime[i] , ex) ;
        }
        
    return ans ; }
}
