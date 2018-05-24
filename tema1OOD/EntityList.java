package tema1OOD;

import java.util.ArrayList;

public class EntityList extends ArrayList<Entity> {
	
	public Entity getPersoanaWithMaxAge() {
		
		NormalAge maxAge = new NormalAge();
		Persoana maxPersoana = null;
		
		for(Entity it: this) {
			if(it instanceof Persoana && it.age.compareTo(maxAge) > 0) {
				maxPersoana = (Persoana) it;
				maxAge = (NormalAge) it.age;
			}
		}
		
		return maxPersoana;
	}
	
	public void printAllPersoanaWithAge(Age a)
	{
		for(Entity it : this)
		{
			if(it instanceof Persoana && it.age.compareTo(a) > 0) {
				System.out.println(it.getName());
			}
		}
	}
	
	public Entity getBuildingWithMaxAge() {
		
		NormalAge maxAge = new NormalAge();
		Building maxBuilding = null;
		
		for(Entity it: this) {
			if(it instanceof Building && it.age.compareTo(maxAge) > 0) {
				maxBuilding = (Building) it;
				maxAge = (NormalAge) it.age;
			}
		}
		
		return maxBuilding;
	}
	
	public void printAllBuildingWithAge(Age a)
	{
		for(Entity it : this)
		{
			if(it instanceof Building && it.age.compareTo(a) > 0) {
				System.out.println(it.getName());
			}
		}
	}
	
	public Entity getCaineWithMaxAge() {
		
		DogAge maxAge = new DogAge();
		Caine maxCaine = null;
		
		for(Entity it: this) {
			if(it instanceof Caine && it.age.compareTo(maxAge) > 0) {
				maxCaine = (Caine) it;
				maxAge = (DogAge) it.age;
			}
		}
		
		return maxCaine;
	}
	
	public void printAllCaineWithAge(Age a)
	{
		for(Entity it : this)
		{
			if(it instanceof Caine && it.age.compareTo(a) > 0) {
				System.out.println(it.getName());
			}
		}
	}
	
	public Entity getEntityWithMaxAge() {
		Entity maxEntity = this.get(0);
		
		for(Entity it : this) {
			if(it.age.compareTo(maxEntity.age) > 0) {
				maxEntity = it;
			}
		}
		return maxEntity;
	}
	
	public void printAllEntityWithAge(Age x) {
		for(Entity it : this) {
			if(it.age.compareTo(x) > 0) {
				System.out.println(it.getName());
			}
		}
	}
	
	
}
