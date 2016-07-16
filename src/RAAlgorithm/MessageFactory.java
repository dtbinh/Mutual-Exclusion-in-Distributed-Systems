package RAAlgorithm;


class MessageFactory {
	
	static MessageFactory single = new MessageFactory();
	public static MessageFactory getSingleton(){
		return single;
	}
	

	public Message getMessage(String method){
		return new Message(method);
	}
	
	public Message parseMessage(String str){
		Message res=null;
		System.out.println("debug: receive msg"+str);
		String[] strArray = str.trim().split(";");
		for(String s:strArray){
			if(s.toLowerCase().startsWith("method:")){
				res = new Message(s.substring(7));
			}
			else if(s.toLowerCase().startsWith("clock:")){
				continue;
			}
			else{
				String[] avp = s.trim().split(":");	
				res.addAVP(avp[0], avp[1]);
			}
		}
		return res;
	}
	
}