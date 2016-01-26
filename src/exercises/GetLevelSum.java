package exercises;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Andrei on 26/01/2016.
 */
public class GetLevelSum {

    // Please do not change this interface
    public static interface Node {
        int getValue();
        List<Node> getChildren();
    }


    public static int getLevelSum(Node root, int n) {

        if (root == null){
            return 0;
        }

        int result = 0;

        List<Node> nodes = new ArrayList<Node>();
        Object[] array = nodes.toArray();

        if (array[n] == null){
            return 0;
        }

        nodes.add((Node)array[n]);

        for (Node node : nodes){
            result =+ node.getValue();
        }

        return result;


        /*
          Please implement this method to
          traverse the tree and return the sum of the values (Node.getValue()) of all nodes
          at the level N in the tree.
          Node root is assumed to be at the level 1. All its children are level 2, etc.
         */
    }
}
