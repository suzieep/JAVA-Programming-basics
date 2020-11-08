package note1012.Interface;

public class KBO implements Baseball {
    public void setHomeTeam(String name) {
        System.out.println("홈팀은 " + name + "입니다.");
    }

    public void setVisitingTeam(String name) {
        System.out.println("어웨이팀은 " + name + "입니다.");
    }

    public void homeBallScored(int points) {
        System.out.println("홈팀 점수: " + points);
    }

    public void visitingBallScored(int points) {
        System.out.println("어웨이팀 점수: " + points);
    }

    public void endOfInnings(int inning) {
        System.out.println("이닝: " + inning + " 회");
    }

    public static void main(String[] args) {
        KBO k = new KBO();
        k.setHomeTeam("한국");
        k.setVisitingTeam("일본");
        k.homeBallScored(3);
        k.visitingBallScored(2);
        k.endOfInnings(8);
    }
}