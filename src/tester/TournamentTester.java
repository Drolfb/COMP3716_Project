package tester;

import main.Tournament;
import main.formats.SingleElimination;

public class TournamentTester {

	public static void main(String[] args) {
		//Set an id
		int id = 0;
		//Create new tournament with id
		Tournament tour = new Tournament(id, "Test");
		System.out.println("Tournament created.");
		//Add 8 teams
		tour.addTeam("Team Awesome");
		tour.addTeam("Team Super");
		tour.addTeam("Team Alright");
		tour.addTeam("Team Horrible");
		tour.addTeam("Team Decent");
		tour.addTeam("Team How-Did-They-Get-This-Far");
		tour.addTeam("Seahawks");
		tour.addTeam("Pioneers");
		System.out.println("Teams added");
		//Set tournament format to single elimination
		tour.setFormat(new SingleElimination());
		System.out.println("Format set to: " + tour.getFormat().toString());
		tour.generateTeamCollection();
		System.out.println("Schedule set to: " + tour.getFormat().getSchedule().toString());
		tour.simulateTour();
	}
}
