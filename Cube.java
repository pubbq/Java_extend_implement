//Name: Supithcha Jongphoemwatthanaphon
//ID: 6488045
//Section: 2

	public class Cube extends Object3D {
		private double _edge;
		
		public Cube (String _name, Material _matType, double _edge){
		super(_name, _matType);
		this._edge = _edge ;
		}
		
		public double getEdge(){
			return this._edge;
		}
		
		public double getVolume() {
			return Math.pow(this._edge, 3);
		}
		public double getSurface() {
			return 6 *  Math.pow(this._edge, 2);
		}

}