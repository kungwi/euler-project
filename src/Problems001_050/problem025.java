package Problems001_050;
import java.math.BigInteger ;
/**
 *
 * @author thales
 */
public class problem025 {
    int ndig ;
    
    public problem025(int a) {
        this.ndig = a ; }
    
    public int solve() {
     int ind=1 ;
        
        BigInteger prpr = new BigInteger("0") ;
        BigInteger pr = new BigInteger("1") ;
        
        while(pr.toString().length()<ndig) {
            BigInteger fib = pr.add(prpr) ;
            prpr = pr ;
            pr = fib ; 
            ind ++ ; }
    return ind ; } }
