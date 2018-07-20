package characterstream;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class MemberMain {

	public static void main(String[] args) {
		// 키보드로부터 줄 단위로 입력을 받을 수 있는 클래스의
		// 참조형 변수 선언
		// finally절에서 close를 할 수 있도록 try 밖에서 변수를 선언 함.

		BufferedReader br = null;
		try {
			// 키보드로부터 입력 받을 수 있는 인스턴스 생성
			br = new BufferedReader(new InputStreamReader(System.in));

			System.out.print("이름 : ");
			String name = br.readLine();
			System.out.print("나이: ");
			String age = br.readLine();
			System.out.println("키: ");
			String height = br.readLine();

			// System.out.println(name);
			// System.out.println(Integer.parseInt(age));
			// System.out.println(Double.parseDouble(height));

			// 3개의 데이터를 하나로 저장하기 위한 인스턴스를 생성
			Member member = new Member();
			member.setName(name);
			// 정수로 변환 후 저장
			member.setAge(Integer.parseInt(age));
			// 실수로 변환 후 저장
			member.setHeight(Double.parseDouble(height));

			// 맵을 이용해서 저장
			Map<String, Object> map = new HashMap<>();
			map.put("name", name);
			map.put("age", Integer.parseInt(age));
			map.put("height", Double.parseDouble(height));
			
			//출력할 때는 VO클래스나 map이 별 차이가 없다.
			System.out.println(member);
			System.out.println(map);
			
			//사용할 때는 조금 다름. 
			//나이를 1씩 증가
			int r= member.getAge()+1;
			//Map에서는 데이터를 가져와서 사용할 때 강제 형 변환을 해야 합니다.
			r =(Integer)map.get("age")+1;
			
			System.out.println(r);
		
		} catch (Exception e) {
			System.out.println("예외 : " + e.getMessage());
		} finally {
			if (br != null) {
				try {
					br.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}

}
