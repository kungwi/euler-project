package Problems001_050;
/**
 *
 * @author thales
 */
public class problem010 {
     
    int n ;
    int[] prime ; 
    int np ;

    public problem010(int a) { 
        prime = new int[150000] ;
        n=a ; 
        np=2 ;
        prime[0]=2 ; prime[1]=3 ;
        int k=5 ;
        
        while(k<=n+10000) {
            boolean primeQ = true ;
            
            for(int i=1 ; prime[i]*prime[i]<=k ; i++) 
                if (k%prime[i]==0) { primeQ = false ; break ; }
            
            if (primeQ) { prime[np]=k ; np++ ; }    
            k = k + 2 ; } }
    
    public long solve() { 
        long sum=0 ;
        for(int i=0 ; prime[i]<n ; i++) sum += prime[i] ;
    
        return sum ; }
    
}
