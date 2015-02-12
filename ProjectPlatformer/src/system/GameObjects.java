package system;

import java.util.ArrayList;
import java.util.ListIterator;

import objects.GameObject;
import objects.Platform;

public class GameObjects {
	private ArrayList<GameObject> gos = new ArrayList<GameObject>();
	
	public void updatePositions() {
		for (GameObject go : gos) {
			go.move();
			// collisions
			
		}
	}
	
	public void updateStates() {
		ListIterator<GameObject> iterator = gos.listIterator();
		
		while(iterator.hasNext()) {
			GameObject go = iterator.next();
			go.updateState();
			if (go.toBeRemoved == true) {
				iterator.remove();
			}
		}
	}
	
	public void add(GameObject go) {
		gos.add(go);
	}
	
	public void remove(GameObject go) {
		gos.remove(go);
	}
	
	public void remove(int index) {
		gos.remove(index);
	}
	
	public GameObject get(int index) {
		return gos.get(index);
	}
	
	public int indexOf(GameObject go) {
		return gos.indexOf(go);
	}
	
	public ArrayList<GameObject> cloneOfArrayList() {
		return (ArrayList<GameObject>) gos.clone();
	}
}
