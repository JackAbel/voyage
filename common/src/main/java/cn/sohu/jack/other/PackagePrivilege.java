package cn.sohu.jack.other;

/**
 * @author jinxianbao
 * @date 2019/3/10 5:25 PM
 */
class PackagePrivilege {
    void sg() {
        System.out.println("sg");
    }

    public static void main(String[] args) {
        PackagePrivilegeAccess packagePrivilegeAccess = new PackagePrivilegeAccess();
        packagePrivilegeAccess.main(new String[2]);
    }
}
