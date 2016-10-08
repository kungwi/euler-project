package Problems001_050;
/**
 *
 * @author thales
 */
public class problem026 {
    int n ;
    
    public problem026(int a) { this.n = a ; }
    
    public int solve () {
        int ans = -1 , best_cycle=0 ;
    
        for(int nn=2 ; nn<=this.n ; nn++) {
            int i = nn ; 
            while(i%2==0) i=i/2 ;
            while(i%5==0) i=i/5 ;
            if (i==1) continue ;
            int bc=1 , den=1 , rem=10%i ;
            while(rem!=1) { rem=(10*rem)%i ; bc++ ; }
            if (bc>best_cycle) { best_cycle=bc ; ans=nn ; } }
        return ans ; } }
