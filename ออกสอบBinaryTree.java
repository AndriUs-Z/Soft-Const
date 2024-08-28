public class BinaryTree {

    public TreeNode root ;
	TreeNode parent; // แม่ของโหนดที่จะลบ
	TreeNode NodeDelete; // โหนดที่จะลบ
	char child; // โหนดที่จะลบมาจากฝั่งไหนของแม่ l = ซ้าย, r = ขวา , n = ไม่มีโหนด
	int countLevel; // นับชั้นที่เจอโหนดที่จะลบ
    
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

    public void insert(TreeNode bst, int newItem) {
		if (newItem < bst.item) {
			if (bst.lChild == null) {
				TreeNode newNode = new TreeNode(newItem);
				bst.lChild = newNode;
			} else
				insert(bst.lChild, newItem);
		} else if(newItem > bst.item) {
			if (bst.rChild == null) {
				TreeNode newNode = new TreeNode(newItem);
				bst.rChild = newNode;
			} else
				insert(bst.rChild, newItem);
		}
		else{
			System.out.println("Already exist");
			return ;
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


    public void PrintSubBST(TreeNode parent , String indent , boolean last)
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

	// ค้นหาโหนดในไบนารีทรีเพื่อทำการลบโหนด
	public void search(TreeNode bst, int searchKey) {
		if (searchKey == bst.item) {
			NodeDelete = bst;
		} else if (searchKey < bst.item) {
			if(bst.lChild!=null){
				parent = bst;
				child = 'l';
				search(bst.lChild, searchKey);
			}
			else child = 'n';
			
		} else {
			if(bst.rChild!=null){
				parent = bst;
				child = 'r';
				search(bst.rChild, searchKey);
			}
			else child = 'n';
		}
	}

	// ค้นหาโหนดด้วยหลักการ Inorder successor
	public void inordersuccessor(TreeNode bst) {
		if (bst.lChild != null) {
			parent = bst;
			countLevel++;
			inordersuccessor(bst.lChild);
		} else {
			NodeDelete.item = bst.item;
			if (countLevel == 0) {
				NodeDelete.rChild = bst.rChild;
			} else {
				parent.lChild = bst.rChild;
			}
		}
	}

	// ลบโหนดในไบนารีทรี
	public void delete(int deleteItem) {
		if (isEmpty()) {
			System.out.println("Tree Empty");
		} 
		//กรณีโหนดที่จะลบอยู่ที่ root
		else if(deleteItem == root.item){ 
			if(root.lChild==null&&root.rChild==null){
				root = null ;
			}
			else if(root.lChild!=null&&root.rChild!=null){
				countLevel = 0;
				NodeDelete = root ;
				inordersuccessor(root.rChild);
			}
			else{
				if(root.rChild!=null) root = root.rChild;
				else root = root.lChild;
			}
		}	
		// กรณีโหนดที่จะลบไม่ได้อยู่ที่ root
		else {
			parent = root;
			NodeDelete = null;
			search(root, deleteItem);
			if(child=='n'){
				System.out.println("No item.");
				return ;
			}
			TreeNode lChild = NodeDelete.lChild;
			TreeNode rChild = NodeDelete.rChild;
			if ((lChild == null) && (rChild == null)) {
				// โหนดที่ต้องการลบอยู่ตำแหน่งใบ
				if (child == 'l')
					parent.lChild = null;
				else
					parent.rChild = null;
			} else if ((lChild != null) && (rChild != null)) {
				// โหนดที่ต้องการลบมีโหนดลูกสองโหนด
				countLevel = 0;
				inordersuccessor(NodeDelete.rChild);
			} else {
				// โหนดที่ต้องการลบมีโหนดลูกหนึ่งโหนด
				if (NodeDelete.lChild != null) {
					if (child == 'l')
						parent.lChild = NodeDelete.lChild;
					else
						parent.rChild = NodeDelete.lChild;
				} else {
					if (child == 'l')
						parent.lChild = NodeDelete.rChild;
					else
						parent.rChild = NodeDelete.rChild;
				}
			}
		}
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
