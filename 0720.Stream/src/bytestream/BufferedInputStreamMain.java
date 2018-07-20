package bytestream;

import java.io.BufferedInputStream;
import java.io.FileInputStream;

public class BufferedInputStreamMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 파일에서 바이트 단위로 버퍼링을 이용해서 읽기
		BufferedInputStream bis = null;
		try {
			bis = new BufferedInputStream(new FileInputStream("C:\\이우미\\자바_C\\자바\\0702.txt"));
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
