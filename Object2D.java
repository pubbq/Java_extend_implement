

public abstract class Object2D {
		
		
		public static final String[] Color = {"pink" ,"blue", "yellow"};
		
		//Class variables
		private String color = null;	//Material of this Object2D
		private String name = null;	//Name of this Object2D
//		private Object2D.Color Color;
		
		//Constructor
		public Object2D(String _name, String color)
		{
			this.name = _name;
			this.color = color;
		}
		
		public String getColor()
		{
			return this.color;
		}
		
		public String getName()
		{
			return this.name;
		}
		
		
		
		public String toString()
		{
			return  "[Name=" +getName()+ " (Color=" +getColor()+ ") ,Area ="+getArea() ;
		}
		
		public abstract double getArea();

}
