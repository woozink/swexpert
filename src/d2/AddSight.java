package d2;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
 
public class AddSight {
   public static void main(String[] args) throws IOException {
 
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer str = new StringTokenizer(br.readLine());
        int T = Integer.parseInt(str.nextToken());
        int[][] valArr = new int[T][4];
 
            for(int i=0; i<T; i++){
                str = new StringTokenizer(br.readLine());
                for(int j=0; j<4; j++){
                    valArr[i][j] = Integer.parseInt(str.nextToken());
                }
                int hour = (valArr[i][0]+valArr[i][2])%12;
                int minute = valArr[i][1]+valArr[i][3];
                if(minute>=60){
                    hour = hour+1;
                    minute = minute%60;
                }
                System.out.print("#"+(i+1)+" "+hour+" "+minute);
                System.out.print("\n");
            }
 
    }
}