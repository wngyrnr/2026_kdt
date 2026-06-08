package worldcup;

import java.util.Objects;

public class Player {
	
	private String name;
	private String position;
	private int backnumber;
	
	public Player() {
		super();
	}
	
	public Player(String name, String position, int backnumber) {
		super();
		this.name = name;
		this.position = position;
		this.backnumber = backnumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public int getBacknumber() {
		return backnumber;
	}

	public void setBacknumber(int backnumber) {
		this.backnumber = backnumber;
	}

	@Override
	public int hashCode() {
		return Objects.hash(backnumber, name, position);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Player other = (Player) obj;
		return backnumber == other.backnumber && Objects.equals(name, other.name)
				&& Objects.equals(position, other.position);
	}

	@Override
	public String toString() {
		return "[이름 =" + name + ", 포지션 = " + position + ", 등번호 = " + backnumber + "]";
	}
	
	
	

}
