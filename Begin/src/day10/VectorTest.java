package day10;
import java.util.*;
import javax.swing.*;
/*Java Collection Framework
 *  - Collection : 객체를 수집해서 저장하는 역할
 *  - Framework : 사용방법을 미리 정해놓은 라이브러리를 의미
 *  - Vector, ArrayList, Hashtable, HashMap, HashSet, TreeSet...
 *  # Vcetor
 *  - List 계열
 *  - 입력 순서를 기억한다
 *  - 데이터 중복 저장 가능
 *  - 유사 클래스 : ArrayList*/
public class VectorTest {

	public static void main(String[] args) {
		//jdk1.4 이전 버전
		//Vector v=new Vector();//초기용량 : 10개, 가득차면 2배로 저장공간을 늘린다
		Vector v=new Vector(5,3);//초기용량:5, 증가치:3
	    System.out.println("벡터 v의 현재 용량1: "+v.capacity());
	    System.out.println("벡터 v의 현재 크기1: "+v.size());
	    //데이터 저장: add(), addElement()
	    //데이터 꺼내기: Object get(int index), Object elementAt(int index)
	    v.add("Hello");
	    v.add(new Integer(20));
	    v.add(Integer.valueOf(22));
	    v.add(3.14);//double이 저장되는게 아니라 Double=>Wrapper class로 auto boxing되어 저장된다
	    
	    System.out.println("벡터 v의 현재 용량2: "+v.capacity());//5
	    System.out.println("벡터 v의 현재 크기2: "+v.size());//4
	
	    v.add(new Object());
	    v.add(new javax.swing.JButton("OK"));
	    
	    System.out.println("벡터 v의 현재 용량3: "+v.capacity());//8
	    System.out.println("벡터 v의 현재 크기3: "+v.size());//6
	    
	    //Object obj=v.get(0);
	    String obj=(String)v.get(0);
	    System.out.println(obj.toUpperCase());
	    
	    Double dbl=(Double)v.get(3);
	    System.out.println(dbl);
	    
	    JButton str=(JButton)v.get(5);
	    System.out.println(str);//str.toString()
	    //5.0 이후부터 Generic으 사용함
	    Vector<String> v2=new Vector<>();
	    //String 유형만 저장하는 벡터를 생성하겠다.
	    v2.add(new String("Java"));
	    v2.add(Integer.valueOf(5).toString());
	    
	    String s2=v2.get(0);
	    System.out.println(s2.toLowerCase());
	    //[1] for 루프 이용해서 v2에 저장된 객체 출력하기
	    for(int i=0;i<v2.size();i++) {
	    	System.out.println(v2.get(i));
	    }
	    //[2] Float 유형을 저장할 벡터 v3를 생성하고
	    //Float 객체 3개이상 저장하기
	    //확장 for 루프문 이용해서 v3에 저장된 값들의 합계를 구해 출력하기
	    Vector<Float>v3=new Vector<>();
	    v3.add(13f);//float=>Float으로 auto boxing
	    v3.add((float)1.5);
	    v3.add(Float.valueOf(3));
	    float sum=0;
	    for(Float f:v3) //auto unboxing
	    {
	    	sum+=f;
	    }
	    System.out.println(sum);
	}

}
