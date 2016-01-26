package exercises;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Andrei on 25/01/2016.
 */
public class TraverseTreeInDepth {

    // Please do not change this interface
    public static interface Node {
        int getValue();
        List<Node> getChildren();
    }

    public static void main(String[] args) {

    }

    public static List<Node> traverseTreeInDepth(Node root) {

        if (root == null){
            return null;
        }

        List<Node> nodes = new ArrayList<>();

        Integer value = root.getValue();

        if (value != null){
            for (Node node : root.getChildren()){
                nodes.add(node);
            }
        }
        return nodes;
    }
}
