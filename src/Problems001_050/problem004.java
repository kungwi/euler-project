package Problems001_050;
/**
 *
 * @author thales
 */
public class problem004 {
    
    public problem004() {
 
    }
 
    public int solve() {
    int ans = 0 ;    
        for(int i=100 ; i<=999 ; i++)
            for(int j=100 ; j<=999 ; j++)
                if (palindromicQ(i*j)) 
                    if (i*j>ans) ans = i*j ; 
    
    return ans ; }
    
    private boolean palindromicQ(int n) {
        int[] dig = new int[10] ;
        int m = n , nd=0 ;
        
        while(m>0) { dig[nd] = m%10 ; m=m/10 ; nd++ ; }
        
        for(int i=0 ; 2*i<nd ; i++) 
            if (dig[i]!=dig[nd-1-i]) return false ;
 
    return true ; }
}
