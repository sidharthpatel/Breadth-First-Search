package BFS;

import java.util.*;
import java.io.*;

public class Graph {
	
	private ArrayList<Vertex> vertices;
	private ArrayList<Edge> edges;
	
	public Graph()
	{
		vertices = new ArrayList<Vertex>();
		edges = new ArrayList<Edge>();
	}
	public void addVertex(Vertex v)
	{ 
	vertices.add(v);
	}
	
	public void addEdge(Edge e)
	{
		edges.add(e);
	}
	public Vertex findVertex(String s)
	{
		for(Vertex v: vertices)
		{
			if(v.getName().equals(s))
				return v;
		}
		return (Vertex)null;
	}

	public void resetVisited()
	{
		for(Vertex v: vertices)
		{
			v.setVisited(false);
		}
	}
	
	public void bfs(String from, String to)
	{
		Queue q = new Queue();
		for(Vertex v : vertices){
			v.setVisited(false);
		}
		q.enQueue(from);
		while(!q.isEmpty()){
			Vertex v = findVertex(q.deQueue());
			if(!v.getVisited()){
				v.setVisited(true);
				System.out.println(v.getName());
				if(v.getName().equals(to)){
					return;
				}
			}

			for(Edge e : edges){
				if(e.getFrom().getName().equals(v.getName())){
					q.enQueue(e.getTo().getName());
				}
		}
		}
	}
	public void dfs(String from, String to)
	{
		Stack s = new Stack();
		s.push(from);
		for(Vertex v : vertices){
			v.setVisited(false);
		}
		while(!s.isEmpty()){
			Vertex v = findVertex(s.pop());
			if(!v.getVisited()){
				v.setVisited(true);
				System.out.println(v.getName() + "  ");
				if(v.getName().equals(to)){
					return;
				}
			}
			String f = v.getName();
			for(Edge e : edges){
				if(e.getFrom().getName().equals(f)&& !(e.getTo().getVisited())){
					s.push(e.getTo().getName());
				}
			}
		}	
	}
}