package Notes.Ect;

import java.util.*;

public class MyVector {
    public static void main(String args[]) {

        Vector v = new Vector(3, 2); // 초기 용량이 3으로 지정되고 벡터 크기를 상향 조정할 때마다 2할당

        System.out.println("처음 사이즈: " + v.size());
        System.out.println("처음 용량: " + v.capacity());

        v.addElement(new Integer(1));
        v.addElement(new Integer(2));
        v.addElement(new Integer(3));
        v.addElement(new Integer(4));
        
        System.out.println("네 개 증가 이후 용량 " + v.capacity());
        v.addElement(new Double(5.45));
        System.out.println("현재 용량: " + v.capacity());
        v.addElement(new Double(6.08));
        v.addElement(new Integer(7));

        System.out.println("현재 용량: " + v.capacity());
        v.addElement(new Float(9.4));
        v.addElement(new Integer(10));

        System.out.println("현재 용량: " + v.capacity());
        v.addElement(new Integer(11));
        v.addElement(new Integer(12));

        System.out.println("처음 요소: " + (Integer) v.firstElement());
        System.out.println("마지막 요소: " + (Integer) v.lastElement());

        if (v.contains(new Integer(3)))
            System.out.println("벡터가 3을 가지고 있습니다.");
        
            // 벡터 요소 열거
        Enumeration vEnum = v.elements();
        System.out.println("\n벡터 안의 값:");
        while (vEnum.hasMoreElements())
            System.out.print(vEnum.nextElement() + " ");
        System.out.println();
    }
}