package Problems001_050;
import java.math.* ;
/**
 *
 * @author thales
 */
public class problem035 {
    boolean[] sieve ;
    int lim ;
    
    public problem035(int a) {
        this.lim = a ;
        this.sieve = new boolean[this.lim+1] ;
        for(int i=0 ; i<=this.lim ; i++) this.sieve[i] = true ;
        this.sieve[0] = this.sieve[1] = false ;
        int n = 2 ;
        while(n*n<=this.lim) {
            for(int k=n ; k*n<=this.lim ; k++) this.sieve[k*n] = false ;
            n++ ;
            while(n<=this.lim&&!this.sieve[n]) n++ ; } }
    
    private int pow10(int n) { if (n==0) return 1 ; else return 10*pow10(n-1) ; }
    
    private boolean circular(int n) {
        int ndig = (int)Math.ceil(Math.log10(n)) ;
        int temp = pow10(ndig-1) ;
        
        for(int i=0 ; i<ndig ; i++) {
            n = n/temp+10*(n%temp) ;
            if (!this.sieve[n]) return false ; }
    return true ; }
    
    public int solve() {
        int ans = 0 ;
        for(int n=2 ; n<=this.lim ; n++) if (circular(n)) ans++ ;
        return ans ; } }
