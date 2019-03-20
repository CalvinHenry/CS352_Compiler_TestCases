// This code contains the following legitimate syntax usages
// - Method calls with no arguments
// - A class with some members
// - Multi-dimensional array declaration, creation, and usage
// - Complicated boolean expression with comparison and logical operation
// - '.length' opearation on different levels of 2D array

class p_GraphDemo {
	public static void main(String []a) { {
                System.out.println(new GraphTester().testGraph());
	} }
}

class GraphTester {
    Graph g;

    public int testGraph(){
        int ret;

        g = new Graph();
        ret = g.create(5, false);
        ret = g.addEdge(0, 1);
        /*ret = g.addEdge(0, 2);
        ret = g.addEdge(0, 3);
        ret = g.addEdge(0, 4);
        System.out.println(g.edgeExists(0, 1));
        System.out.println(g.edgeExists(1, 0));
        System.out.println(g.edgeExists(4, 0));
        System.out.println(g.edgeExists(3, 2));*/
        return ret;
    }
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
		} else { color = new int[1];}
		return color;
	}
    public boolean edgeExists(int x, int y){
        return adjacency[x][y];
    }
}

class MultiGraph extends Graph {
	// edge between 2 nodes can have some multiplicity.
	int[][] multiplicity;
}
