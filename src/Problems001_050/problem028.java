package Problems001_050;
/**
 *
 * @author thales
 */
public class problem028 {
    int n ;
    public problem028(int a) { this.n = a ; }
    public long solve() { 
    long ans ;
        ans = 2*this.n*(this.n+1)*(this.n+2)/3-3*(this.n+1)*(this.n-1)/2-3 ;
    return ans ; } }
