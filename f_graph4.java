class GraphDemo {
	public static void main(String []a) {
		//Graph star = new Graph();
		{
		star.create(5, false);

		// 1. There should be a comma in between the arguments
		//star.addEdge(0  1);
		
		star.addEdge(0, 2);
		star.addEdge(0, 3);
		star.addEdge(0, 4);

		// 2. Indexing without providing the subscript is not allowed.
		//components[] = star.connectedComponent();
		}
	}
}
class Graph {
	// 3. When declaring arrays, length is not specified in the type
	//boolean[9][9] adjacency;
	public int create(int nNodes, boolean reflexive) {
		adjacency = new boolean[nNodes][nNodes];
		return 0;
	}
	public int addEdge(int u, int v) {
		int errorCode;
		if (u >= adjacency.length || v >= adjacency.length || u < 0 || v < 0) {
			errorCode = -1;
		} else {
			// 4. numpy-style matrix index? No...
			//adjacency[u, v] = true;
			adjacency[v][u] = true;
			errorCode = 0;
		}
		return errorCode;
	}
	public int removeEdge(int u, int v) {
		
		// 5. Typo. See if your lexical definition works.
		3rrorCode = 0;
		if (u >= 0 && v >= 0 && u < adjacency.length && v < adjacency.length) {
			adjacency[u][v] = false;
			adjacency[v][u] = false;
			errorCode = 0;
		} else {
			errorCode = -1;
		}
		return errorCode;
	}
	public int [] connectedComponent() {
		int []color;
		if (adjacency.length == adjacency[0].length) {
			color = new int[adjacency.length];
			visited = new boolean[adjacency.length];

			/* BFS or DFS, but not complete yet*/
		} else {}
		return color;
	}
}

class MultiGraph extends Graph {
	// edge between 2 nodes can have some multiplicity.
	int[][] multiplicity;
}
