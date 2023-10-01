/* 
    10
    I    H
    7    6    5
    D    C    B    A
*/

public class Problem_N48 {
    
    public static void main(String[] args){

        int num = 10;
        char ch = 'J';
        for(int i = 1; i <= 4; i++){
            int row = i;
            for(int j = 1; j <= i; j++){
                if(row % 2 == 0){
                    System.out.print((ch) + "    ");
                }
                else{
                    System.out.print((num) + "    ");
                }
                ch--;
                num--;
            }
            System.out.println("");
        }
    }
}
