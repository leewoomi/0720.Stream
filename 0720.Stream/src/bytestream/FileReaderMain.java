package bytestream;

import java.io.FileReader;
import java.io.IOException;

public class FileReaderMain {

	public static void main(String[] args) {
		FileReader fr = null;
		try {
			fr = new FileReader("C:\\�̿��\\�ڹ�_C\\�ڹ�\\0702.txt");
			char [] ch = new char[15];
			while(true) {
				//ch�� ũ�� ��ŭ �о ch�������ϰ�
				//���� ������ r�� ����
				int r = fr.read(ch);
				if(r<=0) {
					break;
				}
				//�迭���� 0��° ���� r ��ŭ�� ���ڿ��� ��ȯ�ؼ� ���
				System.out.println(new String (ch,0,r));
			}
			//fr.read(ch);
			// for(char chr : ch) {
			// System.out.println(chr);
			// }
			//System.out.println(ch);
			//System.out.println(new String (ch));
		} catch (Exception e) {
			
			System.out.println("����: "+e.getMessage());
		} finally {
			if (fr != null) {
					try {
						fr.close();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
			
			}
		}

	}

}
