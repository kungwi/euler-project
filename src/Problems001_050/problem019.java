package Problems001_050;
/**
 *
 * @author thales
 */
public class problem019 {
    
    private int year_st , year_en ;
    private int month_st , month_en ;
    private int day ;
    private int count ;
    
    public problem019() {
        this.year_st = 1901 ; this.month_st=1 ; 
        this.year_en = 2001 ; this.month_en=1 ;
        this.day = 1 ;
        this.count = 0 ;
    }
    
    public int solve() {
         int y = this.year_st ; int m= this.month_st ;   
         
         while(y!=this.year_en || m!=this.month_en) {
            if (dayOn(y,m,this.day)==0) this.count++ ;
         
            m++ ; if (m==13) { y++ ; m=1 ; } }
         
    return count ; }
    
    private int dayOn(int y , int m , int d) {
        m -= 2;
        if (m<=0) { m+=12 ; y-=1 ; }
        int cen=y/100 ; y%=100 ;

        int ans , tmp1 , tmp2 , tmp3 ;
        tmp1 = (int)Math.floor(2.6*m-0.2) ;
        tmp2 = (int)Math.floor((double)y/4) ;
        tmp3 = (int)Math.floor((double)cen/4) ;
        ans = (tmp1 + tmp2 + tmp3 + d + y - 2*cen)%7 ;
    
    return ans ; }
    
}
/*
public class Problem19 {

    public void solve() {

        int y = 1901, m = 1, d = 1;
        int firstSundayCnt = 0;

        while(y != 2001) {
            if(gaussDay(y, m, d) == 0) {
                firstSundayCnt++;
            }
            // update variables
            if(m == 12) {
                y++;
                m = 1;
            }
            else {
                m++;
            }
        }
        System.out.println(firstSundayCnt);
    }

    private int gaussDay (int y, int m, int d){

        m -= 2;
        if(m <= 0) {
            m += 12;
            y -= 1;
        }
        int c = y / 100;
        y %= 100;

        int weekday, tmp1, tmp2, tmp3;
        tmp1 = (int)Math.floor(2.6*m-0.2);
        tmp2 = (int)Math.floor((double)y / 4);
        tmp3 = (int)Math.floor((double)c / 4);
        weekday = (d + tmp1 + y + tmp2 + tmp3 - 2*c) % 7;

        return weekday;
    }
}*/