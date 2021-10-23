package Knowledge.k18;

import javax.swing.*;
import java.util.Scanner;

//酒店包含房间(Hotel has Rooms)
public class Hotel {
    private Rooms[][] room;
    public  Scanner reader = new Scanner(System.in);

    public Hotel() {
        room = new Rooms[3][10]; //该酒店有3层，每层10个房间

        //为酒店创建房间
        for (int i = 0; i < room.length; i++) {
            for (int j = 0; j < room[i].length; j++) {
               if (i == 0)
                   room[i][j] = new Rooms((i+1)*100+j+1,"标准间",false);
               else if (i == 1)
                   room[i][j] = new Rooms((i+1)*100+j+1,"豪华间",false);
               else
                   room[i][j] = new Rooms((i+1)*100+j+1,"总统套房",false);
            }
        }
    }

    public Hotel(Rooms[][] room) {
        this.room = room;
    }

    public Rooms[][] getRoom() {
        return room;
    }

    public void setRoom(Rooms[][] room) {
        this.room = room;
    }

    //订房间
    public void orderRoom() {
        if (isFull(room)) {
            System.out.println("酒店房间已爆满,无法订房间!");
            return;
        }
        else {
            System.out.print("请输入房间编号:");
            while (true) {
                String number = reader.nextLine().trim();
                if (!isNumberString(number))
                    System.out.print("房间编号不能包含非数字字符,请重新输入:");
                else {
                    int num = Integer.valueOf(number);
                    if (!fun(num))
                        System.out.print("房间编号超出范围,请重新输入:");
                    else {
                        if (!isTrueOrFalse(num)) {
                            room[num/100-1][num%100-1].setStatus(true);
                            System.out.printf("订房成功!\n");
                            break;
                        }
                        else
                            System.out.print("该房间已被预定,请重新输入:");
                    }
                }
            }
        }
    }

    //退房
    public void exit() {
        if (isEmpty(room)) {
            System.out.println("酒店房间全部空闲,无法退房!");
            return;
        }
        else {
            System.out.print("请输入房间编号:");
            while (true) {
                String number = reader.nextLine().trim();
                if (!isNumberString(number))
                    System.out.print("没有该房间编号!请重新输入:");
                else {
                    int num = Integer.valueOf(number);
                    if (!fun(num))
                        System.out.print("房间编号超出范围,请重新输入:");
                    else {
                        if (isTrueOrFalse(num)) {
                            room[num/100-1][num%100-1].setStatus(false);
                            System.out.printf("退房成功!\n");
                            break;
                        }
                        else
                            System.out.print("该房间本就空闲,请重新输入:");
                    }
                }
            }
        }
    }

    //查询酒店中所有房间的状态
    public void disp() {
        for (int i = 0; i < room.length; i++) {
            for (int j = 0; j < room[i].length; j++) {
                System.out.print(room[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    //查询酒店中的空房
    public void emptyRooms() {
        for (int i = 0; i < room.length; i++) {
            for (int j = 0; j < room[i].length; j++) {
                boolean flag = room[i][j].getStatus();
                if (!flag)
                    System.out.printf("%d楼的空房有:%s ", i+1, room[i][j]);
            }
            System.out.println();
        }
        System.out.println();
    }

    /**
     * 该方法用于判断某个字符串是否是数字格式的字符
     * @param str String类型的参数，用于接收一个字符串
     * @return 返回true,说明字符串str是数字格式的字符串,返回false则不是
     */
    public boolean isNumberString(String str) {
        for (int i = 0; i < str.length(); i++) {
            char e =  str.charAt(i);
            if (!(e >='0' && e<='9'))
                return false;
        }
        return true;
    }

    /**
     * 该方法用于判断输入的房间编号是否在[101,110] 或 [201,210] 或 [301,310]的范围内
     * @param num int类型的参数，用于该类型的数据
     * @return 返回true,说明房间编号处于范围内,返回false则不处于
     */
    public boolean fun(int num) {
        if (num >= 101 && num <= 110 || num >= 201 && num <= 210
                || num >= 301 && num <= 310)
            return true;
        return false;
    }

    /**
     * 该方法用于判断酒店某个房间是否空闲
     * @param num int类型的参数，用于该类型的数据
     * @return 返回true,说明房间占用,返回false则空闲
     */
    public boolean isTrueOrFalse(int num) {
        if (room[num/100-1][num%100-1].getStatus())
            return true;
        return false;
    }

    /**
     * 该方法用于判断酒店房间是否全部空闲
     * @param rooms 这是一个Rooms[][]类型的二维数组
     * @return 返回true,酒店房间全部空闲,返回false,酒店存在被占用的房间
     */
    public boolean isEmpty(Rooms[][] rooms) {
        boolean flag = false;

        for (int i = 0; i < room.length; i++) {
            for (int j = 0; j < room[i].length; j++) {
                if (room[i][j].getStatus() == true) {
                    flag = true;
                    break;
                }
            }
            if (flag)
                return false;
        }
        return true;
    }

    /**
     * 该方法用于判断酒店房间是否爆满
     * @param rooms 这是一个Rooms[][]类型的二维数组
     * @return 返回true,酒店房间爆满,返回false,酒店存在空闲的房间
     */
    public boolean isFull(Rooms[][] rooms) {
        boolean flag = false;

        for (int i = 0; i < room.length; i++) {
            for (int j = 0; j < room[i].length; j++) {
                if (room[i][j].getStatus() == false) {
                    flag = true;
                    break;
                }
            }
            if (flag)
                return false;
        }
        return true;
    }
}





