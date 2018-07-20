package characterstream;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class DataMain {

	public static void main(String[] args) {
		BufferedReader br = null;

		try {
			br = new BufferedReader(new FileReader("C:\\�̿��\\�ڹ�_C\\�ڹ�\\log.txt"));

			ArrayList<String> iplist = new ArrayList<>();

			//�ߺ� ���� �����ϱ� ���� set�����
			Set<String> ipset =new HashSet<String>();
			while (true) {
				// �� �� �б�
				String line = br.readLine();
				// ���� �����Ͱ� ������ ����
				if (line == null) {
					break;
				}
				// ���� ����
				String[] ar = line.split(" ");
				// System.out.println(ar);
				iplist.add(ar[0]);
				ipset.add(ar[0]);
			}
			System.out.println(iplist);
			
			for(String ip : ipset) {
				System.out.println(ip);
			}

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
