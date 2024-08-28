public class BinaryTree {

    public TreeNode root ;
    
    public boolean isEmpty() {
		return root == null;
	}

    public void insert(int newItem) {
		if (isEmpty()) {
			TreeNode newNode = new TreeNode(newItem);
			root = newNode;
		} else {
			insert(root, newItem);
		}
	}

    private void insert(TreeNode bst, int newItem) {
		if (newItem < bst.item) {
			if (bst.lChild == null) {
				TreeNode newNode = new TreeNode(newItem);
				bst.lChild = newNode;
			} else
				insert(bst.lChild, newItem);
		} else {
			if (bst.rChild == null) {
				TreeNode newNode = new TreeNode(newItem);
				bst.rChild = newNode;
			} else
				insert(bst.rChild, newItem);
		}
	}

    public void postOrder(TreeNode rootNode) {
		if (rootNode != null) {
			postOrder(rootNode.lChild);
			postOrder(rootNode.rChild);
			System.out.print(rootNode.item + " ");
		}
	}

    public void inOrder(TreeNode rootNode) {
		if (rootNode != null) {
			inOrder(rootNode.lChild);
			System.out.print(rootNode.item + " ");
			inOrder(rootNode.rChild);
		}
	}

	public void preOrder(TreeNode rootNode) {
		if (rootNode != null) {
			System.out.print(rootNode.item + " ");
			preOrder(rootNode.lChild);
			preOrder(rootNode.rChild);
		}
	}

    public void PrintBST()
    {
         PrintSubBST(root, " ", true);
    }


    private void PrintSubBST(TreeNode parent , String indent , boolean last)
    {
        System.out.println(indent + "+- " + parent.item);
        indent += last ? "  " : "| ";
        if (parent.lChild != null && parent.rChild != null)
        {
            PrintSubBST(parent.rChild,indent,false);
            PrintSubBST(parent.lChild, indent, true);
        }
        else if (parent.lChild != null)
             PrintSubBST(parent.lChild, indent, true);
        else if (parent.rChild != null)
            PrintSubBST(parent.rChild, indent, true);
    } 
}

class TreeNode {
	public int item;
	public TreeNode lChild;
	public TreeNode rChild;

	public TreeNode(int newItem) {
		item = newItem;
		lChild = null;
		rChild = null;
	}
}
