package CoreJava;

import java.time.DayOfWeek;
import java.time.LocalDate;

/*
利用LocalDate 类编写一个日历程序
*/
public class CalendarTest {
    public static void main(String[] args)
    {
        //LocalDate date = LocalDate.of(2020, 12, 1);  //构造一个表示指定日期的对象
        LocalDate date = LocalDate.now();  //构造一个表示当前日期的对象
        int month = date.getMonthValue();  //记录当前日期的月份
        int today = date.getDayOfMonth();  //记录当前日期的天数

        date = date.minusDays(today - 1);  //将date重新设置为这个月第一天的日期
        DayOfWeek week = date.getDayOfWeek();
        int value = week.getValue();

        System.out.println("Mon Tue Wed Thu Fri Sat Sun");
        for (int i = 1; i<value; i++)
            System.out.print("    ");
        while (date.getMonthValue() == month)
        {
            System.out.printf("%3d", date.getDayOfMonth());
            if (date.getDayOfMonth() == today)
                System.out.print("*");
            else
                System.out.print(" ");
            date = date.plusDays(1);
            if (date.getDayOfWeek().getValue() == 1)
                System.out.println();
        }
        if (date.getDayOfWeek().getValue() != 1)
            System.out.println();
    }
}
