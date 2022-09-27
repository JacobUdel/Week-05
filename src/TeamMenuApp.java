import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TeamMenuApp {
	static Scanner scanner = new Scanner(System.in);
	static List<Team> teams = new ArrayList<Team>();
	
	public static void main(String[] args) {


	/*	Player p1 = new Player("Thomas", "Full back", "Running fast");
		Player p2 = new Player("Sally", "Quater back", "Throwing Far");
		
		Team team = new Team("Really good team!");
		team.addPlayer(p1);
		team.addPlayer(p2);
		team.describe();
		
		team.removePlayer("Thomas");
		team.describe();
*/
		
		int decision = 0;
		while(true) {
			printOptions();
			decision = scanner.nextInt();
			if (decision == 1) {
				teams.add(createNewTeam());
			} else if (decision == 2) {
				addPlayerToTeam();
			} else if (decision == 3) {
				removePlayerFromTeam();
			} else if (decision == 4) {
				describeTeam();
			} else {
				break;
			}
		}
	}
	
	private static void describeTeam() {
		printTeamNames();
		System.out.print("Which team would you like to see the info for?");
		String teamName = scanner.next();
		try {
			Team foundTeam = findTeamName(teamName);
			foundTeam.describe();
		} catch (Exception e) {
			System.out.println(e.toString());
		}
		
	}

	private static void removePlayerFromTeam() {
		printTeamNames();
		System.out.print("Enter the name of the Team you wish to remove the player from: ");
		String teamName = scanner.next();
		try {
			Team foundTeam = findTeamName(teamName);
			foundTeam.describe();
			System.out.println("Which player woudl you like to remove?");
			String playerNamer = scanner.next();
			foundTeam.removePlayer(playerNamer);
		} catch (Exception e) {
			System.out.println(e.toString());
		}
		
	}

	private static void addPlayerToTeam() {
		printTeamNames();
		System.out.print("Enter the name of the team you wish to add a player to: ");
		String teamName = scanner.next();
		try {
			Team foundTeam = findTeamName(teamName);
			foundTeam.addPlayer(createNewPlayer());
		} catch (Exception e) {
			System.out.println(e.toString());
		}
		
	}
	
	private static Player createNewPlayer() {
		System.out.print("Enter Player Name: ");
		String name = scanner.next();
		System.out.print("Enter Player Position: ");
		String position = scanner.next();
		System.out.print("Enter Player Speciality: ");
		String speciality = scanner.next();
		return new Player(name, position, speciality);
	}

	private static void printTeamNames() {
		for (Team team: teams) {
			System.out.println(team.getName());
		}
		
		
	}
	
	private static Team findTeamName(String name) throws Exception {
		for (Team team : teams) {
			if (team.getName().equals(name)) {
				return team;
			}
		}
		throw new Exception("Team not found: " + name);
	}

	private static void printOptions() {
		System.out.println("1) Create New Team");
		System.out.println("2) Add New Player To Team");
		System.out.println("3) Remove Player From Team");
		System.out.println("4) View Team Info");
	}

	private static Team createNewTeam() {
		System.out.print("Enter the team you wish to create.");
		String name = scanner.next();
		return new Team(name);
		
	}
}
