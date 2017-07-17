import org.junit.*;
import static org.junit.Assert.*;

public class MemberTest {
  @Test
  public void Member_instantiatesCorrectly_true() {
    Member testMember = new Member("Sowmya", "Student");
    assertEquals(true, testMember instanceof Member);
  }

  @Test
  public void email_returnsMemberName_Sowmya() {
    Member testMember = new Member("Sowmya", "Student");
    assertEquals("Sowmya", testMember.getName());
  }

  @Test
  public void getAll_returnsAllMembers_3() {
    Member.clearMembers();
    Member testMember1 = new Member("Sowmya", "Student");
    Member testMember2 = new Member("Kumar", "Engineer");
    Member testMember3 = new Member("Karthi", "Developer");
    assertEquals(3, Member.getAll().size());
  }

  @Test
  public void clearMembers_clearsAllExistingMembers_0() {
    Member testMember1 = new Member("Sowmya", "Student");
    Member testMember2 = new Member("Kumar", "Engineer");
    Member testMember3 = new Member("Karthi", "Developer");
    Member.clearMembers();
    assertEquals(0, Member.getAll().size());
  }

  @Test
  public void find_returnsCorrectMember_testMember3() {
    Member.clearMembers();
    Member testMember1 = new Member("Sowmya", "Student");
    Member testMember2 = new Member("Kumar", "Engineer");
    Member testMember3 = new Member("Karthi", "Developer");
    assertEquals(testMember3, Member.find(3));
  }
}
