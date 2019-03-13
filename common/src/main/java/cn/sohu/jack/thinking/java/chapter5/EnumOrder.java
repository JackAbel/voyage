package cn.sohu.jack.thinking.java.chapter5;

/**
 * @author jinxianbao
 * @date 2019/3/10 3:27 PM
 */
public class EnumOrder {
    DenominationOfRMB faceValues;

    EnumOrder(DenominationOfRMB faceValues) {
        this.faceValues = faceValues;
    }

    private void describe() {
        switch (faceValues) {
            case ONE:
            case FiVE:
                System.out.println("this is small denomination!");
                break;
            case TEN:
            case TWENTY:
            case FIFTY:
                System.out.println("this is medium denomination!");
                break;
            case HUNDRED:
            default:
                System.out.println("this is big denomination!");

        }
    }
    public static void main(String[] args) {
        for (Spiciness s : Spiciness.values()) {
            System.out.println(s + ", ordinal " + s.ordinal());
        }

        for (DenominationOfRMB dor : DenominationOfRMB.values()) {
            System.out.println(dor + ": ordinal " + dor.ordinal());
        }
    }
}
