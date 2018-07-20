package characterstream;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class StringBuilderMain {

	public static void main(String[] args) {
		/*
		 * ex2)������ ���� ������ ������ �аų� ������ �ٿ�ε� �޴� ��쿡�� �����ؼ� �����͸� �����ɴϴ�. ���ڿ��� �����ؼ� ���� �� �ϳ���
		 * ���鶧�� ���ڿ��� ����ؼ� �̾� �ٿ��� �մϴ�. String�� ������ ���ڿ��� �ٸ� ���ڿ��� �߰��ϸ� ���縦 ������ �� �۾��� �ϱ� ������
		 * �̾���̱⸦ �ϸ� �޸� ���� �߻��� ���ɼ��� Ŀ���ϴ�. �̷� ���� StringBuilder�� �̿��ؼ� ���ڿ��� �̾���̰� �� ���� ��
		 * String���� ��ȯ�ϴ� �۾��� Ȱ���ؾ� �մϴ�.
		 */
		BufferedReader br = null;

		try {
			br = new BufferedReader(new FileReader("C:\\�̿��\\�ڹ�_C\\�ڹ�\\0719.txt"));

			// �� ������ �����͸� �̾���� StringBuilder
			StringBuilder sb = new StringBuilder();

			while (true) {
				// �� �� �б�
				String line = br.readLine();
				// ���� �����Ͱ� ������ ����
				if (line == null) {
					break;
				}
				// ���� �����Ͱ� ������ sb�� �߰�
				sb.append(line);
			}
			// ���� ������ String�� ����
			String content = sb.toString();
			// �޸� ������ ����
			sb = null;
			System.out.println(content);

		} catch (Exception e) {
			System.out.println("����: " + e.getMessage());
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
