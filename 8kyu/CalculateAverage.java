// DESCRIPTION:
//Write a function which calculates the average of the numbers in a given list.
//Note: Empty arrays should return 0.
public class CalculateAverage {

    public static void main(String[] args) {
        System.out.println(find_average(new int[]{1,1,1}));
    }
    public static double find_average(int[] array){
        double sum = 0;
        if(array.length==0){
            return 0;
        }else{
            for(int i: array){
                sum+=i;
            }
        }
        return sum/(array.length);
    }
}
