package ua.lviv.lgs.min;

import java.util.ArrayList;
import java.util.List;

public class main {

	public static void main(String[] args) {
		
		
		// ��� ���� ����. �� ������ ������ list �� ����������
		// � ����� ����� integer ��� ������ Integers. 
		// ���� ��������� ���� Integers � ����� String � ��������
		// ������ ������ ���� Integers � ������� � ����� �����
		// ��'��� ���� String
		
		
		List<Integers> list = new ArrayList<Integers>();
		list.add(new Integers("I put String into list"));
		System.out.println(list.get(0).toString());

	}

}
