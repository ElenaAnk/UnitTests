package unittest;

import java.util.Random;

public class AcceptsTwoLists {
    //Создайте программу , которая принимает два списка чисел и выполняет следующие действия:

    public int[] generateNumber(int arraySize){
        Random random = new Random();
        int[] numbersOne = new int[arraySize];
        for (int i = 0; i < arraySize; i++) {
            numbersOne[i] = random.nextInt(100);
        }
        return numbersOne;
    }


}
