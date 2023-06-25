package gameOfLife;


import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class GameOfLifeTest1 {






    public static void main(String[] args) throws IOException {


        Cell[] map = {
                new Cell(1, 0, 0), new Cell(0, 0, 1), new Cell(0, 0, 2), new Cell(0, 0, 3),
                new Cell(0, 1, 0), new Cell(1, 1, 1), new Cell(0, 1, 2), new Cell(0, 1, 3),
                new Cell(1, 2, 0), new Cell(0, 2, 1), new Cell(0, 2, 2), new Cell(0, 2, 3),
                new Cell(0, 3, 0), new Cell(0, 3, 1), new Cell(1, 3, 2), new Cell(0, 3, 3),
        };

        for (int i = 0; i < map.length; i++) {
            if( i % 4 == 0) {
                System.out.println('\n');
            }
            System.out.print(map[i].alive);
        }


        List<List<List<Integer>>> list = new ArrayList<>();

        List<List<Integer>> middleList = new ArrayList<>();
        List<Integer> innerList = new ArrayList<>();
        innerList.add(1);
        innerList.add(2);
        innerList.add(3);

        List<Integer> innerList1 = new ArrayList<>();
        innerList1.add(11);
        innerList1.add(21);
        innerList1.add(31);

        List<Integer> innerList2 = new ArrayList<>();
        innerList2.add(12);
        innerList2.add(22);
        innerList2.add(32);
        middleList.add(innerList);
        middleList.add(innerList1);
        middleList.add(innerList2);
        list.add(middleList);


        for (List<List<Integer>> middleListOfList : list) {
            for (List<Integer> listOfInnerList : middleListOfList) {
                System.out.print(listOfInnerList + "  whaat is this == this is the middle list");
                System.out.println();
                for (Integer element : listOfInnerList) {
                    System.out.print(element + " test");
                    System.out.println("");
                }
            }
        }
        System.out.println("the inner");
        System.out.println();
    }



}
