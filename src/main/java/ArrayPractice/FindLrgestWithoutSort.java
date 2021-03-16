package ArrayPractice;

public class FindLrgestWithoutSort{
    public static void main(String[] args){
//        int [] nums={4,234,76,987,29,12,89};
//        int big=0;
//        for (int i=0;i<nums.length;i++){
//            for (int k=i+1;k<nums.length;k++){
//                if (nums[i]>nums[k]&& big<nums[i]){
//                    big=nums[i];
//                }
//            }
//
//
//        }System.out.println(big);
//        System.out.println();
//        int biggeer =nums[0];
//        for (int i=1;i<nums.length;i++){
//            if (nums[i]>biggeer){
//                biggeer=nums[i];
//
//            }
//        } System.out.println(biggeer);
        int [] nums={10,2,3,6,5,8,9,1};
      int first=nums[0];
      int middle=nums[nums.length/2];
      int last=nums[nums.length-1];
      int large=0;
      if (first>middle){
          large=first;
      }
      if (first>last){
          large=first;
      }if (middle>last){
              large=middle;

      }if (last>first){
          large=last;
        }
        System.out.println(large);

    }
}
