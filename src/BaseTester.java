/*
This tester should show you roughly how many points you have on the base assignment.
We will test with harder test data for final grades.
 */

import org.dalton.Assignment;
import java.util.List;

@Assignment(assignment = "BST")
public class BaseTester {
    public static void main(String[] args) {
        int score = 70;

        //1. write contains (6pts)
        ContainsTester c = new ContainsTester();
        score += c.test();

        //2. write traverseInorder (6pts)
        TraverseTester t = new TraverseTester();
        score += t.test();

        //3. write randomizedSort and tester (4pts for sort, 2 pts for tester)
        // Do this like the others, use the code above and below as examples

        System.out.println("your base score: " + score);
    }
}

class TraverseTester extends Tester {
    public TraverseTester() {
        this.name = "traverse";
        this.points = 6;
    }

    @Override
    boolean tester() {
        //traverse (6pts)
        DaltonTreeSet bst = new DaltonTreeSet();
        bst.insert('d');
        bst.insert('b');
        bst.insert('c');
        bst.insert('d');
        bst.insert('a');
        bst.insert('e');
        bst.insert('g');
        bst.insert('h');
        List<Character> l = bst.traverseInorder();
        if(l.size()!=7) return false;
        if(l.get(0) != 'a') return false;
        if(l.get(6) != 'h') return false;
        return true;
    }
}
class ContainsTester extends Tester {
    public ContainsTester() {
        this.name = "contains";
        this.points = 6;
    }

    @Override
    boolean tester() {
        //contains (6pts)
        DaltonTreeSet bst = new DaltonTreeSet();
        bst.insert('d');
        bst.insert('b');
        bst.insert('c');
        bst.insert('d');
        bst.insert('a');
        bst.insert('e');
        bst.insert('g');
        bst.insert('h');
        if (!bst.contains('d')) return false;
        if (!bst.contains('h')) return false;
        bst.insert('z');
        if (!bst.contains('z')) return false;
        if (bst.contains('i')) return false;
        return true;
    }
}
abstract class Tester {
    int points;
    String name;

    public int test() {
        try {
            System.out.print(name + ": ");
            if (tester()) {
                System.out.println("pass +" + points + "pts");
                return points;
            } else {
                System.out.println("fail");
                return 0;
            }
        } catch (Exception e) {
            System.out.println("fail");
            return 0;

        }
    }

    abstract boolean tester();
}

