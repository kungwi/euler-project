package Problems001_050;
/**
 *
 * @author thales
 */
public class problem030 {
    int pw ;
    int lim ;
    
    public problem030(int a) {
        this.pw = a ;
        this.lim = power(10,this.pw+1)/2 ; }
    
    private int sumOfdig(int k) {
        int ans=0 ,n=k ;
        while(n>0) { 
            ans += power(n%10,this.pw) ; n=n/10 ; }
    return ans ; }
    
    private int power(int a ,int p) {
        if (p==1) return a ; 
        else return a*power(a,p-1) ; }
    
    public int solve() {
        int sum=0 ;
        for(int n=2 ; n<this.lim ; n++)
            if (n==sumOfdig(n)) sum += n ;
    return sum ; } }
