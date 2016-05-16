package protocol;

import client.ChatClient;

// Server --> JoinPacket --> Client

public class JoinResponse extends Response {
	/**
	 * 
	 */
	private static final long serialVersionUID = 7671488413310383217L;
	private boolean success;
	private String message;
	
	public JoinResponse(boolean success, String message) {
		this.success = success;
		this.message = message;
	}
	
	@Override
	public void execute(ChatClient client) {
		// TODO Auto-generated method stub
		
	}
	
	public String toString(){
		return message + " " + success;
	}
	
}
