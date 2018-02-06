import org.dalton.Assignment;
import java.util.List;

@Assignment(assignment = "BST")
public class DaltonTreeSet {
    private Node root;

    public void print() {
        root.print();
    }

    public void insert(char c) {
        insert(c, root);
    }

    /**
     * insert for an unbalanced BST.
     * @param c the letter to insert
     * @param n the root node to insert from
     *
     * PART 5:
     * modify this function to balance on insert using AVL algorithm
     *
     */
    private void insert(char c, Node n) {
        if(root==null) { root = new Node(c); }      //if the tree is empty, this is the root
        else if(c==n.data) return;				    //c already in tree
        else if(c<n.data) {							//c is less than n
            if(n.left==null) {
                n.left = new Node(c); 	            //there is no child to the left, add c
                n.left.parent = n;
            }
            else insert(c, n.left);					//insert c in left subtree
        } else {									//c is greater than n
            if(n.right==null) {
                n.right = new Node(c);              //there is no child to the right, add c
                n.right.parent = n;
            }
            else insert(c, n.right);				//insert c in right subtree
        }
    }

    /**
     * determine whether c is in the tree
     * @param c a letter to look for
     * @return true if c is in the tree
     */
    public boolean contains(char c) {
        return false;
    }

    /**
     * do an inorder traversal of the tree
     * ex.
     *
     *        d
     *       / \
     *		/   \
     *	   /     \
     *    /       \
     *    b       e
     *   / \       \
     *  /   \       \
     *  a   c       g
     *  		     \
     *       		  h
     *
     * should return ['a','b','c','d','e','g','h']
     */
    public List<Character> traverseInorder() {
        return null;
    }

    /**
     * Sort the given list by creating a bst from the list.
     * Make sure to insert the list in a randomized order, to help
     * promote a balanced tree
     * @param unsorted a list of items
     * @return a new sorted lest
     */
    public static List<Character> randomizedSort(List<Character> unsorted) {
        return unsorted;
    }

    /**
     * delete the char c from the tree
     * @param c the letter to delete
     * @return true if successful, false if it does not exist
     */
    public boolean delete(char c) {
        return false;
    }

}

class Node {
    char data;
    Node left;
    Node right;
    Node parent;

    public Node(char d) {
        data = d;
    }

    public void print() {
        BTreePrinter.printNode(this);
    }

}

