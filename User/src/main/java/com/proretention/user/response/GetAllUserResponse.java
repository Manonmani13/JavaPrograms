package com.proretention.user.response;

import java.util.List;

import org.springframework.stereotype.Component;

import com.proretention.user.entity.UserEntity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Component
@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class GetAllUserResponse
{
    private List<UserModelResponseModel> entity;
//	private List<UserModelResponseModel> response;
	private long totalcount;
	private int totalpages;
	private int currentpage;
}
