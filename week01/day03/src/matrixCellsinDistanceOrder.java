import java.util.*;

public class matrixCellsinDistanceOrder {

    public int[][] allCellsDistOrder(int R, int C, int r0, int c0) {
        int matrixCol = 2;
        int matrixRow = R*C;
        int[][] matrix = new int[matrixRow][matrixCol];
        HashMap<List<Integer>,Integer> hashmap = new HashMap<>();
        for(int i = 0;i<R;i++){
            for(int j = 0;j<C;j++){
                int distance = Math.abs(r0-i) + Math.abs(c0-j);
                List<Integer> list = new ArrayList<>();
                list.add(i);
                list.add(j);
                hashmap.put(list,distance);
            }
        }
        List<Map.Entry<List<Integer>, Integer> > list =
                new LinkedList<Map.Entry<List<Integer>, Integer> >(hashmap.entrySet());

        Collections.sort(list, new Comparator<Map.Entry<List<Integer>, Integer> >() {
            public int compare(Map.Entry<List<Integer>, Integer> o1,
                               Map.Entry<List<Integer>, Integer> o2)
            {
                return (o1.getValue()).compareTo(o2.getValue());
            }
        });
        int i = 0;
        for (Map.Entry<List<Integer>, Integer> map : list) {
            List<Integer> list1 = new ArrayList<>();
            int j = 0;
            list1 = map.getKey();
            for(int x:list1){
                matrix[i][j]=x;
                j++;
            }
            i++;

        }
        return matrix;
    }
}
