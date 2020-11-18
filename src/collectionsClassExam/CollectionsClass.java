package collectionsClassExam;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import javax.sound.sampled.ReverbType;

public class CollectionsClass {
	
	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<Integer>();
		System.out.println(list);
		
		// 컬렉션에 요소추가
		Collections.addAll(list, 1,2,3,4,5);
		System.out.println(list); //[1, 2, 3, 4, 5]
		
		
		Set<Integer> set = new HashSet<Integer>();
		Collections.addAll(set, 1,2,4,3,5);
		
		Iterator<Integer> it = set.iterator();
		while(it.hasNext()) {
			System.out.print(it.next() + " ");
		}
		// 1 2 3 4 5 
		System.out.println();
		
		// 요소들을 두 칸씩 이동시킨다, List에서만 사용가능
		Collections.rotate(list, 2);
		System.out.println(list); //[4, 5, 1, 2, 3]
		
		// 요소의 위치변경, List에서만 사용가능
		Collections.swap(list, 0, 2);
		System.out.println(list); //[1, 5, 4, 2, 3]
		
		// 요소의 위치들을 임의의 변경
		Collections.shuffle(list);
		System.out.println(list); //[3, 2, 5, 1, 4]
		
		// 요소들을 오름차순으로 정렬, 임의의로 정렬방식을 변경가능
		Collections.sort(list);
		System.out.println(list); //[1, 2, 3, 4, 5]
		
		// 역순정렬
		Collections.sort(list, Collections.reverseOrder());
		System.out.println(list); // [5, 4, 3, 2, 1]
		
		// 요소의 위치를 찾는다
		int idx = Collections.binarySearch(list, 3);
		System.out.println(idx); // 2
		
		// 최댓값,최소값
		System.out.println(Collections.max(list)); // 5
		System.out.println(Collections.min(list)); // 1
		System.out.println(Collections.max(list,Collections.reverseOrder())); // 1
		
		// 리스트를 지정한 요소로 채운다
		Collections.fill(list, 9);
		System.out.println(list);
		
		// list와 같은 사이즈로 생성뒤 지정한 요소로 채운다
		List<Integer> newList = Collections.nCopies(list.size(), 2);
		System.out.println(newList); //[2, 2, 2, 2, 2]
		
		// 두 리스트가 다른 요소가 하나라도 있으면 true
		System.out.println(Collections.disjoint(list, newList)); //true
		
		// 리스트의 요소를 복사한다
		Collections.copy(list, newList);
		System.out.println(newList); //[2, 2, 2, 2, 2]
		System.out.println(list); //[2, 2, 2, 2, 2]
	}
}
