// 841. Keys and Rooms with DFS
class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        int n = rooms.size();
        boolean[] visited = new boolean[n];
        solve(0, visited, rooms);
        for(boolean visite : visited){
            if(visite == false) return false;
        }
        return true;
    }

    public static void solve(int src, boolean[] visited, List<List<Integer>> graph) {
        if (visited[src] == true)
            return;
        visited[src] = true;
        for (int i : graph.get(src)) {
            solve(i, visited, graph);
        }
    }
}