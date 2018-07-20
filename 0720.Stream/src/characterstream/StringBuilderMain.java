package characterstream;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class StringBuilderMain {

	public static void main(String[] args) {
		/*
		 * ex2)내용이 많은 파일의 내용을 읽거나 웹에서 다운로드 받는 경우에는 분할해서 데이터를 가져옵니다. 문자열을 분할해서 읽은 후 하나로
		 * 만들때는 문자열을 계속해서 이어 붙여야 합니다. String은 원래의 문자열에 다른 문자열을 추가하면 복사를 수행한 후 작업을 하기 때문에
		 * 이어붙이기를 하면 메모리 낭비가 발생할 가능성이 커집니다. 이럴 때는 StringBuilder를 이용해서 문자열을 이어붙이고 다 읽은 후
		 * String으로 변환하는 작업을 활용해야 합니다.
		 */
		BufferedReader br = null;

		try {
			br = new BufferedReader(new FileReader("C:\\이우미\\자바_C\\자바\\0719.txt"));

			// 줄 단위로 데이터를 이어붙일 StringBuilder
			StringBuilder sb = new StringBuilder();

			while (true) {
				// 한 줄 읽기
				String line = br.readLine();
				// 읽은 데이터가 없으면 종료
				if (line == null) {
					break;
				}
				// 읽은 데이터가 있으면 sb에 추가
				sb.append(line);
			}
			// 읽은 내용을 String에 저장
			String content = sb.toString();
			// 메모리 정리를 위해
			sb = null;
			System.out.println(content);

		} catch (Exception e) {
			System.out.println("예외: " + e.getMessage());
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
