package CMS;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;
public class cmsSelect {
	public static void main(String[] args) throws SQLException {
		
		Connection con = DriverManager.getConnection(
				"jdbc:mysql://localhost:3306/cms","root","Hp@12345"
				);
		Statement stm = con.createStatement();
		
		while(true) { 
			System.out.println("");
			System.out.println("Enter 1 to show data from customer table");
			System.out.println("Enter 2 to show data from vendor table");
			System.out.println("Enter 3 to show data from order details table");
			System.out.println("Enter 4 to show data from food item table");
			System.out.println("Enter 5 to show data from login table");
			System.out.println("Enter 6 to quit");
			Scanner in = new Scanner(System.in);
			int x = in.nextInt(); 

				switch(x) {
				case 1:
						System.out.println("");
						System.out.println("Showing Customer Table");
						System.out.println("==============================================================================");
						System.out.println("Cust_Id|| Cust_Name ||  Phn_No||     Email   ||  Coopen || Wallet  ");
						System.out.println("========================================================");
						ResultSet rs = stm.executeQuery("select * from customer");
						System.out.println("");
						while(rs.next()) { 
							System.out.println(rs.getInt(1)+"  |  "+rs.getString(2)+"  |  "+rs.getString(3)+" | "+rs.getString(4)+" | "+rs.getString(5)+" | "+rs.getFloat(6));
						}
						break; 
				case 2:
					System.out.println("");
					System.out.println("Showing Vendor Table");
					System.out.println("=======================================================");
					System.out.println("Ven_id|| VENDER NAME||  PHONE NUM  || SPEC");
					System.out.println("================================================");
					ResultSet rs1 = stm.executeQuery("select * from vender");
					System.out.println("");
					while(rs1.next()) {
						System.out.println(rs1.getInt(1)+" | "+rs1.getString(2)+" | "+rs1.getInt(3)+" | "+rs1.getString(4));
					}
					break;
				case 3:
					System.out.println("");
					System.out.println("Showing order details Table");
					System.out.println("========================================================");
					System.out.println("O_ID || VEN_ID || CUSTID|| FID || QTY || DATE || VALUE  || STATUS ");
					System.out.println("========================================================");
					ResultSet rs2 = stm.executeQuery("select * from odrdtl");
					System.out.println("");
					while(rs2.next()) {
					}
					break;
				case 4:
					System.out.println("");
					System.out.println("Showing fdtl Table");
					System.out.println("========================================================");
					System.out.println("FID  || ITEM  || PRIZE");
					System.out.println("========================================================");
					ResultSet rs3 = stm.executeQuery("select * from fdtl");
					System.out.println("");
					while(rs3.next()) {
						System.out.println(rs3.getInt(1)+" | "+rs3.getString(2)+" | "+rs3.getInt(3)+"/-");
					}
					break;
				case 5:
					System.out.println("");
					System.out.println("Showing Login Table");
					System.out.println("========================================================");
					System.out.println("LOGid || PASSWARD ");
					System.out.println("====================");
					ResultSet rs4 = stm.executeQuery("select * from login");
					System.out.println("");
					while(rs4.next()) {
						System.out.println(rs4.getInt(1)+" | "+rs4.getString(2));
					}
					break;
				case 6:
					System.exit(0);
				default:
					System.out.println("invalid input");
				}
			}
		}
		}