import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");

        ArrayList<Point> arrayList = new ArrayList<Point>();

        Point p1 = new Point();

        arrayList.add(p1);
        arrayList.add(new Point(10,10));
        arrayList.add(new Point(50,5));
        arrayList.add(new Point(2,3));

        System.out.println(arrayList.toString());

        // ordenação default da lista contendo os pontos
        Collections.sort(arrayList);

        System.out.println(arrayList.toString());

        Collections.sort(arrayList, new PointComparator());

        System.out.println(arrayList.toString());

        Point element = arrayList.get(2);

        arrayList.remove(p1);

        for (int i = 0; i < arrayList.size() ; i++) {
            System.out.println(arrayList.get(i));
        }

        Stack<String> stack = new Stack<String>();
        stack.push("Hello");
        String str = stack.pop();

        HashMap<String, Point> map = new HashMap<String, Point>();

        map.put("Point1", new Point());
        map.put("Point2", new Point(10,10));

        Point pm = map.get("Point2");

        map.containsKey("Point 3");

        map.keySet();
        map.values();


    }
}