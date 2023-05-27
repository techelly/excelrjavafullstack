package daysixcollections.map.hashmapinternalworking;

import java.util.Objects;

public class Key {
	private Integer index;
	private String name;
	/**
	 * @param index
	 * @param name
	 */
	public Key(Integer index, String name) {
		this.index = index;
		this.name = name;
	}
	@Override
	public int hashCode() {
		//return Objects.hash(index, name);
		return 5;
	}
	@Override
	public boolean equals(Object obj) {
		/**if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Key other = (Key) obj;
		return Objects.equals(index, other.index) && Objects.equals(name, other.name);
		**/
		return true;
	}
	
}
