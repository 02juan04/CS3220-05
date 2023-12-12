package lab9;

import java.util.ArrayList;
import java.util.List;

public class Group{

	private String groupName;
	private List<Student> members;

	public Group(String groupName) {
        this.groupName = groupName;
        this.members = new ArrayList<>();
	}


	public String getGroupName() {
		return groupName;
	}


	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}


	public List<Student> getMembers() {
		return members;
	}


	public void setMembers(List<Student> members) {
		this.members = members;
	}
	
    public void addMember(Student student) {
        this.members.add(student);
    }


}


