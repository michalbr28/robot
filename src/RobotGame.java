import static java.lang.Math.random;

public class RobotGame {

	public static void main(String[] args) {
		Robot robot1 = new Robot("RED", 10, true);
		Robot robot2 = new Robot("GREEN", 10, true);
		int action1 = (int) (random() * 4) + 1;
		int action2 = (int) (random() * 4) + 1;

		while (robot1.isInGame() && robot2.isInGame()) {

			processAction(robot1, action1);
			processAction(robot2, action2);

			if (robot1.getPlace() == 100) {
				System.out.print("R1 winner "+ robot1.toString() );
			}
			
			if (robot2.getPlace() == 100) {
				System.out.print("R2 winner "+robot2.toString() );
			}
			
			if (robot1.getPlace() == robot2.getPlace()) {
				robot2.setInGame(false);
				System.out.print("R1 winner " + robot1.toString());
			}
			
			if (robot2.getPlace() == robot1.getPlace()) {
				robot1.setInGame(false);
				System.out.print("R2 winner " + robot2.toString());
			}
			
			if (robot1.isInGame() == false) {
				System.out.print("R2 winner " + robot2.toString());
			}
			if (robot2.isInGame() == false) {
				System.out.print("R1 winner " + robot1.toString());

			}
		}
	}

	private static void processAction(Robot robot, int action) {
		int n;
		switch (action) {
		case 1:
			robot.next();
			System.out.println("Robot " + robot.getColor() +"\t Next:" + action +" Place:" + robot.getPlace());
			break;

		case 2:
			robot.back();
			System.out.println("Robot " + robot.getColor() +"\t Back:" + action + " Place:" + robot.getPlace());
			break;

		case 3:
			n = (int) (random() * 6) + 1;
			robot.nextN(n);
			System.out.println("Robot " + robot.getColor() +"\t NextN:" + action + " Place:" + robot.getPlace());
			break;

		case 4:
			n = (int) (random() * 6) + 1;
			robot.backN(n);
			System.out.println("Robot " + robot.getColor() +"\t BackN:" + action + " Place:" + robot.getPlace());
			break;

		default:
			System.err.println(" bad action:" + action);
			break;
		}
	}
}
