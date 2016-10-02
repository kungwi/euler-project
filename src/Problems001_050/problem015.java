package Problems001_050;
/**
 *
 * @author thales
 */
public class problem015 {
    
    private int dim ;
    private long[][] sol ;
    
    public problem015(int a) {
        dim = a ;
        sol = new long[dim][dim] ;
        
        for(int i=1 ; i<dim ; i++) { 
            sol[i][0]=1 ; sol[0][i]=1 ; }
        
        for(int i=1 ; i<dim ; i++)
            for(int j=1 ; j<dim ; j++)
                sol[i][j] = sol[i-1][j] + sol[i][j-1] ; }
    
    public long solve() { return sol[dim-1][dim-1] ; }
}
