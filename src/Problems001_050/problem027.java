package Problems001_050;

/**
 *
 * @author thales
 */
public class problem027 {
    int[] prime ;
    int np = 2000 ;
    int lim ;
    
    public problem027(int a){
        this.lim = a ;
        this.prime = new int[this.np] ;
    
        this.prime[0] = 2 ; this.prime[1] = 3 ; 
        int n=2 , k=5 ;
        
        while(n<this.np) {
            boolean primeQ = true ;
            for(int i=1 ; this.prime[i]*this.prime[i]<=k ; i++) 
                if (k%this.prime[i]==0) { primeQ = false ; break ; }
            if (primeQ) { this.prime[n] = k ; n++ ; }
            k+=2 ; } }
    
    private boolean primeQ(int n) {
        if (n<2) return false ;
        for(int i=0 ; this.prime[i]*this.prime[i]<=n ; i++)
            if (n%this.prime[i]==0) return false ;
        return true ; }
    
    private int value(int a , int b , int n) {
    return n*n + a*n+b ; }
    
    public int solve() {
        int best_sol=0 , best_s=0 ;
    
        for(int a=-this.lim+1 ; a<this.lim ; a++)
            for(int b=1 ; b<=this.lim ; b++) {
                int seq = 0 , n = 0 ;
                while(primeQ(value(a,b,n))) { seq++ ; n++ ; }
                if (seq>best_s) { best_s = seq ; best_sol = a*b ; } }
    return best_sol ; }
    
}
