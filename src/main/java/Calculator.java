/**
 * Created by Jaisheel.Mistry on 2016/05/16.
 */
public class Calculator {


    public int add(String nums){
        String[] numbers = nums.split(",");
        int sum =0;
        for (String number : numbers) {
            sum += Integer.parseInt(number) + 3;
        }
        return sum;
    }
}
