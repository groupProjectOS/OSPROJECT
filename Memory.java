package src;

public class Memory {
	private int[] memory; // array to hold RAM

	// CONSTRUCTOR
	public Memory(int size) {
		this.memory = new int[size];
	}

	// READ
	public int readData(int i) {
		return this.memory[i];
	}
	
	// WRITE
	public void writeData(int i, short data) {
		this.memory[i] = data;
	}

	// PRINT RAM
	public void printRam() {
		for (int i = 0; i < memory.length; i++) {
			System.out.println("memory " + ": " + memory[i]);
		}
	}
}
