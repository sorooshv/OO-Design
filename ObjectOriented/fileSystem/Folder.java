package fileSystem;

import java.util.HashMap;


public class Folder extends FileSystem {
	private HashMap<String,Folder> folders = new HashMap<String,Folder>();
	private HashMap<String,File> files = new HashMap<String,File>();
	
	public Folder(String name, int size) {
		super(name, size);
		
	}
	
	public boolean addFolder(Folder f){
		if(folders.containsKey(f.getName()))
			return false;
		
		this.folders.put(f.getName(),f);
		f.setParent(this);
		this.setSize(this.getSize() + f.getSize());
		return true;
	}
	
	public boolean addFile(File f){
		if(folders.containsKey(f.getName()))
			return false;
		
		this.files.put(f.getName(),f);
		f.setParent(this);
		this.setSize(this.getSize() + f.getSize());
		return true;
	}
	
	public boolean removeFolderByName(String s){
		if(!folders.containsKey(s))
			return false;
		
		Folder toRemove = this.folders.get(s);
		toRemove.setParent(null);
		this.folders.remove(s);
		this.setSize(this.getSize() + toRemove.getSize());
		return true;
	}
	
	public boolean removeFileByName(String s){
		if(!files.containsKey(s))
			return false;
		File toRemove = this.files.get(s);
		toRemove.setParent(null);
		this.folders.remove(s);
		this.setSize(this.getSize() + toRemove.getSize());
		return true;
	}
	
	public Folder getFolderByName(String name){
		return folders.get(name);
	}
	
	public File getFileByName(String name){
		return files.get(name);
	}
	
	public HashMap<String,Folder> getFolders() {
		return folders;
	}

	public HashMap<String,File> getFiles() {
		return files;
	}
	public String toString(){
		return getName();
	}
}
