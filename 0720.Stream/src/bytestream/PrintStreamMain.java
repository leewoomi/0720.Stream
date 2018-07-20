package bytestream;

import java.io.FileOutputStream;
import java.io.PrintStream;

public class PrintStreamMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PrintStream ps = null;
		try {
			ps = new PrintStream(new FileOutputStream("./data.dat", true));
			ps.println("hello");
			ps.flush();
		}catch (Exception e) {
			System.out.println("���� ���� ���� : " + e.getMessage());
		}finally {
			if(ps !=null) {
			ps.close();
			}
		}
	}

}
