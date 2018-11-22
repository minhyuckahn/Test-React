package test.apple;

import java.util.ArrayList;
import java.util.List;

public class Apple {
	private String name;
    private String color;
    private int weight;
    
    public Apple(String name, AppleColor cl, int wg) {
    	this.name = name;
    	this.color = cl.getColor();
    	this.weight = wg;
    }
    
    public String getColor() {
        return color;
    }
    public int getWeight() {
        return weight;
    }
    
	public static boolean isGreen(Apple apple) {
        return AppleColor.GREEN.getColor().equals(apple.getColor());
    }
	
	public static boolean isRed(Apple apple) {
        return AppleColor.RED.getColor().equals(apple.getColor());
    }
	
    public static boolean isHeavy(Apple apple) {
        return apple.getWeight() > 200;
    }

    public static void isOK(Apple apple, int w) {
    	if(apple.getWeight() > w)
    		System.out.println(apple.name + " 는 " +  w +"g 이상입니다.");
    	else
    		System.out.println(apple.name + " 는 " +  w +"g 이하입니다.");
    }    
    
    public static List<Apple> filterREDApples(List<Apple> inventory) {
        List<Apple> result = new ArrayList<Apple>();
        for (Apple apple : inventory) {
            if (AppleColor.RED.getColor().equals(apple.getColor())) {
                result.add(apple);
            }
        }
        return result;
    }
    
    public static List<Apple> filterHeavyApples(List<Apple> inventory) {
        List<Apple> result = new ArrayList<Apple>();
        for (Apple apple : inventory) {
            if (apple.getWeight() > 200) {
                result.add(apple);
            }
        }
        return result;
    }
    

    /**
     * 프레디케이트를 이용한 예제
     * @param inventory
     * @param p
     * @return
     */
    public static List<Apple> filterApples(List<Apple> inventory, ApplePredicate<Apple> p) {
        List<Apple> result = new ArrayList<Apple>();
        for (Apple apple : inventory) {
            if (p.MyFunction(apple)) {
                result.add(apple);
            }
        }
        return result;
    }
    
    /**
     * 프레디케이트를 이용한 예제
     * @param inventory
     * @param p
     * @return
     */
    public static void wCheckApples(List<Apple> inventory, int w, ApplePredicate2<Apple> p) {

        for (Apple apple : inventory) {
            p.MyFunction(apple, w);
        }

    }    
    
    
    public static void main(String[] args) {
    	ArrayList<Apple> aList = new ArrayList<Apple>();
    	aList.add(new Apple("아오이200g",AppleColor.GREEN, 100));
    	aList.add(new Apple("아오이300g",AppleColor.GREEN, 300));
    	aList.add(new Apple("홍옥150g", AppleColor.RED, 150));
    	aList.add(new Apple("후지250g", AppleColor.RED, 250));
    	aList.add(new Apple("사과350g", AppleColor.RED, 250));
    	
    	List<Apple> rApp = filterREDApples(aList);
    	
    	for (Apple appl : rApp) {
			System.out.println("붉은 사과 "+ appl.name + " 무게는 " + appl.weight);
		}
    	
    	List<Apple> wApp = filterHeavyApples(aList);
    	for (Apple appl : wApp) {
			System.out.println("무거운 사과 "+ appl.name + " 무게는 " + appl.weight);
		}
    	
    	
    	System.out.println("#####################################################");
    	List<Apple> rApp2 = filterApples(aList, Apple::isRed);    	
    	List<Apple> wApp2 = filterApples(aList, Apple::isHeavy);
    	
    	wCheckApples(aList, 200, Apple::isOK);
    	
    	for (Apple appl : rApp2) {
			System.out.println("붉은 사과 "+ appl.name + " 무게는 " + appl.weight);
		}    	
    	for (Apple appl : wApp2) {
			System.out.println("무거운 사과 "+ appl.name + " 무게는 " + appl.weight);
		}
    }
}