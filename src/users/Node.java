package users;

//this class is used to implement the LinkedList class with DailyWeights Objects
public class Node {
	
	private DailyWeights weight;
	private Node nextNode;
	
	public Node(DailyWeights i){
		this.nextNode = null;
		this.weight = i;
	}
	
	public DailyWeights getItem(){
		return weight;
	}
	
	public Node getNextNode() {
		return nextNode;
	}
	
	public void setNextNode(Node nextNode){
		this.nextNode = nextNode;
	}
}
