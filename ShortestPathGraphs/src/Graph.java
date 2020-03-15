import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Graph <T>{
    // The Hashmap stores the edges in the graph
    private Map<T, List<T>> map = new HashMap<>();

    // function to add a new vertex to the graph
    public void addVertex(T s) {
        map.put(s, new LinkedList<T>());
    }

    // function to add edge between source and destination
    public void addEdge(T source, T destination, boolean bidirectional) {
        if(!map.containsKey(source)) {
            addVertex(source);
        }
        if (!map.containsKey(destination)) {
            addVertex(destination);
        }

        map.get(source).add(destination);
        if (bidirectional==true) {
            map.get(destination).add(source);
        }
    }
}
