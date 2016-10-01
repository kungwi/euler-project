package Problems001_050;

/**
 *
 * @author thales
 */
public class problem009 {

    int n ;
    
    public problem009(int a) {
        n = a ;
    }
    
    public int solve() {
        int a , b , c ;
        a=0 ; b=0 ; c=0 ;
        
        for(int i=1 ; i<n ; i++) {
            int num = n*(n-2*i) , den = 2*(n-i) ;
            if (num%den==0) {
                a=i ; b=num/den ; c=n-a-b ; 
                break ; } }
        
    return a*b*c ; }   
}
