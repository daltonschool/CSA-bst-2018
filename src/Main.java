import org.dalton.Assignment;

@Assignment(assignment = "BST")
public class Main {
    public static void main(String[] args) {
        DaltonTreeSet bst = new DaltonTreeSet();
        bst.insert('d');
        bst.insert('b');
        bst.insert('c');
        bst.insert('d');
        bst.insert('a');
        bst.insert('e');
        bst.insert('g');
        bst.insert('h');
        bst.print();
    }
}
