package ioModule;

import java.util.ArrayList;

public class Node {
	
	private int x;
	private int y;
	private int status;
	private ArrayList<Node> connections;
	
	
	public Node(int x, int y, int status, ArrayList<Node> connections)
	{
		this.x = x;
		this.y = y;
		this.status = status;
		this.connections = connections;
		
	}
	
	/*
	 * Adds node n to index i in ArrayList connections
	 * index 0 --> ww
	 * index 1 --> nw
	 * index 2 --> ne
	 * index 3 --> ee
	 * index 4 --> se
	 * index 5 --> sw
	 */
	public void addConnection(Node n, int i)
	{
		connections.set(i, n);
	}
	
}

/*
Node class
- include neighbors
- include piece status
*/