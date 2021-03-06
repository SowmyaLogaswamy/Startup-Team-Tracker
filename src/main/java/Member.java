import java.util.ArrayList;
import java.util.List;

public class Member {
  private String mname;
  private String mdescription;
  private static List<Member> instances = new ArrayList<Member>();
  private int mId;

  public Member(String name, String description){
    mname = name;
    mdescription = description;
    instances.add(this);
    mId = instances.size();
  }

  public String getName(){
    return mname;
  }

  public String getDescription(){
    return mdescription;
  }

  public static List<Member> getAll(){
    return instances;
  }

  public int getId(){
    return mId;
  }

  public static Member find(int id){
    return instances.get(id-1);
  }

  public static void clearMembers(){
    instances.clear();
  }
}
