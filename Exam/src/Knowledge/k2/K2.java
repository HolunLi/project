package Knowledge.k2;

/*
2020-11-18 19:46:47
使用String 类中的常用方法
 */

public class K2 {
    public static void main(String[] args) {
        String s1  = new String("I am Student!");
        System.out.println(s1); //输出 I am Student!

        //用一个字符数组创建一个字符串对象
        char a[] = {'I',' ','a','m',' ','t','e','a','c','h','e','r','!'};
        s1 = new String(a);
        System.out.println(s1);  //输出 I am teacher!
        s1 = new String(a, 2, 11);
        System.out.println(s1);  //输出 am teacher!

        //返回字符串的长度
        String s2 = "Hello!";
        System.out.println(s2.length()); //长度为6
        System.out.println("李豪伦".length()); //长度为3,注意字符串常量实际上就是一个字符串类型的对象
                                              //可以将对字符常量的引用赋予字符串类型的对象变量
        String a1 = "How are you";
        String a2 = "How are you";   //a1和a2都是字符串类型的对象变量，它们的引用相同,即引用的是同一个字符串

        //比较两个字符串是否相同(public boolean equals(String s), 返回真，或返回假)
        if (a1.equals(a2))
            System.out.println("字符串:" + a1 + "与字符串:" + a2 + "相同");
        else
            System.out.println("字符串:" + a1 + "与字符串:" + a2 + "不相同");

        //判断一个字符串是否包含另一个字符串,即一个字符串是否是另一个字符串的子串(public boolean contains(String s), 返回真，或返回假)
        String s3 = "Happy!";
        String s4 = "Hap";
        if (s3.contains(s4))
            System.out.println("字符串s3包含字符串s4!");
        else
            System.out.println("字符串s3不包含字符串s4!");

        /*判断一个字符串的前缀或后缀是否是某个指定的字符串
          (public boolean startsWith/endsWith(String s), 返回真，或返回假)*/
        String s5 = "abcdefgh", s6 = "abc", s7 = "cde";
        if (s5.startsWith(s6)) //(s5.endssWith(s6)) 同理
            System.out.printf("%s的前缀是%s\n", s5, s6);
        else
            System.out.printf("%s的前缀不是%s\n", s5, s6);

        //比较两个字符串的大小(public int compareTo(String s),返回0,大于0的值，或小于0的值)
        if (s5.compareTo(s6) > 0)
            System.out.printf("字符串s5大于字符串s6!\n");
        else if (s5.compareTo(s6) < 0)
            System.out.printf("字符串s5小于字符串s6!\n");
        else
            System.out.printf("字符串s5等于字符串s6!\n");

        /*返回一个字符串或单个字符在另一个字符串中首次出现的位置(public indexOf(String s))
          public indexOf(String s, int x) 返回一个字符串或单个字符在另一个字符串下标为x的字符开始，首次出现的位置*/
        String s8 = "It is been a long time!", s9 = "long";
        int x1 = s8.indexOf(s9); //返回字符串s9首次在字符串s8中出现的位置(下标)
        System.out.printf("字符串%s首次在字符串%s中出现的位置为%d\n", s9, s8, x1);  //返回13
        x1 = s8.indexOf('e'); //返回字符e首次在字符串s8中出现的位置(下标)
        System.out.printf("字符%c首次在字符串%s中出现的位置为%d\n", 'c', s8, x1);  //返回7
        x1 = s8.indexOf('e', 9); //从字符串s8的下标为9的字符开始，返回字符e首次在字符串s8中出现的位置(下标)
        System.out.printf("从字符串s8的下标为9的字符开始，字符%c首次在字符串%s中出现的位置为%d\n", 'e', s8, x1); //返回21

        //获取一个字符串的子串，实际上就是截取字符串(这个子串是从该字符串中截取出来的)
        String s10 = "increable", s11;
        s11 = s10.substring(2);  //从下标为2开始截取该字符串的子串
        System.out.println(s11);  //输出 creable
        s11 = s10.substring(5, 9); //截取字符串s10，从下标为5的字符开始截取，截取到下标为9的字符结束(不包括9)
        System.out.println(s11);  //输出 able

        //删除字符串前后的空格(public String trim())
        String s12 = "  How are you! ";
        System.out.printf("删除字符串s12前后的空格后:%s\n", s12.trim());
    }
}
