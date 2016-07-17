package users;

public class LinkedList {
	
		private Node start;
		private Node end;
		private Node current;
		private int size;
		
		public LinkedList(){
			start=null;
			end = null;
			size = 0;
		}
		
		public void clear(){
			start = null;
			end = null;
			size = 0;
		}
		
		public void addToStart(DailyWeights t) {
			Node aNode = new Node(t);
			size++;
			if(start == null){
				start = aNode;
				end = start;
			}
			else{
				aNode.setNextNode(start);
				start = aNode;
			}
		}
		
		public void addToEnd(DailyWeights t){
			Node aNode = new Node(t);
			size++;
			if(start == null){
				start = aNode;
				end = start;
			}
			else{
				end.setNextNode(aNode);
				end = aNode;
			}
		}
		
		/* function to insert a new_node in a list. */
//	    public void add(DailyWeights t)
//	    {
//	    	boolean itemAdded = false;
//	         Node aNode = new Node(t);
//	         Node previousNode = start;
//	         /* Special case for head node */
//	         if (start == null)
//	         {
//	        	 start = aNode;
//	 			 end = start;
//	 			 size++;
//	         } else if(start.getItem().toString().compareTo(aNode.getItem().toString())>0){
//	        	 addToStart(t);
//	        	 
//	         }else {
//	         
//	 
//	            /* Locate the node before point of insertion. */
//	 
//	            while (previousNode.getNextNode() != null &&
//	                  previousNode.getNextNode().getItem().getDay().compareTo(previousNode.getItem().getDay())< 0 ){
//	                  previousNode = previousNode.getNextNode();
//	                  System.out.println("hello");
//	            }	
//	            
//	            Node nextNode = previousNode.getNextNode();
//	            previousNode.setNextNode(aNode);
//	            aNode.setNextNode(nextNode);
//	            size++;
//	            
//	         }
//	         
//	     }
		
		public void remove(int position) {

			Node previousNode = start;

			if(position < 1 || position > size){
				throw new UnsupportedOperationException("Not Valid Position");
			}
			
			else if(size == 1){
				start = null;
				end = null;
			}

			else if(position == 1){
				start = start.getNextNode();
			}
			else if(position == size){
				for(int i = 1 ; i<position-1 ; i++){

					if(previousNode.getNextNode() == null){
						throw new UnsupportedOperationException("Not Valid Position");
					}

					previousNode = previousNode.getNextNode();

				}

				previousNode.setNextNode(null);
				end = previousNode;

			}
			else{
				for(int i = 1 ; i<position-1 ; i++){

					if(previousNode.getNextNode() == null){
						throw new UnsupportedOperationException("Not Valid Position");
					}

					previousNode = previousNode.getNextNode();

				}

				Node nodeToBeRemoved = previousNode.getNextNode();
				Node nextNode = nodeToBeRemoved.getNextNode();
				previousNode.setNextNode(nextNode);
				end = nextNode;

			}
			size--;
		}
		
		Node getNode(int position) {

			Node headNode = start;

			for(int i = 1; i<position ; i++){
				if(headNode.getNextNode() == null){
					throw new UnsupportedOperationException("Not Valid Position");
				}

				headNode = headNode.getNextNode();

			}

			return headNode;

		}

		public DailyWeights getDailyWeights(int position) {

			Node aNode;
			aNode = this.getNode(position);
			return aNode.getItem();

		}

		public void printDailyWeights() {

			
			for(int i = 1 ; i<= size;i++){

				System.out.println(this.getDailyWeights(i).getDay() + ": " 
					+ this.getDailyWeights(i).getCurrentWeight());
			}

		}
		
		
		
		public boolean isEmpty(){
			return start == null;
		}
		
		public int getSize(){
			return size;
		}
		
		

	}
