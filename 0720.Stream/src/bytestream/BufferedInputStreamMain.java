package bytestream;

import java.io.BufferedInputStream;
import java.io.FileInputStream;

public class BufferedInputStreamMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ���Ͽ��� ����Ʈ ������ ���۸��� �̿��ؼ� �б�
		BufferedInputStream bis = null;
		try {
			bis = new BufferedInputStream(new FileInputStream("C:\\�̿��\\�ڹ�_C\\�ڹ�\\0702.txt"));
			while(true) {
				byte [] b = new byte[1024];
				int r = bis.read(b);
				System.out.println(new String(b));
				if(r<=0) {
					break;
				}
			}
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			// TODO: handle finally clause
		}
	}

}
