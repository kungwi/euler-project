package Problems001_050;
/**
 *
 * @author thales
 */
public class problem032 {
    boolean[] pandig ;
    
    public problem032() {
        pandig = new boolean[10000] ;
        for(int i=0 ; i<10000 ; i++) pandig[i] = false ;
    
        for(int i=1 ; i<100 ; i++)
            for(int j=1 ; j<10000 ; j++) 
                if (pandigitalQ(String.valueOf(i)+String.valueOf(j)+String.valueOf(i*j))) 
                    pandig[i*j] = true ; }
    
    private boolean pandigitalQ(String s) {
        int sum=0 , prod=1 , sumOfsq = 0 ;
        if (s.length()!=9) return false ;
        for(int i=0 ; i<9 ; i++) { 
            prod *= s.charAt(i)-'0' ;
            sum += s.charAt(i)-'0' ;
            sumOfsq += (s.charAt(i)-'0')*(s.charAt(i)-'0') ; }
    if (prod!=362880) return false ;
    if (sum!=45) return false ;
    return sumOfsq == 285 ; }
    
    public int solve() {
        int ans = 0 ;
        for(int i=0 ; i<10000 ; i++) if (pandig[i]) ans += i ;
        return ans ; } }
