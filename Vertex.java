package BFS;


public class Vertex {
	private String name;
	private boolean visited;
	
	public Vertex(String n)
	{
		name = n;
		visited = false;
	}
	
	public boolean getVisited()
	{
		return visited;
	}
	
	public void setVisited(boolean b)
	{
		visited = b;
	}
	
	public String getName()
	{
		return name;
	}
	
}

