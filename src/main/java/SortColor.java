public class SortColor {

    public static int[] sortColors (int[] colors) {

        // Write your code here
        int start = 0, end = colors.length-1, current =0;
        while(start<end){
            if(colors[current]==0){
                colors[current]=colors[start];

            }
        }
        return colors;
    }
}
