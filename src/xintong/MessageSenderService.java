package xintong;

import java.io.IOException;

import leo.Node;

public class MessageSenderService implements IsendMessage{
	Node node=null;
	private static MessageSenderService instance = new MessageSenderService();
	public static MessageSenderService getInstance(){
		return instance;
	}
	public void connectNode(Node node) throws IOException{
		this.node=node;
	}
	
	@Override
	public void send(String message, int channelID) {
		
		
		
	}



}
