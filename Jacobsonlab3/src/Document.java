class Document {
	
	//data member
	private String text;
	
	//constructors
	public Document(){
		text = "";
	}
		
	public Document(String text){
		this.text = text;
	}
	
	//toString
	public String toString(){
		return text;
	}
}
