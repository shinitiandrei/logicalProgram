package exercises;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Andrei on 26/01/2016.
 */
public class GetLargestRootToLeafSum {

    // Please do not change this interface
    public static interface Node {
        int getValue();
        List<Node> getChildren();
    }


    public static int getLargestRootToLeafSum(Node root) {

        if (root == null){
            return 0;
        }

        int sumResult = 0;

        List<Integer> sumNodeValues = new ArrayList<>();

        List<Node> nodes = new ArrayList<>();

        int value = root.getValue();

        sumNodeValues.add(value);
        for (Node node : root.getChildren()){
            nodes.add(node);
            sumNodeValues.add(node.getValue());
        }

        for(Integer values : sumNodeValues){
            sumResult += values;
        }
        return sumResult;
    }
}
