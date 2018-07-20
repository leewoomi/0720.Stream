package characterstream;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class MemberMain {

	public static void main(String[] args) {
		// Ű����κ��� �� ������ �Է��� ���� �� �ִ� Ŭ������
		// ������ ���� ����
		// finally������ close�� �� �� �ֵ��� try �ۿ��� ������ ���� ��.

		BufferedReader br = null;
		try {
			// Ű����κ��� �Է� ���� �� �ִ� �ν��Ͻ� ����
			br = new BufferedReader(new InputStreamReader(System.in));

			System.out.print("�̸� : ");
			String name = br.readLine();
			System.out.print("����: ");
			String age = br.readLine();
			System.out.println("Ű: ");
			String height = br.readLine();

			// System.out.println(name);
			// System.out.println(Integer.parseInt(age));
			// System.out.println(Double.parseDouble(height));

			// 3���� �����͸� �ϳ��� �����ϱ� ���� �ν��Ͻ��� ����
			Member member = new Member();
			member.setName(name);
			// ������ ��ȯ �� ����
			member.setAge(Integer.parseInt(age));
			// �Ǽ��� ��ȯ �� ����
			member.setHeight(Double.parseDouble(height));

			// ���� �̿��ؼ� ����
			Map<String, Object> map = new HashMap<>();
			map.put("name", name);
			map.put("age", Integer.parseInt(age));
			map.put("height", Double.parseDouble(height));
			
			//����� ���� VOŬ������ map�� �� ���̰� ����.
			System.out.println(member);
			System.out.println(map);
			
			//����� ���� ���� �ٸ�. 
			//���̸� 1�� ����
			int r= member.getAge()+1;
			//Map������ �����͸� �����ͼ� ����� �� ���� �� ��ȯ�� �ؾ� �մϴ�.
			r =(Integer)map.get("age")+1;
			
			System.out.println(r);
		
		} catch (Exception e) {
			System.out.println("���� : " + e.getMessage());
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
