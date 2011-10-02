package ioModule;

import java.util.ArrayList;
import java.util.Hashtable;

public class Node {
	
	private int x;
	private int y;
	private int status;
	private ArrayList<Node> connections;
	private ArrayList<Node> nextmoves;
	
	
	public Node(int x, int y, int status, ArrayList<Node> connections)
	{
		this.x = x;
		this.y = y;
		this.status = status;
		this.connections = connections;
	}
	
	
	
	
	
	//WORK IN PROGRESS
	/*
	private Hashtable<String, Node> findMovesHelper(Node n, Hashtable<String, Node> dic)
	{
		return dic;
	}
	
	public ArrayList<Node> findMoves(Node n)
	{
		ArrayList<Node> moves= new ArrayList<Node>();
		Hashtable<String, Node> dic = new Hashtable<String, Node>();
		
		for(int i = 0; i < 6; i ++)
		{
			try
			{
				if (n.getConnections().get(i).getStatus() == 0)
				{
					int x = n.getConnections().get(i).getX();
					int y = n.getConnections().get(i).getY();
					
					String a = Integer.toString(x);
					String b = Integer.toString(y);
					
					moves.add(n.getConnections().get(i));
					dic.put(a.concat(b), n.getConnections().get(i));
				}
				else
				{
					
				}
			}
			catch (NullPointerException e)
			{
				//do nothing
			}
		}
		return moves;
	}
	/*
	
	
	
	
	
	
	
	
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
	
	public ArrayList<Node> getConnections()
	{
		return connections;
	}
	
	public int getStatus()
	{
		return status;
	}
	
	public void setStatus(int status)
	{
		this.status = status;
	}
	
	public int getX()
	{
		return x;
	}
	
	public int getY()
	{
		return y;
	}
}