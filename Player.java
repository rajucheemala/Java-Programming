package inheritance;

public class Player {
	private int id;
	private String name;
	private static int idGenerator = 01;
	public Player() {
		id = idGenerator++;
		
	}
	public Player(String name) {
		this();
		this.name = name;
	}
	public void setid(int id) {
		this.id = id;
	}
	public void setname(String name) {
		this.name = name;
	}
	public int getid() {
		return id;
	}
	public String getname() {
		return name;
	}
	@Override
	public String toString() {
		return "Player [id=" + id + ", name=" + name + ", toString()=" + super.toString() + "]";
	}
	

}
