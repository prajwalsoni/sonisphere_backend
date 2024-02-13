//package com.soni.service;
//
//import java.time.LocalDateTime; 
//import java.util.Optional;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import com.soni.dto.UserDto;
//import com.soni.exception.CommentException;
//import com.soni.exception.PostException;
//import com.soni.exception.UserException;
//import com.soni.model.Comments;
//import com.soni.model.Post;
//import com.soni.model.User;
//import com.soni.repository.CommentRepository;
//import com.soni.repository.PostRepository;
//
//@Service
//public class CommentsServiceImplement implements CommentService {
//	
//	@Autowired
//	private CommentRepository repo;
//	
//	@Autowired
//	private UserService userService;
//	
//	@Autowired
//	private PostService postService;
//	
//	@Autowired
//	private PostRepository postRepo;
//
//	
//	
//	@Override
//	public Comments createComment(Comments comment, Integer postId, Integer userId) throws PostException, UserException {
//		
//		User user=userService.findUserById(userId);
//		
//		Post post=postService.findePostById(postId);
//		
//		comment.setUser(user);
//		comment.setCreatedAt(LocalDateTime.now());
//		Comments newComment= repo.save(comment);
//		
//		post.getComments().add(newComment);
//		
//		postRepo.save(post);
//		
//		return newComment;
//	}
//
//
//	@Override
//	public Comments findCommentById(Integer commentId) throws CommentException {
//		Optional<Comments> opt=repo.findById(commentId);
//		
//		if(opt.isPresent()) {
//			return opt.get();
//		}
//		throw new CommentException("comment not exist with id : "+commentId);
//	}
//
//	@Override
//	public Comments likeComment(Integer commentId, Integer userId) throws UserException, CommentException {
//	
//		User user=userService.findUserById(userId);
//		Comments comment=findCommentById(commentId);
//		
//		if(!comment.getLiked().contains(user)) {
//			comment.getLiked().add(user);
//		}
//		else 	comment.getLiked().remove(user);
//		
//
//		return repo.save(comment);
//		
//	}
//	
//	
//	
//
//}
