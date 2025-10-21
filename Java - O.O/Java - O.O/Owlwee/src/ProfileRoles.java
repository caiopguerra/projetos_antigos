
public class ProfileRoles {

	public String id;
	public int profile_id;
	public int role_id;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public int getProfile_id() {
		return profile_id;
	}
	public void setProfile_id(int profile_id) {
		this.profile_id = profile_id;
	}
	public int getRole_id() {
		return role_id;
	}
	public void setRole_id(int role_id) {
		this.role_id = role_id;
	}
	
	@Override
	public String toString() {
		return "ProfileRoles [id=" + id + ", profile_id=" + profile_id + ", role_id=" + role_id + "]";
	}
}
