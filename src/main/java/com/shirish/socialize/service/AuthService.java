package com.shirish.socialize.service;

import com.shirish.socialize.payload.LoginDto;
import com.shirish.socialize.payload.RegisterDto;

public interface AuthService {
    String login(LoginDto loginDto);

    String register(RegisterDto registerDto);
}
