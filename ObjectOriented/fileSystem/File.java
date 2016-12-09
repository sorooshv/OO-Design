package fileSystem;

public class File extends FileSystem {
	
	private String ext;
	
	public File(String name, int size, String ext) {
		super(name,size);
		this.ext = ext;
	}

	public String getExt() {
		return ext;
	}

	public void setExt(String ext) {
		this.ext = ext;
	}
	
	
	
	public String toString(){
		return getName() + "." + getExt();
	}
}
