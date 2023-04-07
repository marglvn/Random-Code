import java.util.Scanner;

class TestLease
{
   //Scanner input = new Scanner(System.in);

   public static void main (String args[])
   {
     	Lease tenant1 = new Lease();
     	Lease tenant2 = new Lease();
     	Lease tenant3 = new Lease();
     	Lease tenant4 = new Lease();

     	getData(tenant1);
     	/* tenant2.getData();
     	tenant3.getData(); */
	
	showValues(tenant1);
   }
   public static void showValues(Lease ls)
   {
      System.out.println("\n\nYour lease results:" +
         "\nName      : " + ls.getName() +
         "\nApartment : " + ls.getAptNumber() +
         "\nRent      : " + ls.getRent() +
         "\nTerm      : " + ls.getTerm());
   }
   public static Lease getData(Lease tenant)
   {
      Scanner input = new Scanner(System.in);

      System.out.print("Enter leasee name >> ");
      String w = input.nextLine();

      System.out.print("Enter apartment number >> ");
      int x = input.nextInt();

      System.out.print("Enter rent >> ");
      double y = input.nextDouble();

      System.out.print("Enter lease term in months >> ");
      int z = input.nextInt();

	   tenant.setName(w);
	   tenant.setAptNumber(x);
	   tenant.setRent(y);
	   tenant.setTerm(z);
	
	   return tenant;
   }
}


