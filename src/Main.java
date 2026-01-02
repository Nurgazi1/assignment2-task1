//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    Vehicle vehicle = new Vehicle("Samsara", 2010, 20000);
    Vehicle vehicle1 = new Vehicle("Aurora", 2015, 35000);


    System.out.println(vehicle);
    System.out.println(vehicle1);

    System.out.println(vehicle.getAge(2026));
}
