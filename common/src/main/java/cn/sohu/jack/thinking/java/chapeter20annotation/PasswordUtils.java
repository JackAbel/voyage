package cn.sohu.jack.thinking.java.chapeter20annotation;

import java.util.List;
import java.util.ListIterator;

/**
 * @description:
 * @author: Xiangbao Jin
 * @since 2019/8/4 11:54 AM
 */
public class PasswordUtils {
    @UseCase(id=47, description = "Passwords must contain one numeric!")
    public boolean validatePassword(String password) {
        return password.matches("\\w*\\d\\w*");
    }

    @UseCase(id=48)
    public String encryptPassword(String password) {
        return new StringBuilder(password).reverse().toString();
    }

    @UseCase(id=49, description = "New password can't equals previously used passwords")
    public boolean checkForPassword(List<String> prePasswords, String password) {
        return prePasswords.contains(password);
    }
}
