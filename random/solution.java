package random;
class Solution {
    private List<List<Integer>> tree;
    private int[] values;
    private int k;
    private int goodEdges;

    public int countGoodEdge(int n, int k, int[] values, int[][] edges) {
        this.values = values;
        this.k = k;
        this.goodEdges = 0;
        tree = new ArrayList<>(n + 1);
        for (int i = 0; i <= n; i++) {
            tree.add(new ArrayList<>());
        }
        for (int[] edge : edges) {
            tree.get(edge[0]).add(edge[1]);
            tree.get(edge[1]).add(edge[0]);
        }
        dfs(1, 0);
        return goodEdges;
    }

    private Map<Integer, Integer> dfs(int node, int parent) {
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        frequencyMap.put(values[node - 1], 1);
        for (int child : tree.get(node)) {
            if (child != parent) {
                Map<Integer, Integer> childMap = dfs(child, node);
                if (isGoodEdge(frequencyMap, childMap)) {
                    goodEdges++;
                }
                for (Map.Entry<Integer, Integer> entry : childMap.entrySet()) {
                    frequencyMap.merge(entry.getKey(), entry.getValue(), Integer::sum);
                }
            }
        }
        return frequencyMap;
    }

    private boolean isGoodEdge(Map<Integer, Integer> map1, Map<Integer, Integer> map2) {
        return isValidSubtree(map1) && isValidSubtree(map2);
    }

    private boolean isValidSubtree(Map<Integer, Integer> map) {
    Iterator<Integer> iterator = map.values().iterator();
    while (iterator.hasNext()) {
        int freq = iterator.next();
        if (freq > k) {
            return false;
        }
    }
    return true;
}

    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        int n = 5;
        int k = 1;
        int[] values = {1, 2, 3, 4, 5};
        int[][] edges = {{1, 2}, {1, 3}, {2, 4}, {3, 5}};
        System.out.println(sol.countGoodEdge(n, k, values, edges));
    }
}


