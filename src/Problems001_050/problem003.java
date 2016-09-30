package Problems001_050;
/**
 * @author thales
 */
public class problem003 {
    
    long n ;
    long[] prime ; 
    int np ;
    
    /**
     *
     * @param a
     */
    public problem003(long a) { 
        prime = new long[100000] ;
        n=a ; 
        np=2 ;
        prime[0]=2 ; prime[1]=3 ;
        long k=5 ;
        
        while(2*k*k<=3*n) {
            boolean primeQ = true ;
            
            for(int i=1 ; prime[i]*prime[i]<=k ; i++) 
                if (k%prime[i]==0) { primeQ = false ; break ; }
            
            if (primeQ) { prime[np]=k ; np++ ; }    
            k = k + 2 ; } }
   
    public long solve() {
        
        long m=n , bs=0 ;
        
        for(int l=0 ; prime[l]*prime[l]<=m ; l++) {
            if (m%prime[l]==0) {
                bs=prime[l] ;
                while(m%prime[l]==0) m = m / prime[l] ; } }
        
        if (m>bs) bs = m ;
        
    return bs ; }
}
