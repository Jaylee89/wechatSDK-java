package com.bbeerr.wechat.base.service;

import java.util.Map;

public interface IMessageService {

	public  Object bulidBaseMessage(Map<String, String> requestMap, String msgType);
	
	public String bulidSendMessage(Object obj, String msgType);
	
	
}
