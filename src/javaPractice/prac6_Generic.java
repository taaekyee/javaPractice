package javaPractice;

public class prac6_Generic<E> {
	//Object ��� E�� ��� => Generic�� ��� (������ Ÿ���� ����)
	private E obj;
	
	public void setObj(E obj){
		this.obj = obj;
	}
	
	public E getObj(){
		return obj;
	}
}
