package simpleEntities;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Set;

import entities.User;


public class simpleUser implements Serializable {

	private static final long serialVersionUID = -3089419899284441764L;
	
	public simpleUser(User user) {
		// TODO Auto-generated constructor stub
		this.id = user.getId();
		this.username = user.getUsername();
		this.password = user.getPassword();
		this.salt = user.getSalt();
		
		this.latestLocationUpdate = user.getLatestLocationUpdate();
		this.lattitude = user.getLattitude();
		this.longitude = user.getLongitude();
		
		this.hostedAppointments = user.getHostedAppointments().keySet();
		//this.visitingAppointments = user.getVisitingAppointments().keySet();
		this.friends = user.getFriends().keySet();

		//this.outChatmessages = user.getOutChatmessages().keySet();
		//this.inChatmessages = user.getInChatmessages().keySet();
}

	private int id;

	private String username;
	private String password;
	private String salt;

	private Timestamp latestLocationUpdate;
	private double lattitude;
	private double longitude;

	Set<Integer> friends;

	Set<Integer> hostedAppointments;	
	Set<Integer> visitingAppointments;

	Set<Integer> outChatmessages;
	Set<Integer> inChatmessages;

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getSalt() {
		return salt;
	}
	public void setSalt(String salt) {
		this.salt = salt;
	}
	public Timestamp getLatestLocationUpdate() {
		return latestLocationUpdate;
	}
	public void setLatestLocationUpdate(Timestamp latestLocationUpdate) {
		this.latestLocationUpdate = latestLocationUpdate;
	}
	public double getLattitude() {
		return lattitude;
	}
	public void setLattitude(double lattitude) {
		this.lattitude = lattitude;
	}
	public double getLongitude() {
		return longitude;
	}
	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}
	public Set<Integer> getFriends() {
		return friends;
	}
	public void setFriends(Set<Integer> friends) {
		this.friends = friends;
	}
	public Set<Integer> getHostedAppointments() {
		return hostedAppointments;
	}
	public void setHostedAppointments(Set<Integer> hostedAppointments) {
		this.hostedAppointments = hostedAppointments;
	}
	public Set<Integer> getVisitingAppointments() {
		return visitingAppointments;
	}
	public void setVisitingAppointments(Set<Integer> visitingAppointments) {
		this.visitingAppointments = visitingAppointments;
	}
	public Set<Integer> getOutChatmessages() {
		return outChatmessages;
	}
	public void setOutChatmessages(Set<Integer> outChatmessages) {
		this.outChatmessages = outChatmessages;
	}
	public Set<Integer> getInChatmessages() {
		return inChatmessages;
	}
	public void setInChatmessages(Set<Integer> inChatmessages) {
		this.inChatmessages = inChatmessages;
	}
	
}