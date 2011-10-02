package ioModule;

import java.util.Hashtable;

public class Graph {

	private Hashtable<String, Node> lookup;
	
	
	
	public Graph(Hashtable<String, Node> lookup)
	{
		this.lookup = lookup;
	}
	
	public Hashtable<String, Node> getTable()
	{
		return lookup;
	}
	
}

/*
Graph class (JGraphT?)
- Fast look up speed (position search, hash)
*/