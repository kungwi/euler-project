package Problems001_050;
/**
 *
 * @author thales
 */
public class problem031 {
    int money ;
    int[] coins = {1, 2, 5, 10, 20, 50, 100, 200} ;
    int[] sol ; 
    
    public problem031(int a) {
        this.money = a ;
        this.sol = new int[this.money+1] ; 
        this.sol[0] = 1 ;
        for(int i=0 ; i<8 ; i++)
            for(int j=coins[i] ; j<=this.money ; j++)
                sol[j] += sol[j-coins[i]] ; }
    
    public int solve() { return this.sol[this.money] ; } }
