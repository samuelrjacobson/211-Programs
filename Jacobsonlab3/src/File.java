class File extends Document {

	//data member
	private String pathname;
	
	//constructors
	public File() {
		super("");
		pathname = "";
	}
	
	public File(String text, String pathname) {
		super(text);
		this.pathname = pathname;
	}
	
	//getter
	public String getPathname(String pathname) {
		return pathname;
	}
	
	//setter
	public void setPathname(String pathname) {
		this.pathname = pathname;
	}
	
	//toString
	@Override
	public String toString() {
		return super.toString() + "Pathname: " + pathname + "\nFile contents: ";
	}
}
