import java.util.ArrayList;
import java.util.List;

public class Member {
  private String mname;
  private static List<Member> instances = new ArrayList<Member>();
  private int mId;

  public Member(String name){
    mEmail = email;
    instances.add(this);
    mId = instances.size();
  }

  public String name(){
    return mname;
  }

  public static List<Member> getAll(){
    return instances;
  }

  public int id(){
    return mId;
  }

  public static Member find(int id){
    return instances.get(id-1); 
  }

  public static void clearMembers(){
    instances.clear();
  }
}
