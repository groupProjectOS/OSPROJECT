package src;

public class MemManager {
	private Disk disk;
	private Memory ram;
	private final int diskSize = 2048;
	private final int memSize = 1024;

	// CONSTRUCTOR
	public MemManager() {
		this.disk = new Disk(diskSize);
		this.ram = new Memory(memSize);
	}

	// READ DISK
	public synchronized int readDiskData(int r) {
		return disk.readData(r);
	}
	
	// WRITE DISK
	public synchronized void writeDiskData(int loc, int data) {
		disk.writeData(loc, data);
	}

	// READ RAM
	public synchronized int readRamData(int r) {
		return ram.readData(r);
	}

	// WRITE RAM
	public synchronized void writeRamData(int loc, short data) {
		ram.writeData(loc, data);
	}

	// PRINT DISK
	public void printDisk() {
		printDisk();
	}

	// PRINT RAM
	public void printRam() {
		printRam();
	}
}
