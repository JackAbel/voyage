package cn.sohu.jack.other;

/**
 * @author jinxianbao
 * @date 2019/3/10 5:33 PM
 */
public class PackagePrivilegeAccess {
    static PackagePrivilege packagePrivilege = new PackagePrivilege();

    protected static void main(String[] args) {
        // sg 为私有方法时不能访问
        packagePrivilege.sg();
    }
}
