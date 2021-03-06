package Problems001_050;
/**
 *
 * @author thales
 */
public class problem018 {
    
    int[][] triag ;
   
    public problem018() {
    
        triag = new int[][] {{ 75, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
                                 { 95, 64, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
                                 { 17, 47, 82, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
                                 { 18, 35, 87, 10, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
                                 { 20, 4, 82, 47, 65, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
                                 { 19, 1, 23, 75, 3, 34, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
                                 { 88, 2, 77, 73, 7, 63, 67, 0, 0, 0, 0, 0, 0, 0, 0 },
                                 { 99, 65, 4, 28, 06, 16, 70, 92, 0, 0, 0, 0, 0, 0, 0 },
                                 { 41, 41, 26, 56, 83, 40, 80, 70, 33, 0, 0, 0, 0, 0, 0 },
                                 { 41, 48, 72, 33, 47, 32, 37, 16, 94, 29, 0, 0, 0, 0, 0 },
                                 { 53, 71, 44, 65, 25, 43, 91, 52, 97, 51, 14, 0, 0, 0, 0 },
                                 { 70, 11, 33, 28, 77, 73, 17, 78, 39, 68, 17, 57, 0, 0, 0 },
                                 { 91, 71, 52, 38, 17, 14, 91, 43, 58, 50, 27, 29, 48, 0, 0 },
                                 { 63, 66, 4, 68, 89, 53, 67, 30, 73, 16, 69, 87, 40, 31, 0 },
                                 { 4, 62, 98, 27, 23, 9, 70, 98, 73, 93, 38, 53, 60, 4, 23 } };
        
        for(int i=1 ; i<15 ; i++) {
            triag[i][0] += triag[i-1][0] ;
            triag[i][i] += triag[i-1][i-1] ;
            for(int j=1 ; j<i ; j++) 
                if (triag[i-1][j-1]>triag[i-1][j]) triag[i][j] += triag[i-1][j-1] ;
                else triag[i][j] += triag[i-1][j] ; }
    }
    
    public int solve() {
        int mx=0 ;
        for(int i=0 ; i<15 ; i++) if (triag[14][i]>mx) mx = triag[14][i] ;
    return mx ; }
}
