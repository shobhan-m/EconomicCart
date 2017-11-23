package com.nisum.economycart.app.util;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.collections4.CollectionUtils;
import org.apache.commons.lang3.ObjectUtils;

import com.nisum.economycart.app.domain.User;
import com.nisum.economycart.app.dto.UserDto;




public class UserServiceUtil {
	public static List<UserDto> convertDaoTODto(List<User> userList) {
		List<UserDto> userDtos = new ArrayList<>();
		
		if (CollectionUtils.isNotEmpty(userList)) {
			userList.forEach(u->{
			UserDto userDto=new UserDto();
			userDto.setUserId(u.getUserId());
			userDto.setEmailId(u.getEmailId());
			userDto.setName(u.getName());
			userDto.setPassword(u.getPassword());
			userDto.setLoginDate(u.getLoginDate());
			userDto.setActiveStatus(u.getActiveStatus());
			userDtos.add(userDto);
			});
		}
		return userDtos;

	}

	public static UserDto convertDaoToDtoInstance(User user) {

		UserDto userDto = new UserDto();
		if (ObjectUtils.anyNotNull(user)) {
			userDto.setUserId(user.getUserId());
			userDto.setEmailId(user.getEmailId());
			userDto.setName(user.getName());
			userDto.setPassword(user.getPassword());
			userDto.setLoginDate(user.getLoginDate());
			userDto.setActiveStatus(user.getActiveStatus());
		}
		return userDto;
	}

	public static User convertDtoTODao(UserDto userDto) {

		User user = new User();
		if(ObjectUtils.anyNotNull(userDto)) {
			user.setUserId(userDto.getUserId());
			user.setEmailId(userDto.getEmailId());
			user.setName(userDto.getName());
			user.setPassword(user.getPassword());
			user.setLoginDate(userDto.getLoginDate());
			user.setActiveStatus(userDto.getActiveStatus());
		}
		return user;

	}
}
