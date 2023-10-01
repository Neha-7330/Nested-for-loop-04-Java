/* 
    1
    8    9
    27   16    125
    64   25    216    49
*/

public class Problem_N49 {

    public static void main(String[] args){
        
        for(int i = 1; i <= 4; i++){
            int num = i;
            for(int j = 1; j <= i; j++){
                
                if(j % 2 != 0 && num == 2)
                    System.out.print((num * num * num) + "     ");

                else if(j % 2 == 0){
                    System.out.print((num * num) + "    ");
                }
                else{
                    System.out.print((num * num * num) + "    ");
                }
                num++;
            }
            System.out.println("");
        }
    }
    
}
