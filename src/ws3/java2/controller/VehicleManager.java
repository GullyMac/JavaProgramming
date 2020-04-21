package ws3.java2.controller;

import java.util.*;

import ws2.java2.entity.Airplane;
import ws2.java2.entity.Car;
import ws2.java2.entity.Ship;
import ws2.java2.entity.Vehicle;
import ws3.java2.entity.*;

public class VehicleManager {
	//�Ʒ� �ڵ�� �迭�� �����ϴ� ������ ������ ���̴�.
	//ArrayList�� �����ϵ��� ���ο� ������ �����Ͻÿ�.(��������  vehicleList)
	Vehicle[] vehicleArr = new Vehicle[7];
	List<Vehicle> vehicleList = new ArrayList<Vehicle>();
	
	public VehicleManager() {
		//�Ʒ� �ڵ�� �迭�� �̿��ϵ��� �ۼ��Ǿ���.
		//ArrayList�� ����ϵ��� �����Ͻÿ�.
		
		vehicleArr[0] = new Airplane("����747", 1300, 300, 4);
		vehicleArr[1] = new Airplane("F-16", 1600, 1, 1);
		vehicleArr[2] = new Car("�ҳ�Ÿ3", 180, 5, 10);
		vehicleArr[3] = new Car("Ƽ��", 130, 4, 15);
		vehicleArr[4] = new Car("��Ÿ����", 150, 10, 11);
		vehicleArr[5] = new Ship("ũ����2", 30, 400, 35000);
		vehicleArr[6] = new Ship("��ƿ����", 25, 150, 15000);
		
		vehicleList.add(new Airplane("����747", 1300, 300, 4));
		vehicleList.add(new Airplane("F-16", 1600, 1, 1));
		vehicleList.add(new Car("�ҳ�Ÿ3", 180, 5, 10));
		vehicleList.add(new Car("Ƽ��", 130, 4, 15));
        vehicleList.add(new Car("��Ÿ����", 150, 10, 11));
        vehicleList.add(new Ship("ũ����2", 30, 400, 35000));
		vehicleList.add(new Ship("��ƿ����", 25, 150, 15000));
	}
	
	public void displayVehicles(String title) {
		//�Ʒ� �ڵ�� �迭�� ����Ű�� ��� ��ü�� ������ ����ϵ��� �ۼ��Ǿ���.
		//ArrayList�� vehicleList�� ��� ��� ��ü�� ����ϵ��� �����Ͻÿ�.
		System.out.println(title);
		for (int i=0; i<vehicleArr.length; i++) {
			vehicleArr[i].displayInfo();
			vehicleArr[i].setAvailable(true);
		}
		System.out.println();
	}
	
	public void displayVehicles1(String title) {
		System.out.println(title);
		for(Vehicle v: vehicleList) {
			v.displayInfo();
		}
		System.out.println();
	}
	
	public void displayVehicles2(String title) {
		System.out.println(title);
		Iterator<Vehicle> ltr = vehicleList.iterator();
		while(ltr.hasNext()) {
			ltr.next().displayInfo();
		}
		System.out.println();
	}
	
	public void sortByModelName() {
		//�Ʒ� �ڵ�� �迭�� ���ؼ� ������ �����ϴ� ���̴�.
		//ArrayList�� vehicleList�� ���ؼ� ������ �����ϴ� �ڵ�� ��ȯ�Ͻÿ�.
		Collections.sort(vehicleList);
		
	}
}

