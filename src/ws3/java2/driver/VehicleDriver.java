package ws3.java2.driver;

import ws3.java2.controller.*;

public class VehicleDriver {
	public static void main(String[] args) {
		VehicleManager vm1 = new VehicleManager();
		vm1.displayVehicles1(">> ��� ��� <<");
		vm1.sortByModelName();
		vm1.displayVehicles1(">> �𵨸����� ���ĵ� ��� ��� <<");
		
		VehicleManager vm2 = new VehicleManager();
		vm2.displayVehicles2(">> ��� ��� <<");
		vm2.sortByModelName();
		vm2.displayVehicles2(">> �𵨸����� ���ĵ� ��� ��� <<");
	}
}
