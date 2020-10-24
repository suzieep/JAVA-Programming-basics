package HW4;

import java.util.*;

//getDamage에서 뭘 출력해야할 지 모르겠어서 일단 return 0;로 해두었음.

//회복할 때 "오버되는 hp가 없게 하는 것"과 "빠르게 회복을 해두는 것"에 대한 우선순위가 명시되어 있지 않아서 전자를 기준으로 프로그래밍 함.
//-> max Hp를 넘을 경우가 없게 코드를 짰기 때문에 최대 체력 수치 초과에 대한 코드는 없음.

public class Game {

    public static void main(String[] args) {

        Human human1 = new Human();
        CyberDaemon cyberDaemon1 = new CyberDaemon();
        Barlog barlog1 = new Barlog();
        Elf elf1 = new Elf();

        tournament(human1, cyberDaemon1, barlog1, elf1);

    }

    public static Character[] setOrder(Character aa, Character bb) {
        Character[] orderedChar = { aa, bb };
        List<Character> orderedList = Arrays.asList(orderedChar);
        Collections.shuffle(orderedList);
        orderedList.toArray(orderedChar);

        return orderedChar;

    }

    public static Character battle(Character blue, Character red) {

        blue.initialize();
        red.initialize();

        System.out.println(blue.getClass().getSimpleName()+" vs "+ red.getClass().getSimpleName()+"\n");

        while (blue.hitPoint > 0 && red.hitPoint > 0) {

            blue.attack(red);
            if (red.isDie()) {
                return blue;
            }
            red.attack(blue);
            if (blue.isDie()) {
                return red;
            }

        }

        System.out.println("error");
        return red;

    }

    public static void tournament(Character hu, Character cyber, Character bar, Character el) {
        Character[] orderedChar = { hu, cyber, bar, el };
        List<Character> orderedList = Arrays.asList(orderedChar);
        Collections.shuffle(orderedList);
        orderedList.toArray(orderedChar);

        Character[] finalTeam = setOrder(battle(orderedChar[0], orderedChar[1]), battle(orderedChar[2], orderedChar[3]));
        
        battle(finalTeam[0],finalTeam[1]).whoAmI();

    }
}

abstract class Character {

    public int hitPoint;
    public int portionNumber;

    public abstract void initialize();

    public abstract void attack(Character c);

    public abstract void recover();

    public abstract boolean needPortion();

    public void whoAmI() {
        System.out.println("I'm " + this.getClass().getSimpleName());

    }

    public boolean isDie() {

        if (hitPoint > 0) {
            return false;
        } else {
            System.out.println(this.getClass().getSimpleName() + " is dead.\n\n");
            return true;
        }
    }

    public int getDamage(int damage) {

        if (hitPoint > 0 && needPortion()) {
            recover();
        }

        return 0;
    }

    public void attackSub(Character c, int power) {
        c.hitPoint -= power;
        System.out
                .println(this.getClass().getSimpleName() + " attacks " + c.getClass().getSimpleName() + " with damage "
                        + power + ". " + c.getClass().getSimpleName() + " has " + c.hitPoint + " hit point now.");
        c.getDamage(power);

    }

    public void recoverSub() {

        System.out.println(this.getClass().getSimpleName() + " eats portion and " + this.hitPoint + " hit point now.");
        portionNumber--;
    }

}

class Human extends Character {

    @Override
    public void initialize() {
        hitPoint = 200;
        portionNumber = 5;
    }

    @Override
    public void attack(Character c) {
        int power = 50;
        attackSub(c, power);
    }

    @Override
    public void recover() {
        hitPoint += 40;
        recoverSub();
    }

    @Override
    public boolean needPortion() {
        if (hitPoint <= 160 && portionNumber > 0) {
            return true;
        } else {
            return false;
        }
    }

}

class CyberDaemon extends Character {

    @Override
    public void initialize() {
        hitPoint = 250;
        portionNumber = 5;
    }

    @Override
    public void attack(Character c) {
        int power = 40;
        double per = Math.random();
        if (per < 0.3) {
            power = 60;
        }
        attackSub(c, power);
    }

    @Override
    public void recover() {
        double per = Math.random();
        if (per < 0.3) {
            hitPoint += 50;
            recoverSub();
        } else {
            hitPoint += 30;
            recoverSub();
        }

    }

    @Override
    public boolean needPortion() {
        if (hitPoint <= 200 && portionNumber > 0) {
            return true;
        } else {
            return false;
        }
    }

}

class Barlog extends Character {

    @Override
    public void initialize() {
        hitPoint = 170;
        portionNumber = 5;
    }

    @Override
    public void attack(Character c) {
        double per = Math.random();
        int hit = 0;
        int power = 25;
        while (hit < 2) {
            if (per < 0.2) {
                power = 35;
            }
            attackSub(c, power);
            hit++;
        }
    }

    @Override
    public void recover() {
        if (portionNumber > 1) {
            hitPoint += 30;
            recoverSub();
            hitPoint += 30;
            recoverSub();
        } else {
            hitPoint += 30;
            recoverSub();
        }
    }

    @Override
    public boolean needPortion() {
        if (hitPoint <= 110 && portionNumber > 0) {
            return true;
        } else {
            return false;
        }
    }

}

class Elf extends Character {

    @Override
    public void initialize() {
        hitPoint = 180;
        portionNumber = 5;
    }

    @Override
    public void attack(Character c) {
        double per = Math.random();
        int power = 35;
        if (per < 0.3) {
            power = 70;
        }
        attackSub(c, power);

    }

    @Override
    public void recover() {
        double per = Math.random();
        if (per < 0.25) {
            hitPoint += 60;
            recoverSub();
        } else {
            hitPoint += 30;
            recoverSub();
        }

    }

    @Override
    public boolean needPortion() {
        if (hitPoint <= 120 && portionNumber > 0) {
            return true;
        } else {
            return false;
        }
    }

}