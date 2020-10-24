package HW4;

public class Game {
    
    public static void main(String[] args){

    }

    public static Character battle(Character blue, Character red){
        Character winner = new Character();

        return winner;
    }

}

abstract class Character {
    public int hitPoint;//캐릭터의 체력
    public int portionNumber;//가지고 있는 물약의 수
    public void initialize(){ 
    //체력과 물약의 수를 최대치로 초기화

    }
    public Character(){

    }

    public void attack(Character c){ 
    //캐릭터 c에게 데미지를 준다. 데미지의 숫자는 주어진 특성에 맞도록 주며 확률이 필요한 경우 랜덤함수를 사용하여 확률별로 데미지를 주도록 한다.

    }

    public int getDamage(int damage){
    //특정 숫자의 데미지량을 받아 자신의 체력에 반영하며 필요하다면 recover() 메소드를 통해 물약을 먹고 체력을 회복하도록 한다. 
        return damage;
    }

    public void recover(){
    // 물약을 먹고 체력을 캐릭터 특성에 따라 회복한다. Barlog의 경우 필요하다면 한번에 2번 물약을 먹을 수 있다.

    }

    public boolean isDie(){
    //자신이 죽었는 지 아닌지를 판단한다. 죽은 경우 “__ is dead.” 메시지를 출력한다.

    }

    public boolean needPortion(){
    //지금 물약을 먹어야 하는 지를 판단하고 남은 물약이 있다면 물약을 소비한다.

    }

    public void whoAmI(){
    //자신이 어떤 클래스에 속하는 지를 화면에 출력한다.
    }
}

class Human extends Character {
    
    Human(){

    }

}

class CyberDaemon extends Character {

    CyberDaemon(){

    }

}

class Barlog extends Character {

    Barlog(){

    }

}

class Elf extends Character {

    Elf(){

    }

}