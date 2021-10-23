package Book;

public class Example5_7 {
    public static void main(String[] args) {
        int amount = 5000;

        Bank b = new Bank();
        System.out.println(b.saveMoney);

        ConstructionBank bank1 = new ConstructionBank();
        bank1.saveMoney = amount;
        bank1.year = 6;
      //  System.out.println(b.year);
        System.out.println(b.saveMoney);
       double interest1 = bank1.computerInterest();
       System.out.println(b.saveMoney);
/*
        BankOfDalian bank2 = new BankOfDalian();
        bank2.saveMoney = amount;
        bank2.year = 6;
        double interest2 = bank2.computerInterest();

        System.out.printf("两个银行利息相差%f元\n", interest1 - interest2);*/
    }
}
