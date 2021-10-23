package Knowledge.k11;

/*
时间: 2021-1-22 20:33:02
目的: 重写Object类中的toString，equals方法,以满足实际的需求。
知识点: 如果声明一个类时，没有指明继承那个类，默认继承Object类，Object类是任何类的父类。
*/

public class MyTime {
    int year, month, day;

    public MyTime() {
    }

    public MyTime(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    //重写Object中的toString方法
    public String toString() {
        return year+"年"+month+"月"+day+"日";
    }

    //重写Object中的equals方法
    public boolean equals(Object obj) {  //这里的形参obj是作为子类对象的上转型对象
           /* if (this == obj)  //obj和当前对象的引用相同，说明它们指向的是同一个对象，可以直接返回true
                return true;
            else if (obj instanceof MyTime && obj!=null) {
                MyTime t = (MyTime)obj; //将父类对象obj强制转换成想要的子类对象
                return this.year==t.year && this.month==t.month && this.day==t.day;
            }

            return false;*/

          if (obj==null || !(obj instanceof MyTime))
              return false;
          if (obj == this)
              return true;

          MyTime t = (MyTime) obj;
          return this.year==t.year && this.month==t.month && this.day==t.day;
    }
}
