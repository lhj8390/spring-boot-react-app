package com.lhj8390.dashboard.service;

import com.lhj8390.dashboard.model.dto.user.AuthResponseDTO;
import com.lhj8390.dashboard.model.dto.user.JoinRequestDTO;
import com.lhj8390.dashboard.model.dto.user.LoginRequestDTO;
import org.springframework.stereotype.Service;

@Service
public interface AuthService {

    AuthResponseDTO login(LoginRequestDTO dto);

    void join(JoinRequestDTO dto);
}
