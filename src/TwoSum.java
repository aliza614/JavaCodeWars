public class TwoSum {
        public static int[] twoSum(int[] numbers, int target) {
            for(int i=0;i<numbers.length;i++)
                for(int j=0;j<numbers.length;j++){
                    // Do your magic!
                    if(i!=j && numbers[i]+numbers[j]==target){
                        return new int[]{i,j};
                    }
                }
            return new int[]{};
        }

}
