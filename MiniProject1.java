import java.util.*;

class MiniProject {

	/* Globally declared variable */
	/* here, count => used to count total No of vehicle. */
	int amount = 0, count = 0, noOfRiksha = 0, noOfBus = 0, noOfCycle = 0, noOfBike = 0, noOfCar = 0, noOfPickup = 0,
			noOfTruck = 0, noOfLoadedVehicle;

	public int Menu() { /* Menu here is the HomePage for userInterface with choices */
		System.out.println("Welcome to the Screen of Toll Plaza");
		System.out.println("       Management Section");
		System.out.println("\n1.Enter riksha🛺:");
		System.out.println("2.Enter cycle🚲:");
		System.out.println("3.Enter bus🚎:");
		System.out.println("4.Enter bike🛵🏍️:");
		System.out.println("5.Enter car🚗:");
		System.out.println("6.Enter pickup🛻:");
		System.out.println("7.Enter truck🚚:");
		System.out.println("8.Enter loadedVehicle🚛:");
		System.out.println("9.Show status:");
		System.out.println("10.Delete Data:");
		System.out.println("11.To Exit");
		System.out.println("\nEnter your Choice:\n");
		Scanner sc = new Scanner(System.in);
		int choice = sc.nextInt();
		return (choice);

	}

	public void Delete() { /* Delete=> function used to delete all data entered */
		/* and Restart Enter new data from begining of the day */
		amount = 0;
		count = 0;
		noOfRiksha = 0;
		noOfBus = 0;
		noOfCycle = 0;
		noOfBike = 0;
		noOfCar = 0;
		noOfPickup = 0;
		noOfTruck = 0;
		noOfLoadedVehicle = 0;

	}

	public void ShowDetail() { /* ShowDetail=>Used to show all Entered data Datail */
		/* and totalNoOfVehicle =count */
		/* and amount collection */
		System.out.print("\nNumber of riksha=" + noOfRiksha);
		System.out.print("\nNumber of cycle=" + noOfCycle);
		System.out.print("\nNuber of bus=" + noOfBus);
		System.out.print("\nNumber of bike=" + noOfBike);
		System.out.print("\nNumber of Car=" + noOfCar);
		System.out.print("\nNumber of pickup=" + noOfPickup);
		System.out.print("\nNuber of truck=" + noOfTruck);
		System.out.print("\nNumber of loadedVehicle=" + noOfLoadedVehicle);
		System.out.print("\nTotal Number of vehicle=" + count);
		System.out.print("\nTotal Collection amount = " + amount);

	}

	public void riksha() { // used for riksha details
		// tax = 50Rs.
		System.out.print("Entry success✅👍\n");
		noOfRiksha++;
		amount = amount + 50;
		count++;

	}

	public void cycle() { // used for cycle details
		// tax = 0Rs.
		System.out.print("Entry success✅👍\n");
		noOfCycle++;
		amount = amount + 0;
		count++;

	}

	public void bus() { // used for bus details
		// tax = 100Rs.
		System.out.print("Entry success✅👍\n");
		noOfBus++;
		amount = amount + 100;
		count++;

	}

	public void bike() { // used for bike details
		// tax = 0Rs.
		System.out.print("Entry success✅👍\n");
		noOfBike++;
		amount = amount + 0;
		count++;

	}

	public void car() { // used for car details
		// tax = 70Rs.
		System.out.print("Entry success✅👍\n");
		noOfCar++;
		amount = amount + 70;
		count++;

	}

	public void pickup() { // used for pickup details
		// tax =100Rs.
		System.out.print("nEntry success✅👍\n");
		noOfPickup++;
		amount = amount + 100;
		count++;

	}

	public void truck() { // used for truck deatails
		// tax = 120Rs.
		System.out.print("Entry success✅👍\n");
		noOfTruck++;
		amount = amount + 120;
		count++;

	}

	public void loadedVehicle() { // used for loaded vehicle details
		// tax = 150Rs.
		System.out.print("Entry success✅👍\n");
		noOfLoadedVehicle++;
		amount = amount + 150;
		count++;

	}
}

class Main {

	public static void main(String args[]) {

		// Indtsntiated an object of class MiniProject.
		MiniProject mini = new MiniProject();
		while (1 > 0) { /* infinite loop used to repeat condition to enter vehicles */
			switch (mini.Menu()) {
				case 1:
					mini.riksha();
					break;
				case 2:
					mini.cycle();
					break;
				case 3:
					mini.bus();
					break;
				case 4:
					mini.bike();
					break;
				case 5:
					mini.car();
					break;
				case 6:
					mini.pickup();
					break;
				case 7:
					mini.truck();
					break;
				case 8:
					mini.loadedVehicle();
					break;
				case 9:
					mini.ShowDetail();
					break;
				case 10:
					mini.Delete();
					break;
				case 11:
					System.exit(0); // used to exit from loop.
				default:
					System.out.print("Invalid choice:\n");

			}

		}
	}
}