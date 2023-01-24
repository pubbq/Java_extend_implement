//import Object2D.Color;

public class Square extends Object2D implements Area{
	
		private double side;

		public Square (String _name, String color, double side){
		super(_name, color);
		this.side = side ;
		}


	@Override
	public double findArea() {
		 return Math.pow(side, 2) ; 
	}


	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return findArea();
	}
	
}




  
