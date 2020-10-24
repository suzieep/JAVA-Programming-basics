package HW4;
import java.beans.beancontext.BeanContextChildSupport;
import java.lang.reflect.*;

//getDamage 출력값,,,?

public class Game {
    
    private static Character[] orderedChar2;
	public static void main(String[] args){

        Human human1 = new Human();
        CyberDaemon cyberDaemon1 = new CyberDaemon();
        Barlog barlog1 = new Barlog();
        Elf elf1 = new Elf();
        

        Character [] orderedTeam = setOrder(human1,cyberDaemon1);
        System.out.println("who is winner?");
        battle(orderedTeam[0],orderedTeam[1]).whoAmI();

    }

    public static Character[] setOrder(Character aa, Character bb){
        double per = Math.random();
        Character [] orderedChar = {aa, bb};

        if (per<0.5){
            orderedChar[0] = aa;
            orderedChar[1] = bb;
            return orderedChar;
        }
        else{
            orderedChar[0] = bb;
            orderedChar[1] = aa;
            return orderedChar;
        }

    }

    public static Character battle(Character blue, Character red){
        
        blue.initialize();
        red.initialize();

        while(blue.hitPoint>0 && red.hitPoint>0){
            
            blue.attack(red);
            if(red.isDie()){
                return blue;
            }
            red.attack(blue);
            if(blue.isDie()){
                return red;
            }
            
        }

        System.out.println("error");
        return red;

    }
    public void tournament(Character hu, Character cyber, Character bar, Character el){
        // 4개의 Character를 매개변수로 받으며 이들을 토너먼트로 경기를 시켜 우승자의 whoAmI() 메소드를 통해 우승자의 메시지를 출력하도록 한다. 
        //토너먼트로 경기를 한다는 의미는 1:1로 2경기를 하고 그 승자간에 결승전을 가지도록 하여 결승전 승자가 우승을 한다는 것을 말한다.
    }
}

abstract class Character {

    public Character(){

    }

    public int hitPoint;//캐릭터의 체력
    public int portionNumber;//가지고 있는 물약의 수
    public abstract void initialize();//체력과 물약의 수를 최대치로 초기화
    public abstract void attack(Character c);//캐릭터 c에게 데미지를 준다. 데미지의 숫자는 주어진 특성에 맞도록 주며 확률이 필요한 경우 랜덤함수를 사용하여 확률별로 데미지를 주도록 한다.
    public abstract void recover();// 물약을 먹고 체력을 캐릭터 특성에 따라 회복한다. Barlog의 경우 필요하다면 한번에 2번 물약을 먹을 수 있다.
    public abstract boolean needPortion(); //지금 물약을 먹어야 하는 지를 판단하고 남은 물약이 있다면 물약을 소비한다.

    public void whoAmI(){
        System.out.println("I'm "+this.getClass().getSimpleName());

    }

    public boolean isDie(){
    //자신이 죽었는 지 아닌지를 판단한다. 죽은 경우 “__ is dead.” 메시지를 출력한다.
        if(hitPoint>0){
            return false;
        }
        else{
            System.out.println(this.getClass().getSimpleName()+" is dead.");
            return true;
        }
    }

    public int getDamage(int damage){
        //특정 숫자의 데미지량을 받아 자신의 체력에 반영하며 필요하다면 recover() 메소드를 통해 물약을 먹고 체력을 회복하도록 한다. 
        hitPoint-=damage;

        if (hitPoint>0 && needPortion()){
            recover();
        }

        return 0;
    }
    
    public void attackSub(Character c, int power){
        c.getDamage(power);
        System.out.println(this.getClass().getSimpleName()+" attacks "+ c.getClass().getSimpleName()+" with damage "+power+". "+ c.getClass().getSimpleName()+" has " + c.hitPoint+" hit point now.");


    }

    public void recoverSub(){
        
        System.out.println(this.getClass().getSimpleName()+" eats portion and "+ this.hitPoint + " hit point now.");
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
        int power = 40;
        attackSub(c, power);
    }

    @Override
    public void recover() {
        hitPoint+=40;
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

    CyberDaemon(){

    }
    @Override
    public void initialize() {
        hitPoint = 250;
        portionNumber = 5;
    }

    @Override
    public void attack(Character c) {
        int power = 40;
        double per = Math.random();
        if (per<0.3){
            power = 60;
        }
        attackSub(c, power);
    }

    @Override
    public void recover() {
        double per = Math.random();
        if (per<0.3){
            hitPoint+=50;
            recoverSub();
        }
        else{
            hitPoint+=30;
            recoverSub();
        }
        
    }


    @Override
    public boolean needPortion() {
        if (hitPoint <= 150 && portionNumber > 0) {
            return true;
        } else {
            return false;
        }
    }

}

class Barlog extends Character {

    Barlog(){

    }
    @Override
    public void initialize() {
        hitPoint = 170;
        portionNumber = 5;
    }

    @Override
    public void attack(Character c) {
        double per = Math.random();
        int hit = 0;
        int power =25;
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
        if(portionNumber>1){
            hitPoint += 30;
            recoverSub();
            hitPoint += 30;
            recoverSub();
        }
        else {
            hitPoint+=30;
            recoverSub();
        }
    }

    @Override
    public boolean needPortion() {
        if (hitPoint <= 140 && portionNumber > 0) {
            return true;
        } else {
            return false;
        }
    }

}

class Elf extends Character {

    Elf(){

    }

    @Override
    public void initialize() {
        hitPoint = 180;
        portionNumber = 5;
    }

    @Override
    public void attack(Character c) {
        double per = Math.random();
        int power = 35;
        if (per<0.3){
            power=70;
        }
        attackSub(c, power);
        
    }

    @Override
    public void recover() {
        double per = Math.random();
        if (per<0.25){
            hitPoint+=60;
            recoverSub();
        }
        else{
            hitPoint+=30;
            recoverSub();
        }

    }

    @Override
    public boolean needPortion() {
        if (hitPoint <= 140 && portionNumber > 0) {
            return true;
        } else {
            return false;
        }
    }

}