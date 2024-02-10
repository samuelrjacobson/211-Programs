class Email extends Document {
	
	//data members
	private String sender;
	private String recipient;
	private String title;
	
	//constructos
	public Email(){
		super("");
		sender = "";
		recipient = "";
		title = "";
	}
	public Email(String sender, String recipient, String title, String text){
		super(text);
		this.title = title;
		this.sender = sender;
		this.recipient = recipient;
	}
	
	//getters
	public String getSender() {
		return sender;
	}
	public String getRecipient() {
		return recipient;
	}
	public String getTitle() {
		return title;
	}
	
	//setters
	public void setSender(String sender) {
		this.sender = sender;
	}
	public void setRecipient(String recipient) {
		this.recipient = recipient;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	
	//toString
	@Override
	public String toString() {
		return super.toString() + "Sender: " + sender + "\nRecipient: " + recipient + "\nTitle: " + title +"\nmessage: ";
	}
}
