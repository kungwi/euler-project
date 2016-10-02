package Problems001_050;
/**
 *
 * @author thales
 */
public class problem014 {
    
    private long[] len ;
    private int n ;
    private long ans ;
    private long p ;
    
    public problem014(int a) {
        n=a ;
        len = new long[n+1] ;
        for(int i=0 ; i<n ; i++) len[i] = 0 ; 
        ans = 0 ; len[1]=1 ; len[2]=2 ;
    }
    
    public long solve() {
        for(int k=3 ; k<n ; k++) {
            long temp = leng(k) ;
            if (len[k]>ans) { ans=len[k] ; p=k ;} 
        }
    return p ; }
    
    private long leng(long a) {
        if (a>n) return leng(collatz(a))+1 ;
        int t = (int)a ;
        if (len[t]>0) return len[t] ;
        
        len[t] = leng(collatz(a)) + 1 ; 
        return len[t] ;  }
    
    
    private long collatz(long a) {
        if (a%2==0) return a/2 ;
        else return 3*a+1 ;
    }
    
}
