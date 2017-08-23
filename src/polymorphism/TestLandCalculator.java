package polymorphism;

public class TestLandCalculator {

	public static void main(String[] args) {
		
		LandCalculator calculate = new LandCalculator();
		int  sizeOfStraightLine = calculate.areaOfLand(5, 10);
		System.out.println(sizeOfStraightLine);
		int  sizeOfTriangle = calculate.areaOfLand(5, 10, 15);
		System.out.println(sizeOfTriangle);
		int  sizeOfRectangle = calculate.areaOfLand(8, 10, 12, 11);
		System.out.println(sizeOfRectangle);
		
		ModernLandCalculator mlc = new ModernLandCalculator();
		int modernRectangleSize = mlc.areaOfLand(8, 10, 12, 11);
		System.out.println(modernRectangleSize);
		
		UltraModern ultra = new UltraModern();
		int ultraModernRectangleSize = ultra.areaOfLand(8, 10, 12, 11);
		System.out.println(ultraModernRectangleSize);
	}

}
