class Lease
{
    private String name;
    private int aptNumber;
    private double rent;
    private int term;
    private static final int FEE = 10;

    public Lease()
    {
            name = "XXX";
            aptNumber = 0;
            rent = 1000;
            term = 12;
    }

    public void setName(String tenant)
    {
            name = tenant;
    }

    public void setAptNumber(int apt)
    {
            aptNumber = apt;
    }

    public void setRent(double monthRent)
    {
            rent = monthRent;
    }

    public void setTerm(int t)
    {
            term = t;
    }



    public String getName()
    {
            return name;
    }

    public int getAptNumber()
    {
            return aptNumber;
    }

    public double getRent()
    {
            return rent;
    }

    public int getTerm()
    {
            return term;
    }



    public void addPetFee(double getRent)
    {
            double x = rent + FEE; // Learn to throw a method into another method that requires it to be used to do math
    }

    public static void explainPetPolicy()
    {
            System.out.println("A pet fee of $10 is added to the monthly rent.");
    }

}
