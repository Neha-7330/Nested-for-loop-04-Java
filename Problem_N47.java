/* 
    F
    E    1
    D    2    E
    C    3    D    4
    B    5    C    6    D
    A    7    B    8    C    9
*/

public class Problem_N47 {
    public static void main(String[] args){

        int num = 1;
        char ch1 = 'F';
        for(int i = 1; i <= 6; i++){
            char ch2 = ch1;
            for(int j = 1; j <= i; j++){
                if(j % 2 == 0){
                    System.out.print((num++) + "    ");
                }
                else{
                    System.out.print(ch2++ + "    ");
                }
            }
            ch1--;
            System.out.println("");
        }
    }
}
