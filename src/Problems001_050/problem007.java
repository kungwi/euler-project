package Problems001_050;
/**
 *
 * @author thales
 */
public class problem007 {
    int n ;
    int[] prime ; 
    int np ;
    
    public problem007(int a) { 
        prime = new int[100000] ;
        n=a ; 
        np=2 ;
        prime[0]=2 ; prime[1]=3 ;
        int k=5 ;
        
        while(np<=n) {
            boolean primeQ = true ;
            
            for(int i=1 ; prime[i]*prime[i]<=k ; i++) 
                if (k%prime[i]==0) { primeQ = false ; break ; }
            
            if (primeQ) { prime[np]=k ; np++ ; }    
            k = k + 2 ; } }

    public int solve() { return prime[np-2] ; }
}
