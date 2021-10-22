package com.sist.exam01;

import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.TreeMap;

public class WordCountTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		String data;
		System.out.print("������ �Է��ϼ���==>");
		data = sc.nextLine();			//���鹮�ڵ� �Է¹ޱ� ���Ͽ� nextLine ���
		System.out.println(data);		//hello korea hello java
		
		StringTokenizer st = new StringTokenizer(data);	//�Է��� ������ ���鹮�ڷ� �и�
		//hello -> �ϳ��� token, �ϳ��� �������� �޼ҵ� nextToken,�����ϴ��� hasMoreTokens
		
		TreeMap<String, Integer> map = new TreeMap<String, Integer>();
		//�ܾ key�� �ϰ� �󵵼��� value�� �Ͽ� �����ϱ� ���� map ����
		
		while(st.hasMoreTokens()) {			//�Է¹������κ��� �и��� �ܾŭ �ݺ� ����
			String word = st.nextToken();	//�и��� �ܾ �ϳ��� ������ ��
			Integer cnt = map.get(word);	//map���κ��� �� �ܾ��� �󵵼� �������� ��
			if(cnt == null) {				//���࿡ �� �ܾ map�� ���ٸ�
				map.put(word, 1);			//�󵵼��� 1�� �����Ͽ� map�� �߰�
			}else {							//�׷��� �ʴٸ�(�̹� �� �ܾ map�� �ִٸ�)
				map.put(word, cnt+1);		//�� �󵵼��� +1�� ������ �ٽ� ����
			}
		}
		//System.out.println(map);
		
		//map�� �ִ� �ڷḸŭ �ݺ������ϱ� ���Ͽ� map�� ��� Ű ����� �о��
		//map�� �ִ� ��� key����� set���� ��ȯ
		Set<String> keylist = map.keySet();	
		
		//set ��ü���� �ݺ������ϱ� ���� ����� ���� �׷���
		//set�� �ڷḦ �ϳ��� �������� ���ؼ� Iterator�� ������ ��
		Iterator<String> iter = keylist.iterator();
		
		//�ܾ �󵵼��� ��� �ִ� map�� key ����� ��� �ִ� ���ͷ������� �����Ͱ� �ִ� ��ŭ �ݺ�����
		while(iter.hasNext()){			
			String word = iter.next();		//���ͷ����ͷκ��� �����͸� �������� �ܾ�,�� �ܾ�� map�� key
			int cnt = map.get(word);		//map���κ��� �� �ܾ�(key)�� �󵵼�(value) ������
			System.out.printf("%20s ----> %d\n",word,cnt);	//�ܾ�� �󵵼� ���
		}
		
		
		
		
	}

}
//{hello=2, java=1, korea=1} -> map�� toString�� ������ ��