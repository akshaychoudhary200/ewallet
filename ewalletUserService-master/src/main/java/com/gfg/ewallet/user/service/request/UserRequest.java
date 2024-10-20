package com.gfg.ewallet.user.service.request;

import com.gfg.ewallet.user.domain.MyUser;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UserRequest {

    private String username;

    private String email;

    private String mobile;

    public MyUser toUser(){
        return MyUser.builder().username(username).email(email).mobile(mobile).build();
    }


}
