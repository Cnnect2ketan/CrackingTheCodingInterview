public class SortColor {

    public static int[] sortColors (int[] colors) {

        // Write your code here
        int start = 0, end = colors.length-1, current =0;
        while(current<=end ){
            if(colors[current]==0){
                colors[current]=colors[start];
                colors[start]=0;
                start++;
                current++;
                continue;
            }
            if(colors[current]==2){
                colors[current]=colors[end];
                colors[end]=2;
               end--;
            }
            if(colors[current]==1) {
                current++;
            }
        }
        return colors;
    }

    public static void main(String[] args) {
        int[] num = new int[]{0, 1, 0};
        sortColors(num);

    }
}
