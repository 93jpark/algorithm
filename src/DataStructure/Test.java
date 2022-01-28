package DataStructure;


import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;


public class Test {

    public static void main(String[] args) {
        Macbook air = new Macbook();
        IPhone se = new IPhone("iphone se");

        List<Computer> coms = new ArrayList<>();
        coms.add(air);
        coms.add(se);

        Device.powerOn();

        Computer.powerOn();

        int[] nums = new int[3];
        System.out.println(nums[5]);
    }




}

interface Device {
    static void powerOn() {
        System.out.println("pressed power button");
    }
}

interface Computer extends Device {
    public void playGame(String gameName);
    public void searchGoogle(String keyword);


    static void powerOn() {
        System.out.println("yo");
    }
}

interface Phone {
    public void sendMessage(String content);
    public void makePhoneCall(String number);
}

abstract class SmartPhone implements Computer, Phone {

    public String model;

    public SmartPhone(String model) {
        this.model = model;
    }

    @Override
    public void playGame(String gameName) {}

    @Override
    public void searchGoogle(String keyword) {}

    @Override
    public void sendMessage(String content) {}

    @Override
    public void makePhoneCall(String number) {}
}

class IPhone extends SmartPhone {

    public IPhone(String model) {
        super(model);
    }

    public void iCloud() { }
}

class Macbook implements Computer, Device {

    @Override
    public void playGame(String gameName) {

    }

    @Override
    public void searchGoogle(String keyword) {

    }
}