package Problems001_050;
import java.util.ArrayList;
/**
 *
 * @author thales
 */
public class problem024 {
  
    private final int n ;
    private final int nth ;
    ArrayList<String> digits;
    
    public problem024(int a , int b) {
        this.n = a ;
        this.nth = b ;
        this.digits = new  ArrayList<>();
        for(int i=0 ; i<this.n ; i++)
            digits.add(i, Integer.toString(i)) ; }
 
    public String solve() {		
        String per = "";
        int i = this.nth ;

        for(int j=this.n-1 ; j>=0 ; j--) {
            int f = factorial(j) ;
            int r = this.nth % f ;
            int d = ((int) i / f) - ((r == 0) ? 1 : 0) ;
            per += digits.remove(d);
            i = (r == 0) ? f : r; } 
     return per ; }
        
    private static int factorial(int a) {
        if (a<2) return 1 ;
        else return a*factorial(a-1) ; } }
