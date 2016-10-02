package Problems001_050;
/**
 *
 * @author thales
 */
public class problem017 {
    
    String[] unit , teens , decs ;
    String ten , hundred , kilo ;
    int unitlen , teenslen , decslen ;
    
    public problem017() {
    
        unit = new String[] {"one", "two", "three", "four", "five", "six", "seven", "eight", "nine"} ;
        teens = new String[] {"eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen" } ;
        decs = new String[] {"twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"} ; 
        ten = "ten" ; hundred = "hundred" ; kilo = "thousand" ;
        
        unitlen = 0 ;
        for(String str : unit) unitlen += str.length() ;
        teenslen = 0 ;
        for(String str : teens) teenslen += str.length() ;
        decslen = 0 ;
        for(String str : decs) decslen += str.length() ;
    }
    
    public int solve() {
        int ans = 0 ;
        ans = ans + 9 * this.unitlen ;
        ans = ans + this.ten.length() ;
        ans = ans + this.teenslen ; 
        ans = ans + 10 * this.decslen ;
        ans = ans * 10 ;
        ans = ans + 900 * this.hundred.length() ; 
        ans = ans + 100 * this.unitlen ;
        ans = ans + this.kilo.length() ;
    
        ans = ans + 9 * 99 * 3 + 3 ;
     return ans ; }
}
