import java.util.Arrays;

public class bagOfTokens {
    static int maxScoreObtained(int tokens[], int power){
        int maxScore =0, temp =0;
        int end = tokens.length -1;
        int beg=0;

        Arrays.sort(tokens);
        
        while(beg <= end){
            if(tokens[beg] <= power){
                power -= tokens[beg];
                temp++;
                maxScore = Math.max(maxScore, temp);
                beg++;
            }
            else if(temp >= 1){
                power += tokens[end];
                temp--;
                end--;
            }
            else{
                break;
            }
        }
        return maxScore;
    }

    public static void main(String[] args) {
        int tokens[] = {100};
        int power = 50;

        System.out.println(maxScoreObtained(tokens, power));
    }
}
