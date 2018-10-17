package BFS;

public class Edge {

	private Vertex fromVertex;
	private Vertex toVertex;
	private int weight;

	public Edge (Vertex f, Vertex t, int w)
	{
		fromVertex = f;
		toVertex = t;
		weight=w;
	}
	
	public int getWeight()
	{
		return weight;
	}
	
	public Vertex getFrom()
	{
		return fromVertex;
	}
	
	public Vertex getTo()
	{
		return toVertex;
	}
}
