public class HeightofTree {
    static class Node {
        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static int height(Node root) {
        if (root == null) {
            return 0;
        }
        int lh = height(root.left);
        int rh = height(root.right);
        return Math.max(lh, rh) + 1;
    }

    // count of nodes
    public static int count(Node root) {
        if (root == null) {
            return 0;
        }
        int leftCount = count(root.left);
        int rightCount = count(root.right);
        return leftCount + rightCount + 1;
    }

    // SUM OF NODES
    public static int sum(Node root) {
        if (root == null) {
            return 0;
        }
        int leftSum = sum(root.left);
        int rightSum = sum(root.right);
        return leftSum + rightSum + root.data;
    }

    // Diameter of a Tree
    public static int diameter(Node root) { // O(N^2)
        if (root == null) {
            return 0;
        }
        int leftDiam = diameter(root.left);
        int leftHt = height(root.left);
        int rightDiam = diameter(root.right);
        int rightHt = height(root.right);

        int selfDiam = leftHt + rightHt + 1;
        return Math.max(selfDiam, Math.max(leftDiam, rightDiam));
    }

    // Diameter 2nd apporach
    static class Info {
        int diam;
        int ht;

        public Info(int diam, int ht) {
            this.diam = diam;
            this.ht = ht;
        }
    }

    public static Info diameter2(Node root) { // O(n)
        if (root == null) {
            return new Info(0, 0);
        }
        Info leftInfo = diameter2(root.left);
        Info rightInfo = diameter2(root.right);

        int diam = Math.max(Math.max(leftInfo.diam, rightInfo.diam), leftInfo.ht + rightInfo.ht + 1);
        int ht = Math.max(leftInfo.ht, rightInfo.ht) + 1;

        return new Info(diam, ht);
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        // System.out.println(height(root));
        // System.out.println(count(root));
        // System.out.println(sum(root));
        // System.out.println(diameter(root));
        System.out.println(diameter2(root).diam);
    }
}
