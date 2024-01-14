package datenBank;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class DatenBank {
    String url = "jdbc:mysql://localhost:3306/demo?useUnicode=true&characterEncoding=utf8";
    private String user = "root";
    private String pass = "";
    private static Connection con = null;
    private static Statement statement = null;
    private String vorName;
    private String name;
    private String email;
    private int id;
    Scanner scanner=new Scanner(System.in);
    
	private PreparedStatement preparedStatement;
    public DatenBank() {
        try {
            // Load the JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Establish connection
            con = DriverManager.getConnection(this.url, this.user, this.pass);
            System.out.println("Verbindung erfolgreich hergestellt");

        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }
    
    public void commitAndRollback(int zahl) {
        try {
            con.setAutoCommit(false);
            String deleteQuery = "DELETE FROM arbeiter WHERE id = '"+zahl+"'";
            String updateQuery = "UPDATE arbeiter SET email = 'oezdemirmustafa@gmail.com' WHERE id ='"+zahl+"'";

            System.out.println("Zugriff auf Arbeitern");
            arbeiterZugriff();

            try (Statement statement = con.createStatement()) {
                //statement.executeUpdate(deleteQuery);
                statement.executeUpdate(updateQuery);

                System.out.println("Aktualisieren (yes/no)");
                String antwort = scanner.nextLine();

                if (antwort.equals("yes")) {
                    con.commit();
                    arbeiterZugriff();
                    System.out.println("Datenbank aktualisiert");
                } else {
                    con.rollback();
                    System.out.println("Aktualisierung abgesagt");
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    
    public void preparedArbeiterZugriff(int id) {
        try {
            String such = "SELECT * FROM arbeiter WHERE vorname LIKE ? AND id >= ?";
            preparedStatement = con.prepareStatement(such);
            preparedStatement.setString(1, "M%");
            preparedStatement.setInt(2, id);

            ResultSet rs = preparedStatement.executeQuery();

            while (rs.next()) {
                this.id = rs.getInt("id");
                this.vorName = rs.getString("vorname");
                this.name = rs.getString("name");
                this.email = rs.getString("email");
                System.out.println("id: \t" + id + " Vorname: " + vorName + " Nachname: " + name + " email: " + email);
            }
            System.out.println("\n");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    
    public void arbeiterDel(int fromId, int toId) {
    	
    	try {
			statement =con.createStatement();
			String such="Delete from arbeiter where id>'"+fromId+"' AND id<='"+toId+"'";
            statement.executeUpdate(such);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }

    public void arbeiterAdd(int id, String vorname, String name, String email) {
        try {
            con.setAutoCommit(false);
            String arbeiterAdd = "INSERT INTO arbeiter(id, vorname, name, email) VALUES (?, ?, ?, ?)";
            try (PreparedStatement preparedStatement = con.prepareStatement(arbeiterAdd)) {
                preparedStatement.setInt(1, id);
                preparedStatement.setString(2, vorname);
                preparedStatement.setString(3, name);
                preparedStatement.setString(4, email);

                int rowsAffected = preparedStatement.executeUpdate();

                if (rowsAffected == 0) {
                    // No rows were affected, indicating a potential conflict
                    con.rollback();
                    System.out.println("Konflikt: Die Ressource wurde während der Bearbeitung geändert.");
                } else {
                    // Commit the transaction
                    con.commit();
                    System.out.println("Datenbank aktualisiert");
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                con.setAutoCommit(true);
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
    
    
    
    public void arbeterUpdate(int id,String vorname,String name,String email) {
        try {
            String update = "UPDATE arbeiter SET vorname = ?, name = ?, email = ? WHERE id = ?";         
            try (PreparedStatement preparedStatement = con.prepareStatement(update)) {
                preparedStatement.setString(1, vorname);
                preparedStatement.setString(2, name);
                preparedStatement.setString(3, email);
                preparedStatement.setInt(4, id);

                preparedStatement.executeUpdate();
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


    public void arbeiterZugriff() {
        String such = "SELECT * FROM arbeiter where id>= ?";
        try {
            try (PreparedStatement preparedStatement = con.prepareStatement(such)) {
                preparedStatement.setInt(1, id);
                try (ResultSet rs = preparedStatement.executeQuery()) {
                    while (rs.next()) {
                        id = rs.getInt("id");
                        this.vorName = rs.getString("vorname");
                        this.name = rs.getString("name");
                        this.email = rs.getString("email");
                        System.out.println("id: \t" + id + " Vorname: " + vorName + " Nachname: " + name + " email: " + email);
                    }
                   
                }
            }
          
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

   
}
