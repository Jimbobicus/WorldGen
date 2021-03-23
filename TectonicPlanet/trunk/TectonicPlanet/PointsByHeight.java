package TectonicPlanet;

// Standard Java imports
import java.util.*;



public class PointsByHeight {
  private TreeMap<Double, ArrayList<TecPoint>> tree;
	public PointsByHeight() {
	  tree=new TreeMap<Double, ArrayList<TecPoint>>();
	}
	public void add(TecPoint tp) {
	  Double height=(tp.getSurfaceHeight());
		if (tree.containsKey(height)) {
		  // Already have a point with that height, add it to the set
			ArrayList<TecPoint> v=tree.get(height);
			v.add(tp);
		} else {
			// First point witht that height, make a new vector entry
			ArrayList<TecPoint> n=new ArrayList<TecPoint>();
			n.add(tp);
			tree.put(height,n);
		}
	}
	public ArrayList<TecPoint> get(double h) {
	  return tree.get((h));
	}
	public ArrayList<TecPoint> first() {
	  return tree.get(tree.firstKey());
	}
	public ArrayList<TecPoint> last() {
	  return tree.get(tree.lastKey());
	}
	public void removeFirst() {
	  tree.remove(tree.firstKey());
	}
	public int size() {return tree.size();}
}