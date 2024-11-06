import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class TreeMapTest1 {

	public static void main(String[] args) {
		// TreeMap 생성 (이름을 key로, 성적을 value로)
		TreeMap<String,Integer> scores = new TreeMap<String, Integer>();
		
		// 학생 이름과 성적 추가
		scores.put("홍길동", 85);
		scores.put("박길동", 92);
		scores.put("김길동", 78);
		scores.put("손길동", 88);
		scores.put("임길동", 95);
		
		// 성적 출력(Key를 기준으로 자동 정렬)
		System.out.println("학생 성적");
		for(Map.Entry<String, Integer> entry : scores.entrySet()) {
			System.out.println("이름 : " + entry.getKey() + ", 성적 : " + entry.getValue());
		}
		
		// 점수에 따라 정렬하기 위해 List 생성
		List<Map.Entry<String, Integer>> entryList = new ArrayList<>(scores.entrySet());
		
		// 점수 기준으로 정렬(오름 차순) - 람다 표현식 사용
		entryList.sort(Comparator.comparingInt(Map.Entry::getValue));
		
		// 점수 순서대로 출력 (낮은 점수부터)
		System.out.println("점수 순으로 출력 (낮은 점수부터) : " + entryList);
		
		// 가장 낮은 점수 출력
		System.out.println("가장 낮은 성적은 " + entryList.get(0).getValue() + "점이며 이름은 " + entryList.get(0).getKey() + "입니다");
		
		// 가장 높은 점수 출력
		System.out.println("가장 높은 성적은 " + entryList.get(entryList.size() - 1).getValue() + "점이며 이름은 " + entryList.get(entryList.size() - 1).getKey() + "입니다");
		
		/*
		// 최고 점수와 최저 점수 찾기
		Map.Entry<String, Integer> highest = scores.lastEntry();
		Map.Entry<String, Integer> lowest = scores.firstEntry();
		
		System.out.println("\n최고 점수 : " + highest.getValue() + " (" + highest.getKey() + ")");
		System.out.println("\n최저 점수 : " + lowest.getValue() + " (" + lowest.getKey() + ")");
		*/
		

	}

}
