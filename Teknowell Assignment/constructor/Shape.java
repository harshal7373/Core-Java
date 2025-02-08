package constructor;

class Shape{
	
	float radius;
	int length;
	int breadth;
	int side;
	int heigth;
	int base;
	
	Shape(float radius){
		
		float pi =  3.14f;
		
	    float areaCircle = pi * radius ;
		
		System.out.println("Area of Circle: " + areaCircle);
			
	}
	
	Shape(int length, int breadth){
		
		int areaRectangle = length * breadth;
		
		System.out.println("Area of Rectangle: " + areaRectangle );
		
	}
	
	Shape(int side){
		
		int areaSquare = side * side;
		
		System.out.println("Area of Square: "  + areaSquare);
		
	}
	
	Shape(int height, float base){
		
		
		float areaTriangle = 0.5f * (base * height);
		
		System.out.println("Area of Triangle: " + areaTriangle);
	}
	
      
        public static void main(String[] args) {
		
		Shape a1 = new Shape(50.5f);
		Shape a2 = new Shape(20,25);
		Shape a3 = new Shape(10);
		Shape a4 = new Shape(10, 43.4f);
	}


	
	
}