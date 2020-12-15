package MidPrac.MidTest;

public class Number_2 {
    public static void main(String args[]){

        System.out.println("2번 문제에 대한 풀이");

        Graph bar = new BarGraph();
        bar.scoreArray = Number_1.rawFile;
        bar.draw();
        Graph line = new LineGraph();
        line.scoreArray = Number_1.rawFile;
        line.draw();

    }
}

abstract class Graph{

    public String [][] scoreArray;

    public Graph(){}
    public Graph(String [][] scoreArray){
        this.scoreArray = scoreArray;

    }

    public String[][] getData(){
        return scoreArray;
    }
    
    public abstract void draw();
}

class LineGraph extends Graph{

    @Override
    public void draw() {
        for (int i = 0; i < 6; i++) {
            System.out.print(scoreArray[i][0] + " |");
            for (int j = 0; j < Integer.valueOf(scoreArray[i][1])-1; j++) {
                System.out.print(" ");
            }
            System.out.println("*");
            System.out.println("");
        }

    }


}

class BarGraph extends Graph {

    @Override
    public void draw() {
        for (int i = 0; i < scoreArray.length; i++) {
            System.out.print(scoreArray[i][0] + " |");
            for (int j = 0; j < Integer.valueOf(scoreArray[i][1]); j++) {
                System.out.print("\\#");
            }
            System.out.println("");
        }
    }

}

