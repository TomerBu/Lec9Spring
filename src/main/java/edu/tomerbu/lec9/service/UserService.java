package edu.tomerbu.lec9.service;

import edu.tomerbu.lec9.dto.UserResponseDTO;
import edu.tomerbu.lec9.dto.UserSignupDTO;
import edu.tomerbu.lec9.entity.User;
import edu.tomerbu.lec9.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import lombok.val;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepository userRepository;
    private final ModelMapper modelMapper;

    public UserResponseDTO signUp(UserSignupDTO dto) {
        val userEntity = modelMapper.map(dto, User.class);

        var saved = userRepository.save(userEntity);

        return modelMapper.map(saved, UserResponseDTO.class);
    }
}
