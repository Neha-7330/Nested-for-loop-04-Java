/* 
    1
    2   3
    3   4   5
    4   5   6   7
*/

public class Problem_N46 {
    
    public static void main(String[] args){
        for(int i = 1; i <= 4; i++){
            int num = i;
            for(int j = 1; j <= i; j++){
                System.out.print((num++) + "   ");
            }
            System.out.println("");
        }
    }
    
}
