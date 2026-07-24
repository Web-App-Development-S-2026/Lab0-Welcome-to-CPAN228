# CPAN 211 - Introduction to Data Structures

## Course Information
* **Course:** CPAN 211
* **Topic:** Introduction to Data Structures (Lists, Sets, Maps, Queues)

---

## Getting Started

Follow the GitHub setup below before beginning your work.

### GitHub Setup

#### Step 1: Fork and Clone
1. Go to the repository on GitHub.
2. Click the **Fork** button in the top-right corner (VERY IMPORTANT!!!!). This creates your own copy of the project.
3. **Clone Your Fork:**
   ```bash
   git clone https://github.com/YOUR-USERNAME/CPAN211_Lab8.git
   cd CPAN211_Lab8
   ```
4. **Add Upstream Remote:**
   ```bash
   git remote add upstream https://github.com/ChristinHumber/CPAN211_Lab8.git
   ```
5. **Pull Latest Changes:**
   ```bash
   git pull upstream main
   ```
6. **Create a Feature Branch:**
   ```bash
   git checkout -b feature/lab-yourname
   ```
   *Replace `yourname` with your actual name (e.g., `feature/lab1-john-doe` or `feature/lab-john-doe`).*

#### Step 2: Open a Pull Request
1. Go to the upstream repository at `ChristinHumber/CPAN211_Lab8`.
2. You should see a prompt banner saying **"Compare & pull request"** for your pushed branch. Click it.
3. If you don't see the banner:
   * Go to your GitHub fork page.
   * Switch to your feature branch using the branch dropdown menu.
   * Click **Contribute** and then select **Open pull request**.
4. Verify the base repository is `ChristinHumber/IntroToDataStructure_Lab` and the base branch is `main`.
5. Set the title of your pull request to: `Lab Submission - [Your Name]` (e.g., `Lab Submission - John Doe`).
6. Click **Create pull request** to complete the submission.

---

## Lab 9: Finding the Maximum Value in a Binary Tree

### Instructions
1. Review the provided `BinaryTree` structure and `Node` class in the source code.
2. Implement the `findMax(Node root)` method to return the maximum value in the binary tree.
3. Test your implementation using the `main` method.
4. **Code Verification:** Make sure all compilation errors are fixed and your code runs successfully before submitting.

### Starter Code Skeleton
```java
class Node {
    int value;
    Node left, right;

    public Node(int item) {
        value = item;
        left = right = null;
    }
}

public class FindMaxInBinaryTree {
    Node root;

    // TODO: Implement this method – Use recursion
    public int findMax(Node root) {
        // Your implementation here
        return 0; 
    }

    public static void main(String[] args) {
        FindMaxInBinaryTree tree = new FindMaxInBinaryTree();
        tree.root = new Node(10);
        tree.root.left = new Node(20);
        tree.root.right = new Node(5);
        tree.root.left.left = new Node(30);
        tree.root.left.right = new Node(25);
        tree.root.right.right = new Node(50);

        System.out.println("Maximum value in the tree: " + tree.findMax(tree.root));
    }
}
```
