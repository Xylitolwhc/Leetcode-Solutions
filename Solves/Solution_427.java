/**
 * Created by Hanson on 2019/4/17
 *
 * @author Hanson
 * 2019/4/17
 * 427. Construct Quad Tree
 * https://leetcode.com/problems/construct-quad-tree/
 */
public class Solution_427 {
    public Node construct(int[][] grid) {
        return construct(grid, 0, 0, grid.length - 1, grid.length - 1);
    }

    private Node construct(int[][] grid, int startX, int startY, int endX, int endY) {
        if (needDivided(grid, startX, startY, endX, endY)) {
            return new Node(false, false,
                    construct(grid, startX, startY, (startX + endX) / 2, (startY + endY) / 2),
                    construct(grid, startX, (startY + endY) / 2 + 1, (startX + endX) / 2, endY),
                    construct(grid, (startX + endX) / 2 + 1, startY, endX, (startY + endY) / 2),
                    construct(grid, (startX + endX) / 2 + 1, (startY + endY) / 2 + 1, endX, endY));
        }
        return new Node(grid[startX][startY] == 1, true, null, null, null, null);
    }

    private boolean needDivided(int[][] grid, int startX, int startY, int endX, int endY) {
        int index = grid[startX][startY];
        for (int i = startX; i <= endX; i++) {
            for (int j = startY; j <= endY; j++) {
                if (grid[i][j] != index)
                    return true;
            }
        }
        return false;
    }

    // Definition for a QuadTree node.
    class Node {
        public boolean val;
        public boolean isLeaf;
        public Node topLeft;
        public Node topRight;
        public Node bottomLeft;
        public Node bottomRight;

        public Node() {
        }

        public Node(boolean _val, boolean _isLeaf, Node _topLeft, Node _topRight, Node _bottomLeft, Node _bottomRight) {
            val = _val;
            isLeaf = _isLeaf;
            topLeft = _topLeft;
            topRight = _topRight;
            bottomLeft = _bottomLeft;
            bottomRight = _bottomRight;
        }
    }

    public static void main(String... a) {
        new Solution_427().construct(new int[][]{
                {1, 1, 1, 1, 0, 0, 0, 0},
                {1, 1, 1, 1, 0, 0, 0, 0},
                {1, 1, 1, 1, 1, 1, 1, 1},
                {1, 1, 1, 1, 1, 1, 1, 1},
                {1, 1, 1, 1, 0, 0, 0, 0},
                {1, 1, 1, 1, 0, 0, 0, 0},
                {1, 1, 1, 1, 0, 0, 0, 0},
                {1, 1, 1, 1, 0, 0, 0, 0}
        });
    }
}

