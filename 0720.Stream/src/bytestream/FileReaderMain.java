package bytestream;

import java.io.FileReader;
import java.io.IOException;

public class FileReaderMain {

	public static void main(String[] args) {
		FileReader fr = null;
		try {
			fr = new FileReader("C:\\이우미\\자바_C\\자바\\0702.txt");
			char [] ch = new char[15];
			while(true) {
				//ch의 크기 만큼 읽어서 ch에저장하고
				//읽은 개수를 r에 저장
				int r = fr.read(ch);
				if(r<=0) {
					break;
				}
				//배열에서 0번째 부터 r 만큼만 문자열로 변환해서 출력
				System.out.println(new String (ch,0,r));
			}
			//fr.read(ch);
			// for(char chr : ch) {
			// System.out.println(chr);
			// }
			//System.out.println(ch);
			//System.out.println(new String (ch));
		} catch (Exception e) {
			
			System.out.println("예외: "+e.getMessage());
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
