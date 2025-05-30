import java.util.*;

public class PreOrderTree {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static class BinaryTree {
        static int idx = -1;

        public static Node buildTree(int nodes[]) {
            idx++;
            if (nodes[idx] == -1) {
                return null;
            }
            Node newNode = new Node(nodes[idx]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);

            return newNode;
        }

        // pre order
        public static void PreOrder(Node root) {
            if (root == null) {
                return;
            }
            System.out.print(root.data + " ");
            PreOrder(root.left);
            PreOrder(root.right);
        }

        // In order
        public static void InOrder(Node root) {
            if (root == null) {
                return;
            }
            InOrder(root.left);
            System.out.print(root.data + " ");
            InOrder(root.right);
        }

        // post order
        public static void PostOrder(Node root) {
            if (root == null) {
                return;
            }
            PostOrder(root.left);
            PostOrder(root.right);
            System.out.print(root.data + " ");
        }

        // Level Order Traversal
        public static void LevelOrder(Node root) {
            if (root == null) {
                return;
            }
            Queue<Node> q = new LinkedList<>();
            q.add(root);
            q.add(null);
            while (!q.isEmpty()) {
                Node currNode = q.remove();
                if (currNode == null) {
                    System.out.println();
                    if (q.isEmpty()) {
                        break;
                    } else {
                        q.add(null);
                    }
                } else {
                    System.out.print(currNode.data + " ");
                    if (currNode.left != null) {
                        q.add(currNode.left);
                    }
                    if (currNode.right != null) {
                        q.add(currNode.right);
                    }
                }
            }
        }

    }

    @SuppressWarnings("static-access")
    public static void main(String[] args) {
        int nodes[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };
        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(nodes);
        // System.out.println(root.data);
        // tree.PreOrder(root);
        // tree.InOrder(root);
        // tree.PostOrder(root);
        tree.LevelOrder(root);
    }
}
