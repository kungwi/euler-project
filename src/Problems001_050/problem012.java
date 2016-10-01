package Problems001_050;
/**
 *
 * @author thales
 */
public class problem012 {
    
    int[] prime ;
    int[] ndiv ;
    int tar ;
    int np ;
    
    public problem012(int a) {
        tar = a ;
        prime = new int[10000] ;
        ndiv  = new int[500000] ;
    
        prime[0]=2 ; prime[1]=3 ; np=2 ;
        ndiv[1] = 1 ; ndiv[2] = 2 ; ndiv[3] = 2 ; }
    
    public long solve() {
        long ans ;
        
        int k=4 ;
        while(true) {
            int nd=1 , m=k ; 
            for(int i=0 ; prime[i]*prime[i]<=m ; i++) {
                int fr=1 ;
                while(m%prime[i]==0) { m = m/prime[i] ; fr++ ; }
                nd = nd * fr ; }
            
            if (m==k) { prime[np] = k ; np++ ; ndiv[k] = 2 ; }
            else { 
                if (m>1) nd = nd * 2 ; 
                ndiv[k] = nd ;
                }
        
            if (k%2==0) { 
                int temp = gcd(k/2,k-1) ;
                if (ndiv[k/2/temp]*ndiv[(k-1)/temp]*ndiv[temp]>tar) { 
                    ans = (k/2)*(k-1) ;
                    return ans ; } }
            else {
                int temp = gcd((k-1)/2,k) ;
                if (ndiv[(k-1)/2/temp]*ndiv[k/temp]*ndiv[temp]>tar) { 
                    ans = (k/2)*(k-1) ;
                    return ans ; } } 
            k++ ; } }
    
    private int gcd(int a , int b) {
        if (b==0) return a; 
        else return gcd(b, a%b) ; }
    
}
