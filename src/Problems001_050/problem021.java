package Problems001_050;
import java.math.* ;
/**
 *
 * @author thales
 */
public class problem021 {
    
    int[] prime ;
    int[] sumOfdiv ; 
    int tar ;
    int prlim ;
    int np ;

    public problem021(int a) {
        this.tar = a ;
        this.prlim = (int)(Math.sqrt(this.tar)+2) ;
        this.prime = new int[this.prlim] ;
        this.sumOfdiv  = new int[this.tar+100] ;
    
        this.prime[0]=2 ; this.prime[1]=3 ; this.np=2 ;
        int k=5 ;
        while(this.np<this.prlim) {
            boolean primeQ=true ;
            for(int i=1 ; this.prime[i]*this.prime[i]<=k ; i++)
                if (k%prime[i]==0) { primeQ = false ; break ; }
            if (primeQ) { this.prime[this.np] = k ; this.np++ ; }
            k+=2 ; }
     
        this.sumOfdiv[1] = 0 ; this.sumOfdiv[2] = 1 ; this.sumOfdiv[3] = 1 ;
        for(int n=4 ; n<=this.tar ; n++) {
            int mul = 1 , m=n ;
            for(int j=0 ; this.prime[j]*this.prime[j]<=m ; j++) {
                int sum=1 , power=1 ;
                while(m%this.prime[j]==0) { 
                    power*=this.prime[j] ; m=m/prime[j] ; sum += power ; }
                mul = mul*sum ; }
            if (m>1) mul*=m+1 ; 
            this.sumOfdiv[n] = mul-n ; } }  
    
    public int solve() {
        int ans=0 ;
    
        for(int i=1 ; i<=this.tar ; i++)
            if (this.sumOfdiv[i]<i&&this.sumOfdiv[this.sumOfdiv[i]]==i)
                ans += i+this.sumOfdiv[i] ; 
    return ans ; }
}
