package test;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;
public class DeleteLogic {
	public static int delete() throws Exception {
		
		Connection con = DriverManager.getConnection(
				"jdbc:mysql://localhost:3306/cms","root","Hp@12345"
				);
		Statement stm = con.createStatement();
		
			@SuppressWarnings("resource")
			Scanner in = new Scanner(System.in);
			System.out.println("Enter 1 to delete record from order details");
			System.out.println("Enter 2 to delete record from customer details");
			System.out.println("Enter 3 to delete record from vender details");
			System.out.println("Enter 4 to delete record from food item");
			System.out.println("Enter 5 to delete record from login table");
			System.out.println("Enter 6 to quit");
			System.out.println("Enter your choice");
			int x = in.nextInt();
			switch(x) {
			case 1:
				System.out.println("Enter order number to delete the row");
				int r1= in.nextInt();
				int i1= stm.executeUpdate("delete from odrdtl where Oid='"+r1+"'");
				System.out.println(i1+" record deleted");
				break;
			case 2:
				System.out.println("Enter customer id to delete the row");
				int r2 = in.nextInt();
				int i2= stm.executeUpdate("delete from customer where CustId='"+r2+"'");
				System.out.println(i2+" record deleted");
				break;
			case 3:
				System.out.println("Enter vender id to delete the row");
				int r3 = in.nextInt();
				int i3=stm.executeUpdate("delete from vender where Vid='"+r3+"'");
				System.out.println(i3+" record deleted");
				break;
			case 4:
				System.out.println("Enter food id to delete the row");
				int r4 = in.nextInt();
				int i4=stm.executeUpdate("delete from fdtl where Fid='"+r4+"'");
				System.out.println(i4+" record deleted");
				break;
			case 5:
				System.out.println("Enter login id to delete the row");
				int r5 = in.nextInt();
				int i5=stm.executeUpdate("delete from login where Logid='"+r5+"'");
				System.out.println(i5+" record deleted");
				break;
			case 6:
				System.exit(0);
			default:
				System.out.println("invalid input");
			}
				return 1;
	}
			
				public static void main(String[] args) throws Exception{
					DeleteLogic ld = new DeleteLogic();
					int x = ld.delete();
					System.out.println(x+" record deleted");
			
			
		
	}
	}