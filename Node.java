package Algorithms;

public class Node implements Comparable<Node>{
	private int x;
	private int y;

	public Node(int num1, int num2){
		x = num1;
		y = num2;
	}

	public Node(Node n){
		x = n.x;
		y = n.y;
	}

	@Override
	public String toString(){
		return "(" + x + "," + y + ")";
	}

	@Override
	public boolean equals(Object o){
		try{
			Node n = (Node)o;
			return n != null && x == n.x && y == n.y;
		}
		catch(Exception e){
			return false;
		}
	}

	public int compareTo(Node o) {
		if(x > o.x){
			return 1;
		}
		if(x < o.x){
			return -1;
		}
		if(y > o.y){
			return 1;
		}
		if(y < o.y){
			return -1;
		}
		return 0;
	}
}
