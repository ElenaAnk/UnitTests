package unitTests;

import org.junit.jupiter.api.Test;
import unittest.AcceptsTwoLists;
import unittest.AverageValue;
import unittest.ComparesValues;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;


import static java.lang.System.out;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class UnitTest {

    protected final ByteArrayOutputStream output = new ByteArrayOutputStream();

@Test
    public void arraySizetest(){ //проверка, что длина массива равна заданному размеру
    AcceptsTwoLists acceptsTwoLists = new AcceptsTwoLists();
    int [] array = acceptsTwoLists.generateNumber(5);

    assertEquals(5,array.length);
}

@Test
    public void testAverageVal(){ //проверка среднего значения
    AverageValue averageValue = new AverageValue();
    int [] numbers = {1,2,3,4,5};
    int result = averageValue.findAverageNumber(numbers);
    assertEquals(3,result);
}

@Test
    public void testCompare1(){//проверка ответа метода, если первое число больше второго
    ComparesValues comparesValues = new ComparesValues();
    System.setOut(new PrintStream(output));
    comparesValues.compare(2,1);
    assertEquals("Первый список имеет большее среднее значение",output.toString().trim());
}

@Test
public void testCompare2(){//проверка ответа метода, если второе число больше первого
    ComparesValues comparesValues = new ComparesValues();
    System.setOut(new PrintStream(output));
    comparesValues.compare(1,2);
    assertEquals("Второй список имеет большее среднее значение",output.toString().trim());
}

    @Test
    public void testCompare3(){//проверка ответа метода, если числа равны
        ComparesValues comparesValues = new ComparesValues();
        System.setOut(new PrintStream(output));
        comparesValues.compare(2,2);
        assertEquals("Средние значения равны",output.toString().trim());
    }

    @Test
    public void testBig(){
        AcceptsTwoLists acceptsTwoLists = new AcceptsTwoLists();
        int [] array1 = acceptsTwoLists.generateNumber(5);
        int [] array2 = acceptsTwoLists.generateNumber(5);

        AverageValue averageValue = new AverageValue();
        int av1 = averageValue.findAverageNumber(array1);
        int av2 = averageValue.findAverageNumber(array2);

        System.setOut(new PrintStream(output));

        ComparesValues comparesValues = new ComparesValues();
        comparesValues.compare(av1,av2);

        if (av1>av2){
            assertEquals("Первый список имеет большее среднее значение",output.toString().trim());
        } else if (av2>av1) {
            assertEquals("Второй список имеет большее среднее значение",output.toString().trim());
        } else if (av1==av2) {
            assertEquals("Средние значения равны",output.toString().trim());
        }

    }
}
