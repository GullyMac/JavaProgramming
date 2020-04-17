package ws2.java2.controller;

import java.util.Arrays;

import ws2.java2.entity.*;

public class VehicleManager{
	Vehicle[] vehicleArr = new Vehicle[7];
	
	public VehicleManager() {	
		vehicleArr[0] = new Airplane("����747", 1300, 300, 4);
		vehicleArr[1] = new Airplane("F-16", 1600, 1, 1);
		vehicleArr[2] = new Car("�ҳ�Ÿ3", 180, 5, 10);
		vehicleArr[3] = new Car("Ƽ��", 130, 4, 15);
		vehicleArr[4] = new Car("��Ÿ����", 150, 10, 11);
		vehicleArr[5] = new Ship("ũ����2", 30, 400, 35000);
		vehicleArr[6] = new Ship("��ƿ����", 25, 150, 15000);
	}
	
	public void displayVehicles(String title) {
		System.out.println(title);
		
		for (int i=0; i<vehicleArr.length; i++) {
			vehicleArr[i].displayInfo();
			vehicleArr[i].setAvailable(true);
		}
		
		System.out.println();
	}
	
	public void sortByModelName() {
		Arrays.sort(vehicleArr);
	}
	
//	public void sortByModelName() {
//		for (int i=0; i<vehicleArr.length; i++) {
//			for (int j=i+1; j<vehicleArr.length; j++) {
//				if (vehicleArr[i].getModelName().compareTo(vehicleArr[j].getModelName()) > 0) {
//					Vehicle temp = vehicleArr[i];
//					vehicleArr[i] = vehicleArr[j];
//					vehicleArr[j] = temp;
//				}
//			}
//		}
//	}
}

