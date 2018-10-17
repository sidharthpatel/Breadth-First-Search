package BFS;

import java.util.*;
import java.io.*;

public class BFSTest {

	public static void main(String[] args) {
		
		Graph g = new Graph();
		Scanner s = null;
		try {
		s = new Scanner(new File ("searchtest.txt"));
		}
		catch (FileNotFoundException e)
		{
			System.out.println("File Not Found");
			System.exit(0);
		}

		
		int numVerts = s.nextInt();
		
		for(int i = 0; i < numVerts; i++)
		{
			Vertex v = new Vertex(s.next());
			g.addVertex(v);
		}
		
		do
		{
			String from = s.next();
			String to = s.next();
			int weight = s.nextInt();
			Edge e = new Edge(g.findVertex(from), g.findVertex(to), weight);
			g.addEdge(e);
			Edge e1 = new Edge(g.findVertex(to), g.findVertex(from), weight);
			g.addEdge(e1);
		} 	while (s.hasNext());
		System.out.println("Breadth First Search");
		g.bfs("Vancouver", "LittleRock");
		System.out.println();
		System.out.println();
		System.out.println("Depth First Search");
		g.resetVisited();
		g.dfs("Vancouver", "LittleRock");
		
		s.close();
		
	}

}
