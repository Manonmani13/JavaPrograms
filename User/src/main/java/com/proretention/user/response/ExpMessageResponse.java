package com.proretention.user.response;


import org.springframework.stereotype.Component;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Component
public class ExpMessageResponse {

private int status;
private String message;
private ResponseModel data;

}