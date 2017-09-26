package javaPractice;

public class prac6_Generic<E> {
	//Object 대신 E를 사용 => Generic을 사용 (가상의 타입을 설정)
	private E obj;
	
	public void setObj(E obj){
		this.obj = obj;
	}
	
	public E getObj(){
		return obj;
	}
}
