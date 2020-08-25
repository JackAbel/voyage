package cn.sohu.jack.thinking.java.chapeter20annotation;

/**
 * @description:
 * @author: Xiangbao Jin
 * @since 2019/8/4 4:06 PM
 */
@DBTable(name = "MEMBER")
public class Member {
    @SQLString(30) String firstName;
    @SQLString(50) String lastName;
    @SQLInteger Integer age;
    @SQLString(value = 20, constraint = @Constraints(primaryKey = true)) String handle;
    static int memberCount;
    public String getHandle() {
        return handle;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String toString() {
        return handle;
    }

    public Integer getAge() {
        return age;
    }
}
