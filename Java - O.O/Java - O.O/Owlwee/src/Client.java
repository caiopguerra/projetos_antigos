import java.util.Date;

public class Client extends Profiles {

	public int id;
	public double cpf;
	public int birthday;
	public String first_name;
	public String last_name;
	public int phone;
	public String email;
	public String password;
	public Date criated_at;
	public int profiles_id;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getCpf() {
		return cpf;
	}
	public void setCpf(double cpf) {
		this.cpf = cpf;
	}
	public int getBirthday() {
		return birthday;
	}
	public void setBirthday(int birthday) {
		this.birthday = birthday;
	}
	public String getFirst_name() {
		return first_name;
	}
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}
	public String getLast_name() {
		return last_name;
	}
	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}
	public double getPhone() {
		return phone;
	}
	public void setPhone(int phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Date getCriated_at() {
		return criated_at;
	}
	public void setCriated_at(Date criated_at) {
		this.criated_at = criated_at;
	}
	public int getProfiles_id() {
		return profiles_id;
	}
	public void setProfiles_id(int profiles_id) {
		this.profiles_id = profiles_id;
	}
	
	@Override
	public String toString() {
		return "Client [id=" + id + ", cpf=" + cpf + ", birthday=" + birthday + ", first_name=" + first_name
				+ ", last_name=" + last_name + ", phone=" + phone + ", email=" + email + ", password=" + password
				+ ", criated_at=" + criated_at + ", profiles_id=" + profiles_id + "]";
	}
}
