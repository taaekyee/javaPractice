package sortPractice;

import java.rmi.RMISecurityManager;

public class Binary_Search_Tree {
	
	Node root;
	
	//���� Ž�� Ʈ�� ������
	public Binary_Search_Tree(){
		root = null;
	}
	
	public boolean isEmpty(){
		return root == null;
	}
	
	public void clear(){
		root = null;
	}
	public void inOrder(){
		root.inOrder();
	}
	public void preOrder(){
		root.preOrder();
	}
	public void postOrder(){
		root.postOrder();
	}
	
	//�־��� input���� ���ο� ��带 ����, ����
	public boolean insert(int input){
		Node newNode = new Node(input); //�־��� input���� �� ��� ����
		Node pointer; // ��带 ������ ��ġ���� Ʈ���� ��ȸ�ϱ� ���� ������ �ν��Ͻ�
		boolean insertComplete = false;
		if(root == null){
			//Ʈ���� empty
			root = newNode;
		}else{
			pointer = root;
			//while ������ Ʈ�� ��ȸ�� ����
			while(!insertComplete){
				if(pointer.getData()>input){
					//input�� �� ����� ���Ͽ�
					//������ ����, ũ�� ���������� �̵�
					if(pointer.getLeft() != null){
						pointer = pointer.getLeft();
					}else{
						pointer.setLeft(newNode);
						insertComplete = true;
						break;
						//��� ������ �Ϸ�Ǹ� break
					}
				}else if(pointer.getData()<input){
					if(pointer.getRight() != null){
						pointer = pointer.getRight();
					}else{
						pointer.setRight(newNode);
						insertComplete = true;
						break;
					}
				}else{
					//���� Ʈ���� �̹� �ߺ��� ��尡 �����ϸ� break
					break;
				}
			}
		}
		
		//������ �����ϸ� true, �̹� �ְų� ���ܹ߻����� ������ �����ϸ� false�� ��ȯ
		return insertComplete;
	}
	
	//input�� ���� ��Ʈ�� Ʈ������ ����

	public boolean remove(int input){
		Node pointer, parentPointer;
		pointer = parentPointer = root;
		while(pointer != null && pointer.getData() != input){
			//������ ��带 ã�� ������ ��ȸ
			parentPointer = pointer; // parentPointer �ν��Ͻ��� ������ ����� �θ� ��带 ����
			if(pointer.getData() > input){
				pointer = pointer.getLeft();
			}else{
				pointer = pointer.getRight();
			}
		}
		
		if(pointer == null){
			//1. Ʈ���� ������ ��尡 �������� ����
			return false;
		} else{
			if(pointer == root && pointer.getLeft() == null){
				//2. ������ ��尡 ��Ʈ ����̰�, ��Ʈ ��尡 ���� �ڽ��� ������ ���� ��
				root = root.getRight();
			}else if(pointer != root && pointer.getLeft() == null){
				//3. ��Ʈ ��尡 �ƴ� ������ ��尡 ���� �ڽ� ��带 ������ ���� ��
				if(pointer == parentPointer.getLeft()){
					//������ ��尡 �θ� ����� ���ʿ� ��ġ�� ��
					parentPointer.setLeft(pointer.getRight());
				} else{
					//������ ��尡 �θ� ����� �����ʿ� ��ġ�� ��
					parentPointer.setLeft(pointer.getLeft());
				}
			}else{
				//4. ������ ��尡 2���� �ڽ� ��� ��θ� ������ ���� ��
				//������ ��忡�� �Ļ��� ���� Ʈ������ ���� ū ��带 �˻��� ��.
				//������ ����� ��ġ�� ����
				//BST���� ���� �����ʿ� ��ġ�� ���� ���� ū ���� ������.
				//=> BST�� ���� ���� Ʈ���� ���� �����ʿ� ��ġ�ϴ� �� ���� ��Ʈ ����� ���� ���� ��ü���̴�.
				Node rightMostNode = pointer;
				//while �ݺ��� �̿��Ͽ� ���� ������ ���� �̵�
				while(rightMostNode.getRight() != null){
					rightMostNode = rightMostNode.getRight();
				}
				//������ ����� ������ ���� ���� ������ ����� ������ ���� �ٲ�
				pointer.setData(rightMostNode.getData());
				rightMostNode = null; //������ ��带 null��
			}
		}
		return true;
	}

	//input ���� ������ ��带 �˻�
	
	public boolean search(int input){
		Node pointer;
		if(root.getData() == input){
			//��Ʈ ��尡 ���� ������ �ִ��� Ȯ��
			return true;
		}else{
			//���� ã�� ������ ��ȸ
			pointer = root;
			while(pointer != null){
				if(pointer.getData() > input){
					pointer = pointer.getLeft();
				}else if( pointer.getData() < input){
					pointer = pointer.getRight();
				} else{
					//input�� ���� ���ٸ� ����
					break;
				}
			}
		}
		//���� Ʈ���� input���� ���� ��尡 �������� �ʴ´ٸ�
		//Ʈ���� ������ ������ �����ϰ� �ǰ� null�� ������ ���̴�
		//������ input���� ���� ��尡 �����Ѵٸ� �� ��带 ������ ���̴�.
		//�׷��� ������ pointer �ν��Ͻ��� null ���� ������ �ʴ´ٸ�, Ʈ���� input ���� ���� ��尡 ������ ���̴�
		return pointer != null;
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Binary_Search_Tree bst = new Binary_Search_Tree();
		bst.insert(1);
		bst.insert(51);
		bst.insert(5);
		bst.insert(24);
		bst.insert(64);
		bst.insert(32);
		bst.insert(35);
		
		System.out.println(bst.search(5));
		
	}
	
	
	public class Node{
		private Node left, right;
		private int data;
		
		public Node(int data){
			this.data = data;
			left = null;
			right = null;
		}
		
		//���� ��忡�� ��ȸ ��ȸ(inOrder Traversal)�� �����Ѵ�.
		public void inOrder(){
			if(left != null){
				left.preOrder();
			}
			System.out.println(data);
			if(right != null){
				right.preOrder();
			}
		}
		
		//���� ��忡�� ���� ��ȸ(preOrder Traversal)�� �����Ѵ�.
		public void preOrder(){
			//���� ��带 �д´�.
			System.out.println(data);
			//�� �� ȸ�� �Լ��� �̿�
			//���� ���� �� ���� �̵�
			if(left != null){
				left.preOrder();
			}
			System.out.println(data);
			if(right != null){
				right.preOrder();
			}
		}
		public void postOrder(){
			if(left != null){
				left.postOrder();
			}
			if(right != null){
				right.postOrder();
			}
			System.out.println(data);
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

		public int getData() {
			return data;
		}

		public void setData(int data) {
			this.data = data;
		}
	}

}
