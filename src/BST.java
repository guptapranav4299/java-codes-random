
public class BST {
	class Node{
		int data;
		Node left;
		Node right;
	}
	
	public Node createNewNode(int k) {
		Node a=new Node();
		a.data=k;
		a.left=null;
		a.right=null;
		
		return a;
	}
	
//	we insert such that the left node is smaller than the root node 
//	and the right node is greater than the root node.
	public Node insert(Node node,int val)
	{
		if(node==null)
			return createNewNode(val);
		
		if(val<node.data)
			node.left=createNewNode(val);
		else if(val>node.data)
			node.right=createNewNode(val);
		
		return node;
	}
	
//	public void levelordertraversal(Node node, int level) {
//		if(node==null)
//			return;
//		int height=getHeight(node);
//		
//		for(int i=0;i<height;i++)
//		{
//			printAtLevel(node,i+1);
//			System.out.println();
//		}
//	}
//	public void printAtLevel(Node node,int level)
//	{
//		if(node==null)
//			return;
//		if(level==1)
//			System.out.print(node.data+" ");
//		
//		printAtLevel(node.left,level-1);
//		printAtLevel(node.right,level-1);
//	}
	
	
//	in order to delete we see 3 cases when both the childs are null
//	case2 when one of them is null and case 3 when both of them are 
//	not null
	
	public Node delete(Node node, int val) {
		if(node==null)
			return null;
		
		if(val<node.data)
		node.left=delete(node.left,val);
		
		else if (val>node.data)
			node.right=delete(node.right,val);
		
		else {
//			case 1: when both the childs are null 
			if(node.left==null || node.right==null)
			{
				Node temp=null;
//				case 2 : when one of the child is null
				temp=node.left==null?node.right:node.left;
				
				if(temp==null)
					return null;
				
				else
					return node;
			}
			else {
//				case 3:when both the childs are not null
				Node successor=getSuccessor(node);
				node.data=successor.data;
				node.right=delete(node.right,4);
				return node;
			}
		}
		return node;
	}
//	get successor finds the next node to the selected node from its right
//	child because the next big element than the selected element will be 
//	the left child of its right child.
	public Node getSuccessor(Node node)
	{
		if(node==null)
			return null;
		
		Node temp=node.right;
		while(temp!=null)
			temp=temp.left;
		
		return temp;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BST bst=new BST();
		Node root=null;
		root=bst.insert(root,8);
		root=bst.insert(root,3);
		root=bst.insert(root,9);
		root=bst.insert(root,18);
		root=bst.insert(root,2);
		root=bst.delete(root, 3);
		
	}

}
