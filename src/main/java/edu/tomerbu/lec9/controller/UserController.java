package edu.tomerbu.lec9.controller;

import edu.tomerbu.lec9.dto.UserResponseDTO;
import edu.tomerbu.lec9.dto.UserSignupDTO;
import edu.tomerbu.lec9.service.UserService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/user")
public class UserController {

    private final UserService userService;

    @PostMapping()
    public ResponseEntity<UserResponseDTO> signup(@RequestBody @Valid UserSignupDTO dto, UriComponentsBuilder uriBuilder) {
        var saved = userService.signUp(dto);

        var uri = uriBuilder.path("/api/v1/user/{id}").buildAndExpand(saved.getId()).toUri();

        return ResponseEntity.created(uri).body(saved);
    }
}
