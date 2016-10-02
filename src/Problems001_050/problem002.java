package Problems001_050;
/**
 *
 * @author thales
 */
public class problem002 {

    private int limit ; //  = 4000000 ;
    
    public problem002(int a) {
        limit = a ;
    }
    
    public int solve() {
       
        int pr = 8 , prpr = 2 , ans = 10 ;
        
            while(4*pr+prpr<=limit) {
                int temp=prpr ; 
                prpr = pr ; 
                pr = 4*pr+temp ;
                ans += pr ;  }  
    
    return ans ; }
}
