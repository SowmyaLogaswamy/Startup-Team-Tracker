import org.junit.*;
import static org.junit.Assert.*;

public class TeamTest {
  @Test
  public void Team_instantiatesCorrectly_true() {
    Team testTeam = new Team("Team Cambridge");
    assertEquals(true, testTeam instanceof Team);
  }

  @Test
  public void name_returnsTeamName_TeamCambridge() {
    Team testTeam = new Team("Team Cambridge");
    assertEquals("Team Cambridge", testTeam.getName());
  }

  @Test
  public void clearTeams_resetsNumOfTeamsToZero_0() {
    Team testTeam1 = new Team("Team Cambridge");
    Team testTeam2 = new Team("Team Harry");
    Team.clearTeams();
    assertEquals(0, Team.getAll().size());
  }

  @Test
  public void getAll_returnsAllTeams_3() {
    Team.clearTeams();
    Team testTeam1 = new Team("Team Cambridge");
    Team testTeam2 = new Team("Team Harry");
    Team testTeam3 = new Team("Team Graffindor");
    assertEquals(3, Team.getAll().size());
  }

  @Test
  public void addMember_AddsMemberToTeam_true() {
    Team testTeam = new Team("Team Cambridge");
    Member testMember = new Member("Sowmya", "Student");
    testTeam.addMember(testMember);
    assertEquals(true, testTeam.allMembers().contains(testMember));
  }

  @Test
  public void addMember_DoesNotAddDuplicateMembersToTeam_1() {
    Team testTeam = new Team("Team Cambridge");
    Member testMember = new Member("Kumar", "Engineer");
    testTeam.addMember(testMember);
    testTeam.addMember(testMember);
    assertEquals(1, testTeam.allMembers().size());
  }

  @Test
  public void find_returnsTheCorrectTeam() {
    Team.clearTeams();
    Team testTeam = new Team("Team Cambridge");
    Team testTeam2 = new Team("Team Granger");
    assertEquals(testTeam2.getName(), Team.find(2).getName());
  }

  @Test
  public void allMembers_returnsAllMembers() {
    Team testTeam = new Team("Team Cambridge");
    Member default1 = new Member("Sowmya", "Student");
    Member default2 = new Member("Kumar", "Engineer");
    testTeam.addMember(default1);
    testTeam.addMember(default2);
    assertEquals(2, testTeam.allMembers().size());
  }

  @Test
  public void reset_ClearsTheListOfMembers() {
    Team testTeam = new Team("Team Cambridge");
    Member default1 = new Member("Sowmya", "Student");
    Member default2 = new Member("Kumar", "Engineer");
    testTeam.addMember(default1);
    testTeam.addMember(default2);
    testTeam.clearMembers();
    assertEquals(0, testTeam.allMembers().size());
  }
}
