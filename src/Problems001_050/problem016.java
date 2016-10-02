package Problems001_050;
import java.math.* ;
/**
 *
 * @author thales
 */
public class problem016 {
    
    int[] mul ;
    int len ; 
    int power ;
    
    public problem016(int a) {
        len = 1 ;
        power = a ;
        int nd = (int)(a * Math.log(2) / Math.log(10) + 5) ;
        mul = new int[nd] ;
        mul[0] = 1 ;
        
        for(int i=1 ; i<=power ; i++) {
            int count=0 ;
            for(int j=0 ; j<len ; j++) {
                int temp = 2*mul[j]+count ;
                mul[j] = temp%10 ;
                count = temp/10 ; }
            
            if (count>0) { mul[len]=count ; len++ ; } } }
    
    public int solve() {
        int sum = 0 ;
        for(int i=0 ; i<len ; i++) sum+=mul[i] ; 
    return sum ; }
}
