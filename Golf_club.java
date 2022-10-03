package org.practical;
import java.util.*;
class RegularMemeber {
	int membershipfee=0;
	int enrollmentfee=0;
	int charges=20000;
	int months;

	public RegularMemeber(int months) {
		super();
		this.months=months;
	}

		public void totalcharges() {
		// TODO Auto-generated method stub
		
	}

		public void totalcharge() {
		System.out.println("charges for regular member : ");
		System.out.println("MembershipFee : "+this.membershipfee);
		System.out.println("EnrollmentFee : "+this.enrollmentfee);
		System.out.println("Charges Per Month : Rs 20,000");
		int charges = this.months*this.charges+this.membershipfee+this.enrollmentfee;
		System.out.println("Total amount : "+charges);
	}

		public void ch() {
			// TODO Auto-generated method stub
			
		}
}


class GoldMemeber extends RegularMemeber{
	int membershipfee=90000;
	int enrollmentfee=10000;
	int charges=10000;

	public GoldMemeber(int months) {
		super(months);
	}

	@Override
	public void totalcharge() {
		System.out.println("Bill for Gold member : ");
		System.out.println("Membership Fee : "+this.membershipfee);
		System.out.println("Enrollment Fee : "+this.enrollmentfee);
		System.out.println("Charges for 6 Month : Free");
		System.out.println("after 6 months charges per month : 10000");
		if(months<=6) {
			int charges = this.membershipfee+this.enrollmentfee;
			System.out.println("Total amount : "+charges);
		}

		if(months>6)
		{    
			int charges= this.membershipfee+this.enrollmentfee+((this.months-6)*this.charges);
			System.out.println("Total amount : "+charges);
		}
	}

}
class SilverMemeber extends RegularMemeber{
	int membershipfee=15000;
	int enrollmentfee=5000;
	int charges=20000;
	public SilverMemeber(int months) {
		super(months);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void totalcharges() {
		System.out.println("Hello, : ");
		System.out.println("Bill for Silver member : ");
		System.out.println("Membership Fee : "+this.membershipfee);
		System.out.println("Enrollment Fee : "+this.enrollmentfee);
		System.out.println("Charges for 6 Month : Free");
		System.out.println("after 6 months charges per month : 20000");
		if(months<=6) {
			int charges=+this.membershipfee+this.enrollmentfee;
			System.out.println("Total amount : "+charges);
		}


		if(months>6)
		{
			int charges=this.membershipfee+this.enrollmentfee+((this.months-6)*this.charges);
			System.out.println("Total amount : "+charges);
		}
	}



}
	public class Golf_club {
	public static void main(String[] args) {
		System.out.println("Enroll your self");
		Scanner sc = new Scanner(System.in);

		System.out.println("enter the membership you want regular/gold/silver : ");
		String memebership_type=sc.nextLine();
		System.out.println("enter the number of months you want to enroll yourself : ");
		int months=sc.nextInt();

		RegularMemeber rb;

		switch (memebership_type) {

		case "regular":
			rb= new RegularMemeber(months);
			rb.ch();
			break;

		case "gold":
			rb = new GoldMemeber(months);
			rb.totalcharge();
			break;

		case "silver":
			rb = new SilverMemeber(months);
			rb.totalcharge();
			break;
		default:
			System.out.println("choose one out of regular/gold/silver");
			break;
		}
}
}