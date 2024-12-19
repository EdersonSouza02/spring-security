package tech.buildrun.springsecurity.dto;

public record LoginResponse(String acessToken, Long expiresIn) {
}
