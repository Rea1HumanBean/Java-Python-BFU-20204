import Taks_5.TwiceEven;
import Task_1.InputUtils;
import Task_1.SyracuseSequence;
import Task_2.Sequence;
import Task_3.TreasureMap;
import Task_4.LogisticMaximum;

public static void main(String[] args) {
    //Task_1
    SyracuseSequence sequential = new SyracuseSequence(InputUtils.setNumber());
    sequential.startPassage();

    //Task_2
    Sequence sequence = new Sequence();
    sequence.sumAltSequence();

    //Task_3
    TreasureMap map = new TreasureMap();
    map.quantityOfSteps();

    //Task_4
    LogisticMaximum heightTruck = new LogisticMaximum();
    heightTruck.findMaxHeightAndNumberPath();

    //Task_5
    TwiceEven even = new TwiceEven();
    even.isEvenTwice();
}