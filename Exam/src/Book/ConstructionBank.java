package Book;

public class ConstructionBank extends Bank{
    int year;

    public double computerInterest()
    {
       // super.year = (int)year;
        super.computerInterest();
        double remainNumber = year - year;
        int day = (int)(remainNumber * 1000);
       // interest = super.computerInterest() + day * 0.0001 * saveMoney;
       // System.out.printf("%d元存在建设银行%d年零%d天的利息:%f元\n",saveMoney, super.year, day, interest);
        return interest;
    }
}
