
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map.Entry;
import java.util.Set;


public class Dijkstra {
    

    public static graph calculateShortestPath (graph graph ,Node source) {

        source.setdistance(0);

        Set <Node> unsettled = new HashSet<>();
        Set <Node> settled = new HashSet<>();

        unsettled.add(source);

        // while there are still nodes in the graph, keep searching.

        while (unsettled.size() != 0) {
            Node currentNode = getLowestDistance (unsettled);

            unsettled.remove(currentNode);


            for (Entry<Node,Integer> adjacancypair: currentNode.getAdjacentNode().entrySet()) {
                Node adjacentNode = adjacancypair.getKey() ;
                Integer edgeWeight = adjacancypair.getValue();
                


                if (!settled.contains(adjacentNode)) {
                    CalculateMinimunDistance (adjacentNode,edgeWeight,currentNode);
                    unsettled.add(adjacentNode);
                }
            }
            settled.add(currentNode);
        }

        return graph;


    }


    private static void CalculateMinimunDistance (Node evaluatedNode , Integer edgeWeight, Node SourceNode) {
    Integer sourceDistance = SourceNode.getdistance();  

    if (sourceDistance + edgeWeight < evaluatedNode.getdistance()) {
        evaluatedNode.setdistance(sourceDistance + edgeWeight);

        LinkedList <Node> shortestPath = new LinkedList<> (SourceNode.getShortestpath());
        shortestPath.add(SourceNode);
        evaluatedNode.setShortestPath(shortestPath);
    }

    }

    private static Node getLowestDistance (Set <Node> unsettledNode){

        Node lowestDistanceNode =null;

        Integer lowestDistance =Integer.MAX_VALUE;

        for(Node node: unsettledNode) {
            int nodeDistance = node.getdistance();

            if(nodeDistance <lowestDistance) {
                lowestDistance =nodeDistance;
                lowestDistanceNode =node;
            }
        }
            return lowestDistanceNode;
    }

    
}
