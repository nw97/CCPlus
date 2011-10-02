package ioModule;

import java.util.ArrayList;
import java.util.Hashtable;

public class IO
{
	//Read input from the server
	
	//Initialize the board
	
	//Keep the board up to date (use Graph class)
	
	public Graph createBoard(char[][] matrix)
	{
		Hashtable<String, Node> lookup = new Hashtable<String, Node>();
		ArrayList<Node> empty = new ArrayList<Node>();
		
		for(int i = 0; i < matrix.length; i++) //row length should = 17
		{
			for(int j = 0; j < matrix[0].length; j++) //collumn length should = 25
			{
				if(matrix[i][j] != ' ')
				{
					Node n = new Node(i, j, matrix[i][j], empty);
					
					String a = Integer.toString(i);
					String b = Integer.toString(j);
					
					lookup.put(a.concat(b), n);	//adds a node to the hashtable with key "xy"
				}
			}
		}
		
		for(int i = 0; i < matrix.length; i++) //row length should = 17
		{
			for(int j = 0; j < matrix[0].length; j++) //collumn length should = 25
			{
				if(matrix[i][j] != ' ')
				{
					Node ww = null;
					Node nw = null;
					Node ne = null;
					Node ee = null;
					Node se = null;
					Node sw = null;
					
					if(lookup.contains(Integer.toString(i-2).concat(Integer.toString(j))))
					{
						ww = lookup.get(Integer.toString(i-2).concat(Integer.toString(j)));
					}
					
					if(lookup.contains(Integer.toString(i-1).concat(Integer.toString(j+1))))
					{
						nw = lookup.get(Integer.toString(i-1).concat(Integer.toString(j+1)));
					}
					
					if(lookup.contains(Integer.toString(i+1).concat(Integer.toString(j+1))))
					{
						ne = lookup.get(Integer.toString(i+1).concat(Integer.toString(j+1)));
					}
					
					if(lookup.contains(Integer.toString(i+2).concat(Integer.toString(j))))
					{
						ee = lookup.get(Integer.toString(i+2).concat(Integer.toString(j)));
					}
					
					if(lookup.contains(Integer.toString(i+1).concat(Integer.toString(j-1))))
					{
						se = lookup.get(Integer.toString(i+1).concat(Integer.toString(j-1)));
					}
					
					if(lookup.contains(Integer.toString(i-1).concat(Integer.toString(j-1))))
					{
						sw = lookup.get(Integer.toString(i-1).concat(Integer.toString(j-1)));
					}
					
					lookup.get(Integer.toString(i).concat(Integer.toString(j))).addConnection(ww, 0);
					lookup.get(Integer.toString(i).concat(Integer.toString(j))).addConnection(nw, 0);
					lookup.get(Integer.toString(i).concat(Integer.toString(j))).addConnection(ne, 0);
					lookup.get(Integer.toString(i).concat(Integer.toString(j))).addConnection(ee, 0);
					lookup.get(Integer.toString(i).concat(Integer.toString(j))).addConnection(se, 0);
					lookup.get(Integer.toString(i).concat(Integer.toString(j))).addConnection(sw, 0);

				}
			}
		}
		Graph g = new Graph(lookup);
		return g;
	}
	
	
}
