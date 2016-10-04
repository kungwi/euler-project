package Problems001_050;
import java.math.BigInteger ;
/**
 *
 * @author thales
 */
public class problem020 {
    
    int fac ;
    BigInteger factorial ;
    
    public problem020(int a) {
        this.fac = a ;
        this.factorial = new BigInteger("1") ; }
    
    public int solve() {
        int sum = 0 ;
        for(int i=2 ; i<=fac ; i++) {
            BigInteger scalar = BigInteger.valueOf(i) ;
            this.factorial = this.factorial.multiply(scalar) ; }
        
        String s = this.factorial.toString() ;
        for(int i=0 ; i<s.length() ; i++) sum += s.charAt(i)-'0' ;
        
    return sum ; }  
}
