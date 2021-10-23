package Knowledge.k30;

/*
时间: 2021-2-3 12:19:34
知识点: 枚举类用法一:使用枚举值,枚举值为常量
*/

//Result是一个枚举类型
enum Result {
    SUCCESS, FAIL;  //这里定义了2个枚举值，都为常量
}

public class Test {
    public static void main(String[] args) {
        Result r = divide(10, 0);
        System.out.println(r == Result.SUCCESS? "计算成功":"计算失败"); //输出:计算失败
    }

    /**
     * 该方法用于判断是否成功计算出两个int类型数据的商
     * @param x int类型数据
     * @param y int类型数据
     * @return 返回Result.SUCCESS表示成功，返回Result.FAIL表示失败
     */
    public static Result divide(int x, int y) {
        try {
            int z = x / y;
            return Result.SUCCESS;
        }
        catch (Exception e) {
            return Result.FAIL;
        }
    }
}

