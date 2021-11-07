
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;



public class Node {
     
    private String Name ;

    private LinkedList<Node> ShortestPath = new LinkedList<> ();   //shortest path tracker

    private Integer distance = Integer.MAX_VALUE;   // distance tracker

    private Map <Node, Integer> adjacentNodes = new HashMap<>();   


    public Node (String name) {
        this.Name = name;
    }

    public void addDestination (Node destination , int distance) {
        adjacentNodes.put(destination,distance);


    }

    public String getName (){
        return Name;
    }

    public void setName (String name) {
        this.Name =name;
    }

    public Map<Node ,Integer> getAdjacentNode () {
        return adjacentNodes;
    }

    public void setAdjacentNode (Map <Node, Integer> adjacentNodes) {
        this.adjacentNodes = adjacentNodes;
    }

    public Integer getdistance() {
        return distance;
    }

    public void setdistance ( Integer distance) {
        this.distance =distance;
    }

    public List<Node> getShortestpath () {
        return ShortestPath;
    } 


    public void setShortestPath ( LinkedList <Node> shortestPath) {
        this.ShortestPath = shortestPath;

    }

}
