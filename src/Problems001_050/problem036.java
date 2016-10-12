package Problems001_050;
/**
 *
 * @author thales
 */
public class problem036 {
    int lim ;
    public problem036(int a) { this.lim = a ; }
    
    private boolean palindromicQ(int n , int base) {
        int rev = 0 , m = n ;
        while(m>0) { 
            rev = base*rev + m%base ;
            m = m/base ; }
    return n==rev ; }
    
    public int solve() {
        int ans = 0 ;
        for(int i=0 ; i<=this.lim ; i++) 
            if (palindromicQ(i,10)&&palindromicQ(i,2)) ans += i ;
    return ans ; } }
