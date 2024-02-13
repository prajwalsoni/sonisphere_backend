//package com.soni.service;
//
//import java.util.List; 
//
//import com.soni.exception.ChatException;
//import com.soni.exception.MessageException;
//import com.soni.exception.UserException;
//import com.soni.model.Message;
//import com.soni.request.SendMessageRequest;
//
//public interface MessageService  {
//	
//	public Message sendMessage(SendMessageRequest req) throws UserException, ChatException;
//	
//	public List<Message> getChatsMessages(Integer chatId) throws ChatException;
//	
//	public Message findMessageById(Integer messageId) throws MessageException;
//	
//	public String deleteMessage(Integer messageId) throws MessageException;
//
//}
