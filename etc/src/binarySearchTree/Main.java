package binarySearchTree;

public class Main {

	public static void main(String[] args) {
		Main m = new Main();
		m.insert(3);
		m.insert(8);
		m.insert(5);
		m.insert(7);
		m.insert(9);
		m.insert(10);
		System.out.println("Ʈ������ ���: ");
		m.display(m.root);
	}
	
	public class Node{
		private int data;
		private Node left;
		private Node right;
		public Node(int data) {
			this.setData(data);
			this.setLeft(null);
			this.setRight(null);
		}
		public int getData() {
			return data;
		}
		public void setData(int data) {
			this.data = data;
		}
		public Node getLeft() {
			return left;
		}
		public void setLeft(Node left) {
			this.left = left;
		}
		public Node getRight() {
			return right;
		}
		public void setRight(Node right) {
			this.right = right;
		}
	}
	
	public Node root;
	public boolean find(int data) {
		Node current = root;
		while(current!=null) {
			if(current.getData()==data)
				return true;
			else if (current.getData()>data)
				current=current.getLeft();
			else
				current=current.getRight();
		}
		return false;
	}
	public boolean delete(int delData) {
		Node parent=root;
		Node current=root;
		//isLeftChild �� �뵵 : ���� �θ��� ���ʳ�忴�ٸ� �����Ѵ��� �θ��� ���ʳ�忡 �������ڽĳ�带 ��ü�Ϸ���.
		boolean isLeftChild=false;
		while(current.getData()!=delData) {
			parent=current;
			if(current.getData()>delData)
			{
				isLeftChild=true;
				current=current.getLeft();
			}else {
				isLeftChild=false;
				current= current.getRight();
			}
			if(current==null)
				return false;
		}
		
		//case1 �ڽĳ�尡 �ϳ��� ������
		if(current.getLeft()==null&&current.getRight()==null)
		{
			if(current==root)
				root = null;
			if(isLeftChild)
				parent.setLeft(null);
			else
				parent.setRight(null);
		}
		
		//case2 �ڽĳ�尡 �ϳ��϶�(���ʿ� �ڽĳ�尡 ������)
		else if(current.getRight()==null) {
			if(current==root)
				root = current.getLeft();
			else if(isLeftChild)
				parent.setLeft(current.getLeft());
			else
				parent.setRight(current.getLeft());
		}
		
		//case2 �ڽĳ�尡 �ϳ��϶�(�����ʿ� �ڽĳ�尡 ������)
		else if(current.getLeft()==null) {
			if(current==root)
				root=current.getRight();
			else if(isLeftChild)
				parent.setLeft(current.getRight());
			else
				parent.setRight(current.getRight());
		}
		
		//case3 �ڽĳ�尡 �ΰ��϶�
		else if(current.getLeft()!=null&&current.getRight()!=null)
		{
			//������ �ڽĿ��� �ְ��� ã��
			Node successor = getSuccessor(current);
			if(current==root)
				root=successor;
			else if(isLeftChild)
				parent.setLeft(successor);
			else
				parent.setRight(successor);
			successor.setLeft(current.getLeft());
		}
		return true;
		
	}
	public Node getSuccessor(Node delData) {
		Node successor=null;
		Node successorParent=null;
		Node current = delData.getRight();
		while(current!=null)
		{
			successorParent = successor;
			successor = current;
			current = current.getRight();
		}
		//�̺κ� ���ؾȰ�
		if(successor!=delData.getRight()) {
			successorParent.setLeft(successor.getRight());
			successor.setRight(delData.getRight());
		}
		return successor;
	}
	
	//����
	public void insert(int data) {
		Node newNode = new Node(data);
		if(root ==null) {
			root=newNode;
			return;
		}
		Node current = root;
		Node parent = null;
		while(true) {
			parent = current;
			if(data<current.getData()) {
				current=current.getLeft();
				if(current==null) {
					parent.setLeft(newNode);
					return;
				}
			}else {
				current = current.getRight();
				if(current==null) {
					parent.setRight(newNode);
					return;
				}
			}
		}
	}
	public void display(Node root) {
		if(root!=null) {
			display(root.getLeft());
			System.out.print(" "+root.getData());
			display(root.getRight());
		}
	}
	
}
































































