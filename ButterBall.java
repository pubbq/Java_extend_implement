//Name: Supithcha Jongphoemwatthanaphon
//ID: 6488045
//Section: 2

public class ButterBall extends Sphere implements Comparable<Object3D>, Meltable {

    public ButterBall(String _name, double _radius) {
        super(_name, Object3D.Material.Butter, _radius);
    }

    @Override
    public int compareTo(Object3D o) {
        if(this.getSurface() == o.getSurface()) {
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
        else if(this.getSurface() < o.getSurface()) {
            return -1;
        }
        else if(this.getSurface() > o.getSurface()) {
            return 1;
        }
        
        return 0;
    }

    @Override
    public Object3D convertToOtherShape() {
        double newEdge;
        newEdge = (Math.cbrt(36 * Object3D.PI)*this.getRadius())/3;
        Cube c = new Cube(this.getName(), this.getMaterial(), newEdge);
        return c;
    }

}