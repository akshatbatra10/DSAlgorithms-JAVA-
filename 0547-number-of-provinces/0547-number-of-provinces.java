class Solution {
    public int findCircleNum(int[][] isConnected) {
        boolean visited[] = new boolean[isConnected.length];
        int res = 0;
        for(int i = 0; i < visited.length; i++){
            if(visited[i] == false){
                dfs(isConnected,i, visited);
                res++;
            }
        }
        return res;
    }
    public void dfs(int[][] isConnected,int i, boolean[] visited){
        if(visited[i]) return ;
        visited[i] = true;
        for(int j = 0; j < isConnected.length; j++){
            if(isConnected[i][j] == 1 && j != i){
                dfs(isConnected,j,visited);
            }
        }
    }
}