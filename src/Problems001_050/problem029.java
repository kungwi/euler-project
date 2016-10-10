package Problems001_050;
import java.util.* ;
import java.math.* ;
/**
 *
 * @author thales
 */
public class problem029 {
    int lim ;
    
    public problem029(int a) { this.lim = a ; }
    
    public int solve() {
        Set<BigInteger> powers = new HashSet<>() ;
        for(int a=2 ; a<=100 ; a++)
            for(int b=2 ; b<=100 ; b++)
                powers.add(power(a,b)) ;
    return powers.size() ; }
    
    private BigInteger power(int a, int b) {
	if (b==0) return BigInteger.ONE ;
	else return BigInteger.valueOf(a).multiply(power(a,b-1)); }
}
