package src;

public class Disk {
	private int[] disk; // array to hold disk

	// CONSTRUCTOR
	public Disk(int size) {
		this.disk = new int[size];
	}

	// READ
	public int readData(int i) {
		return this.disk[i];
	}

	// WRITE
	public void writeData(int i, int data) {
		this.disk[i] = data;
	}
	
	// PRINT DISK
	public void printDisk() {
		for (int i = 0; i < disk.length; i++) {
			System.out.println("disk " + ": " + disk[i]);
		}
	}
}
