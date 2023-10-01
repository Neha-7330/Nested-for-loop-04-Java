/* 
    A   B   C   D
    B   C   D
    C   D
    D
*/

public class Problem_N45 {
    
    public static void main(String[] args){
        
        int row = 4;
        char ch = 'A';
        for(int i = 1;i <= row; i++){
            
            if(i == 2)
                ch = 'B';
            else if(i == 3)
                ch = 'C';
            else if(i == 4)
                ch = 'D';
            
            for(int j = row; j >= i; j--){
                System.out.print(ch++ + "   ");
            }
            
            System.out.println("");
        }
    }
}
