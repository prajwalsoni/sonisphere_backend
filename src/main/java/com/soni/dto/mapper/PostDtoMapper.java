//package com.soni.dto.mapper;
//
//import java.util.ArrayList; 
//import java.util.List;
//
//import com.soni.dto.CommentDto;
//import com.soni.dto.PostDto;
//import com.soni.dto.UserDto;
//import com.soni.model.Post;
//import com.soni.model.User;
//import com.soni.utils.PostUtils;
//
//public class PostDtoMapper {
//	
//	public static PostDto toPostDto(Post post,User user) {
//		
//		UserDto userDto=UserDtoMapper.userDTO(post.getUser());
//		List<User> likedUsers=new ArrayList<>(post.getLiked());
//		List<UserDto> userDtos=UserDtoMapper.userDTOS(likedUsers);
//		List<CommentDto> comments=CommentDtoMapper.toCommentDtos(post.getComments());
//		
//		PostDto postDto=new PostDto();
//		postDto.setCaption(post.getCaption());
//		postDto.setCreatedAt(post.getCreatedAt());
//		postDto.setId(post.getId());
//		postDto.setImage(post.getImage());
//		postDto.setUser(userDto);
//		postDto.setLiked(userDtos);
//		postDto.setComments(comments);
//		postDto.setLikedByRequser(PostUtils.isLikedByReqUser(post, user));
//		postDto.setSavedByRequser(PostUtils.isSaved(post, user));
//		
//		return postDto;
//		
//	}
//	
//	public static List<PostDto> toPostDtos(List<Post> posts, User user){
//		List<PostDto> postDtos=new ArrayList<>();
//		
//		for(Post post:posts) {
//			PostDto postDto=toPostDto(post,user);
//			postDtos.add(postDto);
//		}
//		return postDtos;
//	}
//
//}
