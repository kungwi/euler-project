package Problems001_050;
/**
 *
 * @author thales
 */
public class problem034 {
    int lim ;
    
    public problem034() { this.lim = 7*factorial(9) ; }
    
    private int factorial(int n) { return n<2?1:n*factorial(n-1) ; }
    
    private int value(int n) {
        int sum=0 ;
        while (n>0) { sum+=factorial(n%10) ; n/=10 ; }
    return sum ; }
    
    public int solve() {
        int ans = 0 ;
        for(int n=10 ; n<=this.lim ; n++)
            if (n==value(n)) ans+=n ;
        return ans ; } }
