package boxstacking;

public class Box implements Comparable<Box>{
	int height;
	int width;
	int depth;
	public Box(int height, int width, int depth) {
		this.height = height;
		this.width = width;
		this.depth = depth;
	}
	
	public int getH() {
		return height;
	}
	
	public int getW() {
		return width;
	}
	
	public int getD() {
		return depth;
	}
	
	/**
	 * Not sure where this is used, but depending on the case, this implementation may not
	 * be what you are looking for
	 * For example, 5 x 3 block cannot be put on top of 4 x 4 box, even though it has less area.
	 * Further, compareTo should generally return 1, 0 or -1, not other values.
	 */
	public int compareTo(Box o) {
		int area = o.depth*o.width;
		int thisArea = this.depth*this.width;
		
		return area - thisArea;
	}
	
}
