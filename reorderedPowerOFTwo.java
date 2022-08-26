import java.util.HashMap;
public class reorderedPowerOFTwo {
    static boolean reorderPossibility(int n){
        HashMap <Integer, int []> hm = new HashMap<>();
        double x = 1e9;
        for (int i = 1; i <= x; i *= 2) {
            int k =i;
            int a[] = {0,0,0,0,0,0,0,0,0,0};
            while(k!=0){
                int num = k%10;
                a[num]++;
                k = k/10;
            }
            hm.put(i, a);
        }

        int ans[] = {0,0,0,0,0,0,0,0,0,0};

        while(n!=0){
            int rem = n%10;
            ans[rem] ++;
            n = n/10;
        }

        for (int i = 1; i <= x; i*= 2) {
            int temp[] = hm.get(i);
            boolean flag = true;            
            for (int j = 0; j <=9 ; j++) {
                if(temp[j] != ans[j]){
                    flag = false;
                    break;
                }
            }
            if(flag == true) return true;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(reorderPossibility(10));
    }
}
