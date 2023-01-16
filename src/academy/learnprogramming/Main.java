package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        int MyValue = 1_000;

        int MyMinValue = Integer.MIN_VALUE;
        int MyMaxValue = Integer.MAX_VALUE;
        System.out.println("Integer Minimum Value = " + MyMinValue);
        System.out.println("Integer Maximum Value = " + MyMaxValue);

        byte MyMinByteValue = Byte.MIN_VALUE;
        byte MyMaxByteValue = Byte.MAX_VALUE;
        System.out.println("Minimum Byte Value =" +MyMinByteValue);
        System.out.println("Maximum Byte Value =" +MyMaxByteValue);

        short MyMinshortValue = Short.MIN_VALUE;
        short MyMaxshortValue = Short.MAX_VALUE;
        System.out.println("Minimum short Value =" +MyMinshortValue);
        System.out.println("Maximum short Value =" +MyMaxshortValue);

        long myLongValue = 100;
        long MyMinlongValue = Long.MIN_VALUE;
        long MyMaxlongValue = Long.MAX_VALUE;
        System.out.println("Minimum long Value =" +MyMinlongValue);
        System.out.println("Maximum long Value =" +MyMaxlongValue);

        long BigLongNumber = 234_324_456_789L;
        System.out.println("a long big number "+BigLongNumber);

        int MyTotal = (MyMinValue / 2);
        System.out.println("minimum integral value divided by 2 is " + MyTotal);

        byte MyTotalByte = (byte) (MyMinByteValue / 2);
        System.out.println("minimum byte value divided by 2 is "+MyTotalByte);
        short MyTotalShort = (short) (MyMinshortValue / 2);

        byte My1stByteNo = (byte) 130;
        short My1stShortNo = (short) 25225;
        int My1stIntNo = 560000;
        long My1stLongNo = (long) (50000 + 10 * (My1stByteNo+My1stShortNo+My1stIntNo));
        System.out.println("[50000 + 10 * ( 130 + 2522c+ 560000)] = " + My1stLongNo);
    }
}
