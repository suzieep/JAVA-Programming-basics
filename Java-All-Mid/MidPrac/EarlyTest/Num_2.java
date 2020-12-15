package MidPrac.EarlyTest;

public class Num_2 {

    static class Rectangle<T extends Number>{

        T width;
        T height;
    
        Rectangle(T width,T height){
            this.height = height;
            this.width = width;
        }
    
        T getArea(){
            T result;
            Number res = height.doubleValue()*width.doubleValue();
            result = (T)res;
            return result;
        }
    }

    public static void main(String args[]) {

    Rectangle<Integer> rect1 = new Rectangle<>(10, 20);
    Rectangle<Double> rect2 = new Rectangle<>(5.0, 4.0); 

    System.out.println(rect1.getArea());
    System.out.println(rect2.getArea());

    
}
}