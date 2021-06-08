import java.util.ArrayList;
import java.util.List;

public class Position {
	
	private static Connect con = new Connect();
	
	private int positionID;
	private String name;
	
	public static List<Position> getAllPostions() {
		List<Position> listPosition = new ArrayList<Position>();
		
		try {
			con.rs = con.execQuery("SELECT * FROM Position");
			
			while(con.rs.next() == true) {
				Position position = new Position();
				
				position.setPositionID(con.rs.getInt("positionID"));
				position.setName(con.rs.getString("name"));
				
			}
		}
		
		catch (Exception e) {
			return null;
		}
		
		return listPosition;
	}
	
	public static Position getPosition(int positionID) {
		Position position = new Position();
		
		try {
			con.rs = con.execQuery("SELECT * FROM Employee WHERE ID = " + positionID);
			
			if(con.rs.next() == true) {
				position.setPositionID(con.rs.getInt("positionID"));
				position.setName(con.rs.getString("name"));
			}
		}
		
		catch(Exception e) {
			return null;
		}
		return position;
	}

	/**
	 * @return the positionID
	 */
	public int getPositionID() {
		return positionID;
	}

	/**
	 * @param positionID the positionID to set
	 */
	public void setPositionID(int positionID) {
		this.positionID = positionID;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	
	
}
