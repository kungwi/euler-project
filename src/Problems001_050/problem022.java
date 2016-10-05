package Problems001_050;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;
/**
 *
 * @author thales
 */
public class problem022 {
    String[] names ;
    
    public problem022(String s) throws FileNotFoundException, IOException {
        BufferedReader reader ;
        reader = new BufferedReader(new FileReader(s));
        String name ;
        while ((name=reader.readLine())!=null) 
            names = name.replace("\"", "").split(",");
        Arrays.sort(names); }

    private int value(String s) {
        int sum = 0 ;
        for(int i=0 ; i<s.length() ; i++) 
            sum += 1-'A'+s.charAt(i) ; 
    
        return sum ; }

    public int solve() {
        int ans=0 ;
        for (int i=0 ; i<names.length ; i++) ans += value(names[i])*(i+1) ;
    return ans ; }    
}

