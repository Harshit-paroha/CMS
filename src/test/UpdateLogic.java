package test;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
public class UpdateLogic {
	public static int update() throws SQLException {
		
		Connection con = DriverManager.getConnection(
				"jdbc:mysql://localhost:3306/cms","root","Hp@12345"
				);
		Statement stm = con.createStatement();
		
		
			System.out.println("");
			System.out.println("Showing Tables to update");
			System.out.println("=================================");
			System.out.println("Enter 1 to update customer table");
			System.out.println("Enter 2 to update vender table");
			System.out.println("Enter 3 to update food item table");
			System.out.println("Enter 4 to update login table");
			System.out.println("Enter 5 to update order details table");
			System.out.println("Enter 6 to quit");
			System.out.println("enter your choice:");
			Scanner in = new Scanner(System.in);
			int x = in.nextInt();
			switch(x) {
			case 1:
				System.out.println("");
				System.out.println("Showing Attributes of customer table to update");
				System.out.println("===============================================");
				System.out.println("Enter 1 to update customer id");
				System.out.println("Enter 2 to update customer name");
				System.out.println("Enter 3 to update customer phone");
				System.out.println("Enter 4 to update customer email");
				System.out.println("Enter 5 to update customer cupon");
				System.out.println("Enter 6 to update customer wallet balance");
				System.out.println("Enter 7 to terminate the program");
				System.out.println("Enter your choice");
				int x1 = in.nextInt();
				switch(x1) {
				case 1:
					System.out.println("enter customer id to update");
					int cid1 = in.nextInt();
					System.out.println("enter new id");
					int cid2 = in.nextInt();
					int c1=stm.executeUpdate("update customer set CustID='"+cid2+"' where CustName='"+cid1+"'");
					System.out.println(c1+" rows updated");
					break;
				case 2:
					System.out.println("enter customer id where you want to change your name");
					int cid3=in.nextInt();
					System.out.println("Enter new Name");
					String cname1=in.next();
					int c2= stm.executeUpdate("update customer set CustName='"+cname1+"' where CustID='"+cid3+"'");
					System.out.println(c2+" record updated");
					break;
				case 3:
					System.out.println("enter customer id where you want to change your phone");
					int cid4=in.nextInt();
					System.out.println("Enter new phone");
					int cphone=in.nextInt();
					int c3= stm.executeUpdate("update customer set CoNo='"+cphone+"' where CustID='"+cid4+"'");
					System.out.println(c3+" record updated");
					break;
				case 4:
					System.out.println("enter customer id where you want to change your email");
					int cid5=in.nextInt();
					System.out.println("Enter new email");
					String cemail=in.next();
					int c4= stm.executeUpdate("update customer set CEmail='"+cemail+"' where CustID='"+cid5+"'");
					System.out.println(c4+" record updated");
					break;
				case 5:
					System.out.println("enter customer id where you want to change your coopen");
					int cid6=in.nextInt();
					System.out.println("Enter new coupon");
					String cupon1=in.next();
					int c5= stm.executeUpdate("update customer set Coopen='"+cupon1+"' where CustID='"+cid6+"'");
					System.out.println(c5+" record updated");
					break;
				case 6:
					System.out.println("enter customer id where you want to change your wallet balance");
					int cid7=in.nextInt();
					System.out.println("Enter updated wallet balance");
					float cbal=in.nextFloat();
					int c6= stm.executeUpdate("update customer set Wallet='"+cbal+"' where CustID='"+cid7+"'");
					System.out.println(c6+" record updated");
					break;
				case 7:
					System.exit(0);
				default:
					System.out.println("Invalid input");
				}
				break;
			case 2:
				System.out.println("");
				System.out.println("Showing Attributes of vender table to update");
				System.out.println("==============================================");
				System.out.println("Enter 1 to update vender id");
				System.out.println("Enter 2 to update  vender name");
				System.out.println("Enter 3 to update vender phone");
				System.out.println("Enter 4 to update vender specs");
				System.out.println("enter your choice");
				int x2 = in.nextInt();
				switch(x2) {
				case 1:
					System.out.println("enter vender id to update");
					int vid1 = in.nextInt();
					System.out.println("enter new id");
					int vid2 = in.nextInt();
					int c1=stm.executeUpdate("update vender set Vid='"+vid1+"' where Vid='"+vid2+"'");
					System.out.println(c1+" rows updated");
					break;
				case 2:
					System.out.println("enter vender id where you want to change vender name");
					int vid3=in.nextInt();
					System.out.println("Enter new Name");
					String cname1=in.next();
					int c2= stm.executeUpdate("update vender set Vname='"+cname1+"' where Vid='"+vid3+"'");
					System.out.println(c2+" record updated");
					break;
				case 3:
					System.out.println("enter vender id where you want to change vender phone");
					int vid4=in.nextInt();
					System.out.println("Enter new phone");
					int vphone=in.nextInt();
					int c3= stm.executeUpdate("update vender set Vphn='"+vphone+"' where Vid='"+vid4+"'");
					System.out.println(c3+" record updated");
					break;
				case 4:
					System.out.println("enter vender id where you want to change vender specs");
					int vid5=in.nextInt();
					System.out.println("Enter new vender specs");
					String vspecs=in.next();
					int c4= stm.executeUpdate("update vender set Vspec='"+vspecs+"' where Vid='"+vid5+"'");
					System.out.println(c4+" record updated");
					break;
				case 5:
					System.exit(0);
				default:
					System.out.println("invalid input");	
				}
				break;
			case 3: 
				System.out.println("");
				System.out.println("Showing Attributes of food Item table to update");
				System.out.println("==============================================");
				System.out.println("Enter 1 to update food id");
				System.out.println("Enter 2 to update food name");
				System.out.println("Enter 3 to update food price");
				System.out.println("Enter 4 to exit");
				System.out.println("enter options:");
				int x3 = in.nextInt();
				switch(x3) {
				case 1:
					System.out.println("enter food id to update");
					int fid1 = in.nextInt();
					System.out.println("enter updated food id");
					int fid2 = in.nextInt();
					int c1=stm.executeUpdate("update fdtl set Fid='"+fid2+"' where Fid='"+fid1+"'");
					System.out.println(c1+" rows updated");
					break;
				case 2:
					System.out.println("enter food id where you want to change food name");
					int fid3=in.nextInt();
					System.out.println("Enter updated Name");
					String fname1=in.next();
					int c2= stm.executeUpdate("update fdtl set Fname='"+fname1+"' where Fid='"+fid3+"'");
					System.out.println(c2+" record updated");
					break;
				case 3:
					System.out.println("enter food id where you want to change food price");
					int fid4=in.nextInt();
					System.out.println("Enter updated price");
					int fprice=in.nextInt();
					int c3= stm.executeUpdate("update fdtl set Prize='"+fprice+"' where Fid='"+fid4+"'");
					System.out.println(c3+" record updated");
					break;
				case 4:
					System.exit(0);
				default:
					System.out.println("invalid input");	
				}
				break;
			case 4:
				System.out.println("");
				System.out.println("Showing Attributes of login table to update");
				System.out.println("==============================================");
				System.out.println("Enter 1 to update login id");
				System.out.println("Enter 2 to update password");
				System.out.println("Enter 3 to exit");
				System.out.println("enter options:");
				int x4 = in.nextInt();
				switch(x4) {
				case 1:
					System.out.println("enter login id to update");
					int lid1 = in.nextInt();
					System.out.println("enter new login id");
					int lid2 = in.nextInt();
					int c1=stm.executeUpdate("update login set LogId='"+lid2+"' where LogId='"+lid1+"'");
					System.out.println(c1+" rows updated");
					break;
				case 2:
					System.out.println("enter login id where you want to change password");
					int lid3=in.nextInt();
					System.out.println("Enter new password");
					String lpass=in.next();
					int c2= stm.executeUpdate("update login set pswd='"+lpass+"' where LogId='"+lid3+"'");
					System.out.println(c2+" record updated");
					break;
				case 3:
					System.exit(0);
				default:
					System.out.println("invalid input");	
				}
				break;
			case 5:
				System.out.println("");
				System.out.println("Showing Attributes of order details table to update");
				System.out.println("===============================================");
				System.out.println("Enter 1 to update order no");
				System.out.println("Enter 2 to update vender ID");
				System.out.println("Enter 3 to update customer ID");
				System.out.println("Enter 4 to update Food ID");
				System.out.println("Enter 5 to update Quantity");
				System.out.println("Enter 6 to update order date & time");
				System.out.println("Enter 7 to update the order value");
				System.out.println("Enter 8 to update order status");
				System.out.println("Enter 9 to exit");
				int x5 = in.nextInt();
				switch(x5) {
				case 1:
					System.out.println("enter order number to update");
					int ordid = in.nextInt();
					System.out.println("enter new order number");
					int ordid1 = in.nextInt();
					int c1=stm.executeUpdate("update odrdtl set Oid='"+ordid1+"' where Oid='"+ordid+"'");
					System.out.println(c1+" rows updated");
					break;
				case 2:
					System.out.println("enter order number where you want to change vender ID");
					int vid1=in.nextInt();
					System.out.println("Enter new vender ID");
					int vid2=in.nextInt();
					int c2= stm.executeUpdate("update odrdtl set VenId='"+vid2+"' where Oid='"+vid1+"'");
					System.out.println(c2+" record updated");
					break;
				case 3:
					System.out.println("enter order number where you want to change your customer ID");
					int cid4=in.nextInt();
					System.out.println("Enter new customer ID");
					int cid5=in.nextInt();
					int c3= stm.executeUpdate("update odrdtl set CustId='"+cid5+"' where Oid='"+cid4+"'");
					System.out.println(c3+" record updated");
					break;
				case 4:
					System.out.println("enter order number where you want to change your food ID");
					int ord5=in.nextInt();
					System.out.println("Enter new food ID");
					int ofid=in.nextInt();
					int c4= stm.executeUpdate("update odrdtl set FoodId='"+ofid+"' where Oid='"+ord5+"'");
					System.out.println(c4+" record updated");
					break;
				case 5:
					System.out.println("enter order number where you want to change the quantity");
					int ord6=in.nextInt();
					System.out.println("Enter new quantity");
					int qty6=in.nextInt();
					int c5= stm.executeUpdate("update odrdtl set qty='"+qty6+"' where Oid='"+ord6+"'");
					System.out.println(c5+" record updated");
					break;
				case 6:
					System.out.println("enter order number where you want to change your date & time");
					int ord7=in.nextInt();
					System.out.println("Enter new date");
					String ordd=in.next();
					int c6= stm.executeUpdate("update odrdtl set odrDate='"+ordd+"' where Oid='"+ord7+"'");
					System.out.println(c6+" record updated");
					break;
				case 7:
					System.out.println("enter order number where you want to change order value");
					int ord8=in.nextInt();
					System.out.println("Enter new order value");
					float ordv=in.nextFloat();
					int c7= stm.executeUpdate("update odrdtl set Value='"+ordv+"' where Oid='"+ord8+"'");
					System.out.println(c7+" record updated");
					break;
				case 8:
					System.out.println("enter order number where you want to change your order status");
					int ord9=in.nextInt();
					System.out.println("Enter new order status");
					String ords=in.next();
					int c8= stm.executeUpdate("update odrdtl set Status='"+ords+"' where Oid='"+ord9+"'");
					System.out.println(c8+" record updated");
					break;
				case 9:
					System.exit(0);
				default:
					System.out.println("Invalid input");
				}
				break;
			case 6:
				System.exit(0);
			default:
				System.out.println("invalid input");
			}
			return 1;
		}
	public static void main(String[] args) throws Exception{
		UpdateLogic ld = new UpdateLogic();
		int x = ld.update();
		System.out.println(x+" record Updated");
}

}

		
		