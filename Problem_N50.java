/* 
    1
    8   9
    9   64   25
    64  25   216   49
*/

public class Problem_N50 {
    
    public static void main(String[] args){
        
        for(int i = 1; i <= 4; i++){
            int num = i;
            for(int j = 1; j <= i; j++){
                if(num % 2 == 0){
                    System.out.print((num * num * num) + "   ");
                }
                else{
                    System.out.print((num * num) + "   ");
                }
                num++;
            }
            System.out.println("");
        }
    }
}
