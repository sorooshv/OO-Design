package fileSystem;

public abstract class FileSystem {
	protected String name;
	protected int size;
	private Folder parent;
	
	public FileSystem(String name, int size){
		this.name = name;
		this.size = size;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}
	
	public Folder getParent() {
		return parent;
	}

	public void setParent(Folder parent) {
		this.parent = parent;
	}
	
	public void delete(){
		this.parent.removeFileByName(this.getName());
	}
}
