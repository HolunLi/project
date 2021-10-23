package Knowledge.k81;

@tableAnnotation(tableName = "User")
public class User {
    @columnAnnotation(columnName = "userName", type = "varchar", length = 10)
    private String userName;
    @columnAnnotation(columnName = "age", type = "int", length = 10)
    private  int age;

    public User() {
    }

    public User(String userName, int age) {
        this.userName = userName;
        this.age = age;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
