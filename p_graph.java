// This code contains the following legitimate syntax usages
// - Method calls with no arguments
// - A class with some members
// - Multi-dimensional array declaration, creation, and usage
// - Complicated boolean expression with comparison and logical operation
// - '.length' opearation on different levels of 2D array

class GraphDemo {
	public static void main(String []a) { {
		x = star.create(5, false);
		x = star.addEdge(0, 1);
		x = star.addEdge(0, 2);
		x = star.addEdge(0, 3);
		x = star.addEdge(0, 4);
	} }
}

class Graph {
	boolean[][] adjacency;
	public int create(int nNodes, boolean reflexive) {
		adjacency = new boolean[nNodes][nNodes];
		return 0;
	}
	public int addEdge(int u, int v) {
		int errorCode;
		if (u >= adjacency.length || v >= adjacency.length || u < 0 || v < 0) {
			errorCode = -1;
		} else {
			adjacency[u][v] = true;
			adjacency[v][u] = true;
			errorCode = 0;
		}
		return errorCode;
	}
	public int removeEdge(int u, int v) {
		int errorCode;
        errorCode = 0;
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
        boolean[] visited;
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
