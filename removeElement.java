public class removeElement {
    static int removingElements(int nums[],int val){
        int s = 0, e = nums.length-1;
        while(s<=e){
            if(nums[e] == val) e--;

            else if(nums[s] == val) {
                int temp = nums[s];
                nums[s] =  nums[e];
                nums[e] = temp;
                s++; e--;
            }

            else s++;
        }

        int k =0;

        for (int i : nums) {
            if(i!=val){
                System.out.println(i);
                k++;
            }
            else System.out.println("_");
        }
        return k;
    }

    public static void main(String[] args) {
        int nums[] = {0,1,2,2,3,0,4,2};
        int val = 2;
        System.out.println(removingElements(nums, val));
    }
}