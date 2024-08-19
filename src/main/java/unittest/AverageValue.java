package unittest;

public class AverageValue {
    //Рассчитывает среднее значение каждого списка.

    public int findAverageNumber(int[] numbers){
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
                sum+= numbers[i];
        }
        int averageNumber = sum/numbers.length;
        return averageNumber;
    }

}
