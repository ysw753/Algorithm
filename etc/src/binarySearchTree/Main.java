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
		System.out.println("트리삽입 결과: ");
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
		//isLeftChild 의 용도 : 나는 부모의 왼쪽노드였다면 삭제한다음 부모의 왼쪽노드에 현재의자식노드를 대체하려고.
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
		
		//case1 자식노드가 하나도 없을때
		if(current.getLeft()==null&&current.getRight()==null)
		{
			if(current==root)
				root = null;
			if(isLeftChild)
				parent.setLeft(null);
			else
				parent.setRight(null);
		}
		
		//case2 자식노드가 하나일때(왼쪽에 자식노드가 있을때)
		else if(current.getRight()==null) {
			if(current==root)
				root = current.getLeft();
			else if(isLeftChild)
				parent.setLeft(current.getLeft());
			else
				parent.setRight(current.getLeft());
		}
		
		//case2 자식노드가 하나일때(오른쪽에 자식노드가 있을때)
		else if(current.getLeft()==null) {
			if(current==root)
				root=current.getRight();
			else if(isLeftChild)
				parent.setLeft(current.getRight());
			else
				parent.setRight(current.getRight());
		}
		
		//case3 자식노드가 두개일때
		else if(current.getLeft()!=null&&current.getRight()!=null)
		{
			//오른쪽 자식에서 최고값을 찾음
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
		//이부분 이해안감
		if(successor!=delData.getRight()) {
			successorParent.setLeft(successor.getRight());
			successor.setRight(delData.getRight());
		}
		return successor;
	}
	
	//삽입
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
































































