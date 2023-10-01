/* 
    1   2   3   4
    2   3   4
    3   4
    4
*/
public class Problem_N44 {
    
    public static void main(String[] args){

        for(int i = 1; i <= 4; i++){
            int num = i;
            for(int j = 4; j >= i; j--){
                System.out.print((num++) + "   ");
            }
            System.out.println("");
        }
    }
}
