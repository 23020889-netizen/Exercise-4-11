import java.util.List;

public class ListSortable {
    public static <T extends Comparable<T>> List<T> sort(List<T> list) {
        if (list == null || list.size() <= 1) {
            return list;
        }

        T temp;
        for (int i = 0; i < list.size() - 1; i++) {
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(i).compareTo(list.get(j)) > 0) {
                    temp = list.get(i);
                    list.set(i, list.get(j));
                    list.set(j, temp);
                }
            }
        }
        return list;
    }

    public void printf(List<?> list) {
        for (Object temp : list) {
            System.out.println(temp.toString());
        }
    }
}
