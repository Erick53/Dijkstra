import java.util.Set;
import java.util.HashSet;




public class graph {

    // creation of a new hashset of nodes.
    private Set <Node> nodes = new HashSet<>() ;  


    // add nodes method
    public void addNodes ( Node nodeA) {
        nodes.add(nodeA) ;
    }

    //get nodes method

    public Set<Node> getNode () {
        return nodes;
    }



    //set nodes method
    public void setNodes(Set<Node> nodes) {
        this.nodes = nodes;
    }

}
