package Problems001_050;
/**
 *
 * @author thales
 */
public class problem033 {
    public problem033() {}
    
    private int gcd(int a , int b) {
        if (b==0) return a ;
        else return gcd(b,a%b) ; }
 
    public int solve() {
        int num=1 , den=1 ;
        
        for(int a=1 ; a<10 ; a++)
            for(int c=1 ; c<10 ; c++) {
                if (c==a) continue ;
                int temp1 = 9*a*c , temp2 = 10*a-c ;
                if (temp1%temp2==0) { 
                    int b=temp1/temp2 ; 
                    if (b<10) {
                        num *= 10*a+b ; den *= 10*b+c ; } } }
        
        return den/gcd(num,den) ; } }
