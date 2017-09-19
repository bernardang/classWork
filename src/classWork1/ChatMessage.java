package classWork1;


import java.io.*;



public class ChatMessage implements Serializable {



	protected static final long serialVersionUID = 1112122200L;



	// The different types of message sent by the Client

	// WHOISIN to receive the list of the users connected

	// MESSAGE an ordinary message

	// LOGOUT to disconnect from the Server

	// IMAGE to send image

	static final int WHOISIN = 0, MESSAGE = 1, LOGOUT = 2 ,IMAGE= 3;

	private int type;

	private String message;



	// constructor

	ChatMessage(int type, String message) {

		this.type = type;

		this.message = message;

	}



	// getters

	int getType() {

		return type;

	}

	String getMessage() {

		return message;

	}

}