package system;

import java.util.ArrayList;

import objects.GameObject;

public class GameObjects {
	private ArrayList<GameObject> gos = new ArrayList<GameObject>();
	
	public void updatePositions() {
		for (GameObject go : gos) {
			go.move();
			// collisions
			
		}
	}
	
	public void updateState() {
		for (GameObject go : gos) {
			go.updateState();
		}
	}
	
	public void addGameObject(GameObject go) {
		gos.add(go);
	}
	
	public void removeGameObject(GameObject go) {
		gos.remove(go);
	}
}
