package sortPractice;

import java.rmi.RMISecurityManager;

public class Binary_Search_Tree {
	
	Node root;
	
	//이진 탐색 트리 생성자
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
	
	//주어진 input으로 새로운 노드를 생성, 삽입
	public boolean insert(int input){
		Node newNode = new Node(input); //주어진 input으로 새 노드 생성
		Node pointer; // 노드를 삽입할 위치까지 트리를 순회하기 위한 포인터 인스턴스
		boolean insertComplete = false;
		if(root == null){
			//트리가 empty
			root = newNode;
		}else{
			pointer = root;
			//while 루프로 트리 순회를 시작
			while(!insertComplete){
				if(pointer.getData()>input){
					//input를 각 노드들과 비교하여
					//작으면 왼쪽, 크면 오른쪽으로 이동
					if(pointer.getLeft() != null){
						pointer = pointer.getLeft();
					}else{
						pointer.setLeft(newNode);
						insertComplete = true;
						break;
						//노드 삽입이 완료되면 break
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
					//만약 트리에 이미 중복된 노드가 존재하면 break
					break;
				}
			}
		}
		
		//삽입이 성공하면 true, 이미 있거나 예외발생으로 삽입을 실패하면 false를 반환
		return insertComplete;
	}
	
	//input을 가진 노트를 트리에서 삭제

	public boolean remove(int input){
		Node pointer, parentPointer;
		pointer = parentPointer = root;
		while(pointer != null && pointer.getData() != input){
			//삭제할 노드를 찾을 때까지 순회
			parentPointer = pointer; // parentPointer 인스턴스가 삭제할 노드의 부모 노드를 참조
			if(pointer.getData() > input){
				pointer = pointer.getLeft();
			}else{
				pointer = pointer.getRight();
			}
		}
		
		if(pointer == null){
			//1. 트리에 삭제할 노드가 존재하지 않음
			return false;
		} else{
			if(pointer == root && pointer.getLeft() == null){
				//2. 제거할 노드가 루트 노드이고, 루트 노드가 왼쪽 자식을 가지지 않을 때
				root = root.getRight();
			}else if(pointer != root && pointer.getLeft() == null){
				//3. 루트 노드가 아닌 제거할 노드가 왼쪽 자식 노드를 가지지 않을 때
				if(pointer == parentPointer.getLeft()){
					//제거할 노드가 부모 노드의 왼쪽에 위치할 때
					parentPointer.setLeft(pointer.getRight());
				} else{
					//제거할 노드가 부모 노드의 오른쪽에 위치할 때
					parentPointer.setLeft(pointer.getLeft());
				}
			}else{
				//4. 제거할 노드가 2개의 자식 노드 모두를 가지고 있을 때
				//제거할 노드에서 파생된 서브 트리에서 가장 큰 노드를 검색한 후.
				//제거할 노드의 위치에 삽입
				//BST에서 가장 오른쪽에 위치한 노드는 가장 큰 값을 가졌다.
				//=> BST의 왼쪽 서브 트리의 가장 오른쪽에 위치하는 잎 노드는 루트 노드의 가장 좋은 대체제이다.
				Node rightMostNode = pointer;
				//while 반복을 이용하여 가장 오른쪽 노드로 이동
				while(rightMostNode.getRight() != null){
					rightMostNode = rightMostNode.getRight();
				}
				//제거할 노드의 데이터 값을 가장 오른쪽 노드의 데이터 값을 바꿈
				pointer.setData(rightMostNode.getData());
				rightMostNode = null; //오른쪽 노드를 null로
			}
		}
		return true;
	}

	//input 값을 가지는 노드를 검색
	
	public boolean search(int input){
		Node pointer;
		if(root.getData() == input){
			//루트 노드가 값을 가지고 있는지 확인
			return true;
		}else{
			//값을 찾을 때까지 순회
			pointer = root;
			while(pointer != null){
				if(pointer.getData() > input){
					pointer = pointer.getLeft();
				}else if( pointer.getData() < input){
					pointer = pointer.getRight();
				} else{
					//input이 노드와 같다면 종료
					break;
				}
			}
		}
		//만약 트리에 input값을 가진 노드가 존재하지 않는다면
		//트리의 마지막 노드까지 여행하게 되고 null을 참조할 것이다
		//하지만 input값을 가진 노드가 존재한다면 그 노드를 참조할 것이다.
		//그렇기 때문에 pointer 인스턴스가 null 값을 가지지 않는다면, 트리에 input 값을 가진 노드가 존재할 것이다
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
		
		//현재 노드에서 중회 순회(inOrder Traversal)을 시작한다.
		public void inOrder(){
			if(left != null){
				left.preOrder();
			}
			System.out.println(data);
			if(right != null){
				right.preOrder();
			}
		}
		
		//현재 노드에서 전위 순회(preOrder Traversal)를 시작한다.
		public void preOrder(){
			//현재 노드를 읽는다.
			System.out.println(data);
			//그 후 회귀 함수를 이용
			//가장 왼쪽 잎 노드로 이동
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
