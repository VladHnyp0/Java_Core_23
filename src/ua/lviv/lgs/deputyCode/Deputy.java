package ua.lviv.lgs.deputyCode;

import java.util.Scanner;
import java.util.function.Supplier;

public class Deputy extends Human {

    private String surname;
    private String name;
    private int age;
    private boolean bribeTaker;
    private int bribeSize;

    public Deputy(String surname, String name) {
        this.surname = surname;
        this.name = name;
    }

    public Deputy(String surname, String name, int age, int height, int weight, boolean bribeTaker) {
        super(weight, height);
        this.surname = surname;
        this.name = name;
        this.age = age;
        this.bribeTaker = bribeTaker;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isBribeTaker() {
        return bribeTaker;
    }

    public String bribeTakerToString() {
        if (this.bribeTaker) {
            return "хабарщик";
        } else { return "чесний";
        }
    }

    public void setBribeTaker(boolean bribeTaker) {
        this.bribeTaker = bribeTaker;
    }

    public int getBribeSize() {
        return bribeSize;
    }

    public void setBribeSize(int bribeSize) {
        this.bribeSize = bribeSize;
    }

    public void giveBribe() {
        if (this.bribeTaker == false) {
            System.out.println("Цей депутат не бере хабарів!");
        }

        if (this.bribeTaker == true) {
            System.out.println("Введіть суму хабаря: ");
            int bribeAmount = getBribeAmount.get();

            if (bribeAmount > 5000) {
                System.out.println("Поліція ув'язнить депутата!");
            } else {
                this.bribeSize = bribeAmount;
            }
        }
    }

    Supplier<Integer> getBribeAmount = () -> {
        Scanner scanner = new Scanner(System.in);
        int bribeAmount = scanner.nextInt();

        return bribeAmount;
    };

    @Override
    public String toString() {
        return surname + " " + name + ", " + age + " років, ріст " + super.getHeight() + " см, вага " + super.getWeight()
                + " кг, " + bribeTakerToString();
    }

}