package Knowledge.k18;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Hotel h1 = new Hotel();
        Scanner reader = new Scanner(System.in);

        System.out.println("==============================");
        System.out.printf("%17s\n", "欢迎进入酒店管理系统");
        System.out.println("==============================");
        System.out.printf("请仔细阅读以下功能:\n[1]查询所有房间状态\n[2]查询空房\n[3]订房\n[4]退房\n[5]退出系统\n");

        System.out.print("\n请输入功能编号:");
        while(true) {
            int number = reader.nextInt();

            if (number == 1)
                h1.disp();
            else if (number == 2)
                h1.emptyRooms();
            else if (number == 3)
                h1.orderRoom();
            else if (number == 4)
                h1.exit();
            else if (number == 5) {
                System.out.println("欢迎下次再来!");
                break;
            }
            else
            {
                System.out.print("功能编号有误，请重新输入:");
                continue;
            }

            boolean flag = false;
            System.out.print("请输入是否继续(Y/N):");
            while (true) {
                char c = reader.next().charAt(0);
                if (c=='Y' || c=='y' || c == 'N' || c=='n') {
                    if (c == 'Y' || c == 'y') {
                        System.out.print("请输入功能编号:");
                        break;
                    }
                    else {
                        flag = true;
                        break;
                    }
                }
                else
                    System.out.print("输入有误,请重新输入:");
            }
            if (flag)
                break;
        }
    }
}