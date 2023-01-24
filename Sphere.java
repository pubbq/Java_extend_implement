//import

//Name: Supithcha Jongphoemwatthanaphon
//ID: 6488045
//Section: 2

public class Sphere extends Object3D {
		private double _radius;

		public Sphere (String _name, Material _matType, double _radius){
		super(_name, _matType);
		this._radius = _radius ;
		}
		public double getRadius()
		{
			return this._radius;
		}
			
			public double getVolume() {
//				return (4 *Math.PI *Math.pow(this._radius, 3)) /3; //V: 1,305.50
				return (4 *3.14 *this._radius*this._radius*this._radius) /3 ; //ตรง
			}
			public double getSurface() {
//				return 4 *(Math.PI) *(Math.pow(this._radius, 2)); //S: 577.66
				return 4 *3.14 *this._radius*this._radius; //ตรง
			}
			
}

		