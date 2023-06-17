package study;

import java.util.stream.IntStream;

public class Java {
	
	/*
	 *  <11.Collection> -> 인터페이스
	 *  컬렉션 : 여러원소들을 담을 수 있는 자료구조 (동적 메모리 할당)
	 *         컬렉션 사용하면 데이터 추가 삭제 정렬 등의 처리가 간단하게 해결됨
	 *        - list   : 순서 o 중복 o  (ArrayList = 클래스)
	 *        - set    : 순서 x 중복 x
	 *        - queue  : FIFO (fist in first out) 
	 *        - map    : key-value 형태
	 *   
	 *  제네릭스(Generics) (권장) 사용이유
	 *  : 명시된 타입의 객체만 저장하도록 제한
	 *  : 컬렉션에 저장된 객체 꺼내 사용할 때 형 변환 필요x
	 *   
	 *  메소드
	 *  add(E e) : 끝에 추가
	 *  add(int index, E e) : 해당 인덱스에 추가
	 *  addAll(Collection c) : 컬렉션 통채로 뒤에 추가
	 *  set(int index, E e) : 해당 인덱스 값변경
	 *  get(int index) : 해당 인덱스 객체 가져오기
	 *  subList(int index1, int index2) : 추출해서 새로운 list
	 *          index1 <= x < index2
	 *  clear() : 싹 비우기
	 *  contains(Object) 매개변수 객체가 해당컬렉션에 있는지 확인
	 *  equals(Object) : 매개변수 객체랑 같은 객체인지 확인
	 *  hashCode() : 해시코드값 리턴
	 *  isEmpty() : 컬렉션이 비어있는지
	 *  iterator() : 데이터를 한 건씩 처리하기 위한 iterator 객체 리턴
	 *  remove(int index) : 해당 인덱스 객체 삭제
	 *  size() : 데이터 개수
	 *  toArray() : 컬렉션에 있는 데이터 배열로 복사
	 *  indexOf(Object o) : 해당 객체 인덱스값 반환
	 *  
	 *  오름차순 정렬(자바에서 제공하는 클래스 아니면 
	 *            클래스에다가 implements Comparable<Person> 이런식 해줘야함
	 *  - Collections.sort() 
	 *  내림차순 정렬 (오름차순 해주고 반대로) 
	 *  - Collections.reverse() 
	 *  
	 *  Map (put, remove)
	 *  - 값만 저장x
	 *  - 키만 저장o
	 *  - 키는 중복x
	 *  - 값은 중복o
	 *  
	 *  -> HashMap : Map 인터페이스를 구현한 대표적인 컬렉션 클래스
	 *  -> TreeMap : 키와 값을 저장하는 동시에 정렬 
	 *  
	 *  key 가져오기 : keySet() 
	 *  value 가져오기 : values()
	 *  key에 해당하는 value 가져오기
	 *    - Iterator<키의 자료형> it = (컬렉션의 키리스트).iterator();
	 *    - 다음 요소가 있는지 판단하는 .hasNext()
	 *    - 다음 요소를 가져오는 .next()
	 *    - 가져온 요소를 삭제하는 .remove()
	 *    - (리스트).get(키) -> 키의 값 가져옴 
	 *    
	 *  Set
	 *  -> HashSet : Set 인터페이스를 구현한 대표적인 컬렉션 클래스
	 *  -> TreeSet : 저장과 동시에 자동 오름차순 정
	 *  : 중복되면 자동으로 앞거 덮어버림
	 *    -> 중복은 객체의 주소값을 가지고 비교하기 때문에
	 *       내용 같아도 모두 다른 객체로 인식해서 중복 제거 x
	 *       따라서 Person 클래스에서 hashCode(), equals() 메서드 재정의
	 *    implements Comparable<Person> 먼저하고
	 *    
	 *    @Override
	 *    public int hashCode() {
	 *        return Objects.hash(age, name);
	 *    }
	 *    
	 *    @Override
	 *    public boolean equals(Object obj) {
	 *        if (this == obj)
	 *          return true;
	 *        if (obj == null)
	 *          return false;
	 *        if (getClass() != obj.getClass())
	 *          return false;
	 *        Person other = (Person) obj;
	 *        return age == other.age && Objects.equals(name, other.name);
	 *    }
	 *    
	 *    @Override
	 *    public int compareTo(Person o) {
	 *        return this.name.compareTo(o.name) * -1; (이름으로 내림차순 비교)
	 *    }
	 *    
	 *   Iterator
	 *   컬렉션에 저장된 요소를 접근하는데 사용하는 인터페이스
	 *   Iterator()를 호출해서 Iterator를 구현한 객체를 얻어서 사용
	 *   
	 *   
	 *   
	 *   <12.Stream>
	 *   스트림 (Stream) : 다양한 데이터 소스를 표준화된 방법으로 다루기 위한 것
	 *                   데이터의 흐름
	 *   스트림의 특징
	 *   - 데이터를 읽기만 할 뿐 변경 x
	 *   - Iterator처럼 일회용
	 *   - 내부 반복 처리
	 *   
	 *   스트림 종류
	 *   - java.util.stream 패키지에 존재
	 *   
	 *   Stream API
	 *   - 스트림은 자바 8부터 추가된 기능으로 
	 *     컬렉션(배열)의 저장 요소들을 하나씩 참조해서 람다식으로 처리할 수 있게 해주는 반복자
     *   - 내부 반복자를 사용해서 중간 처리(intermediate), 최종 처리(terminal) 작업을 수행
     *   - 중간 처리 : 반복, 매핑(타입변환), 필터링, 정렬 등
     *   - 최종 처리 : 반복, 카운팅, 평균, 총합 등의 집계 처리
     *   - 중간 처리와 최종 처리 메서드를 구분하는 방법 : 리턴타
     *   - 리턴 타입이 Stream : 중간 처리 메서드
     *   - 리턴 타입이 기본 타입 / Optional 객체 : 최종 처리 메서드
     *   - 지연된 연산 : 최종 연산이 수행되기 전까지는 중간 연산이 수행x
	 *                 
	 *   숫자 범위로 스트림 생성 방법
	 *   - IntStream, LongStream, DoubleStream의 
	 *     range(), rangeClosed() 메서드 이용
	 *   배열로부터 스트림 생성 방법
	 *   - Arrays.stream(배열) 메서드로 스트림 생성
	 *   - 각 스트림(Stream, IntStream, ...)의 of(배열) 메서드로 스트림을 생성		
	 *   
	 *    
	 *    
	 */
	
	public static void main(String[] args) {

		IntStream st = IntStream.range(1, 10);
		int sum = st.sum();
		System.out.println(sum);
	
	}
	
}






























