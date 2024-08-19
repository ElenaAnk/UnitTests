package unittest;

import java.util.Arrays;

public class ViewMain {

    public static void main(String[] args) {

        AcceptsTwoLists acceptsTwoLists = new AcceptsTwoLists();
        int[] list1 =  acceptsTwoLists.generateNumber(5);
        int[] list2 =  acceptsTwoLists.generateNumber(5);

        //System.out.println(Arrays.toString(list1));
        //System.out.println(Arrays.toString(list2));

        AverageValue averageValue = new AverageValue();
        int aver1 = averageValue.findAverageNumber(list1);
        int aver2 = averageValue.findAverageNumber(list2);

        //System.out.println(aver1);
        //System.out.println(aver2);

        ComparesValues comparesValues = new ComparesValues();
        comparesValues.compare(aver1,aver2);




    }
}
