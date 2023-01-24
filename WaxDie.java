//Name: Supithcha Jongphoemwatthanaphon
//ID: 6488045
//Section: 2

public class WaxDie extends Cube implements Comparable<Object3D>, Meltable {

    public WaxDie(String _name, double _edge) {
        super(_name, Object3D.Material.Wax, _edge);
    }



    @Override
    public int compareTo(Object3D o) {
        //if both is equal return 0    
        //if this is less than o return -1
        //if this is more than o return 1
        if(this.getVolume() == o.getVolume()) {
            if(this.getName().compareTo(o.getName()) > 0) {
                return 1; 
            }
            else if(this.getName().compareTo(o.getName()) < 0){
                return -1;
            }
            else {
                return 0;
            }
        }
        else if(this.getVolume() < o.getVolume()) {
            return -1;
        }
        else if(this.getVolume() > o.getVolume()) {
            return 1;
        }
        return 0;
    }
    
    public Object3D convertToOtherShape() {

        //volume = volume
        //e^3 = 4/3 * pi * r^3
        double edgeToRadius = (Math.cbrt(6 * Math.pow(Object3D.PI, 2)) * this.getEdge())/(2 * Object3D.PI);
        Sphere s = new Sphere(this.getName(), this.getMaterial(), edgeToRadius);
        return s;
    }

}