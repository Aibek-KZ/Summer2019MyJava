package MyPractice;

public class tripTime extends transport{
	
	@Override
	public void trainSpeed(int distance, double speed) {
		double hours=distance/ speed;
        System.out.println("You will be there by train in "+hours+" hours");
	}

	@Override
	public void airplaneSpeed(int distance, double speed) {
        double hours=distance/ speed;
        System.out.println("You will be there by airplane in "+hours+" hours");
	}

	@Override
	public void shipSpeed(int distance, double speed) {
		double hours=distance/ speed;
        System.out.println("You will be there by ship in "+hours+" hours");		
	}

	}
