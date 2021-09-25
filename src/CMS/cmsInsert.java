package CMS;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;
public class cmsInsert {
	public static void main(String[] args) throws SQLException {
		
		Connection con = DriverManager.getConnection(
				"jdbc:mysql://localhost:3306/cms","root","Hp@12345"
				);
		Statement smt = con.createStatement();
		
		while(true) {  
			
			System.out.println("Enter 1 to insert into Customer table");
			System.out.println("Enter 2 to insert into Login table");
			System.out.println("Enter 3 to insert into Food item table");
			System.out.println("Enter 4 to insert into Vender table");
			System.out.println("Enter 5 to insert into Order details table");
			System.out.println("Enter 6 to quit");
			Scanner s = new Scanner(System.in);
			int x= s.nextInt();
			switch(x) { 
			case 1 : 
				
			System.out.println("Customer Id : "); 
			int cid = s.nextInt();
				System.out.println("Customer Name : ");
				String cnm = s.next();
				System.out.println("Customer Contact No : ");
				int cn = s.nextInt();
				System.out.println("Customer Email Adress : ");
				String eml = s.next();
				System.out.println("Coopen Code : ");
				String cpn = s.next();
				System.out.println("Wallet Balance : ");
				float wb = s.nextFloat();
			
				int i1;
				i1= smt.executeUpdate("insert into customer values ('"+cid+"','"+cnm+"','"+cn+"','"+eml+"','"+cpn+"','"+wb+"')");
				System.out.println(i1+"  record inserted");
				break;
			case 2:
				System.out.println("login ID : ");
				int lid = s.nextInt();
				System.out.println("password : ");
				String pass= s.next();
				int i2;
				
				i2 = smt.executeUpdate("insert into login values('"+lid+"','"+pass+"')");
				System.out.println(i2+" record inserted");
				break;
			case 3:
				System.out.println("Food ID : ");
				int fid = s.nextInt();
				System.out.println("Food name: ");
				String fname = s.next(); 
				System.out.println("Food price : ");
				float fprice = s.nextFloat();
				int i3;
				
				i3=smt.executeUpdate("insert into fdtl values('"+fid+"','"+fname+"','"+fprice+"')");
				System.out.println(i3+" record inserted");
				break;
			
			case 4:
				System.out.println("vender id :");
				int vid = s.nextInt();
				System.out.println("vender Name : ");
				String vname = s.next();
				System.out.println("Enter vender phone");
				int vphone = s.nextInt();
				System.out.println("vender specs");
				String vspec = s.next();
				int i4;
				
				i4=smt.executeUpdate("insert into vender values('"+vid+"','"+vname+"','"+vphone+"','"+vspec+"')");
				System.out.println(i4+" record inserted");
				break;
			case 5:
				System.out.println("Order number : ");
				int ordno=s.nextInt();
				System.out.println("vender id : ");
				int ovid = s.nextInt();
				System.out.println("Customer id : ");
				int ocid = s.nextInt();
				System.out.println("Food id : ");
				int ofid = s.nextInt();
				System.out.println("Quantity : ");
				int qty = s.nextInt();
				System.out.println("Order date & time");
				String dt= s.next();
				System.out.println("Order value incl gst : ");
				int ordval= s.nextInt();
				System.out.println("Status of the order : ");
				String ordst=s.next();
				int i5;
				i5=smt.executeUpdate("insert into odrdtl values('"+ordno+"','"+ovid+"','"+ocid+"','"+ofid+"','"+qty+"','"+dt+"','"+ordval+"','"+ordst+"')");
				System.out.println(i5+" Record Inserted");
				break;
			case 6:
				System.exit(0);
			}
			
		}
	}

}
