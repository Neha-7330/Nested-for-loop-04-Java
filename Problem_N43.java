/* 
    10
    10  9
    9   8   7
    7   6   5   4
*/

public class Problem_N43 {
    
    public static void main(String[] args){

        int num = 10;
        for(int i = 1; i <= 4 ; i++){
            for(int j = 1; j <= i; j++){
                if(num < 10)
                    System.out.print(num + "    ");
                else
                    System.out.print(num + "   ");
            num--;
            }
            num++;
            System.out.println("");
        }


    }
}
