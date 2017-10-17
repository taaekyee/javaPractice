package javaPractice;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface prac10_annotation {
	//어노테이션: 소스코드에 메타코드(추가정보)를 주는 것 (ex. @Override)
	//어노테이션에 설정된 값을 통해서 클래스가 좀 더 다르게 실행되게 할 수 있다.
	//커스텀 어노테이션 (정의->사용->실행)
	//일종의 설정파일 처럼 설명하기도 함

}
