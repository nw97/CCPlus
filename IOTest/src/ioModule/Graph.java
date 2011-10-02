package ioModule;

import java.util.Hashtable;

public class Graph {

	private Hashtable<String, Node> lookup;
	
	public Graph(Hashtable<String, Node> lookup)
	{
		this.lookup = lookup;
	}
	
}

/*
Graph class (JGraphT?)
- Look at outside sources
- Fast look up speed (position search, hash)
*/