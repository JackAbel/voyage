package cn.sohu.jack.thinking.java.chapter6;

import cn.sohu.jack.other.PackagePrivilegeAccess;

/**
 * @author jinxianbao
 * @date 2019/3/10 5:26 PM
 */
public class PackageAccessPrivilegeTest {
    // 无法引入 PackagePrivilege 因为它指定的是包访问权限
    // 包访问权限在包内是互通的，但对于包外却是 private
    public static void main(String[] args) {
        PackagePrivilegeAccess packagePrivilegeAccess = new PackagePrivilegeAccess();
        // protected 方法有包和继承访问权限，但不是public
        // packagePrivilegeAccess.main(new String[2]);
    }
}
