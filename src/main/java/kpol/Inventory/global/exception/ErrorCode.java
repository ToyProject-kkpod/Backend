package kpol.Inventory.global.exception;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;

@Getter
@RequiredArgsConstructor
public enum ErrorCode {

    INTERNAL_SERVER_ERROR(HttpStatus.INTERNAL_SERVER_ERROR, 500, "서버 에러 발생"),

    // Board
    BOARD_NOT_FOUND(HttpStatus.NOT_FOUND, 404, "게시물 조회에 실패하였습니다."),

    // jwt Exception
    JWT_NOT_VALID(HttpStatus.UNAUTHORIZED, 401, "[Jwt] 유효하지 않은 Jwt"),
    JWT_ACCESS_TOKEN_EXPIRED(HttpStatus.UNAUTHORIZED, 419, "[Jwt] 만료된 엑세스 토큰입니다."),
    JWT_REFRESH_TOKEN_EXPIRED(HttpStatus.UNAUTHORIZED, 420, "[Jwt] 만료된 리프레시 토큰입니다."),
    JWT_MALFORMED(HttpStatus.UNAUTHORIZED, 401, "[Jwt] 잘못된 토큰 형식입니다."),
    JWT_SIGNATURE(HttpStatus.UNAUTHORIZED, 401, "[Jwt] 유효하지 않은 서명입니다."),
    JWT_UNSUPPORTED(HttpStatus.UNAUTHORIZED, 401, "[Jwt] 지원하지 않는 토큰입니다."),
    JWT_NOT_FOUND(HttpStatus.NOT_FOUND, 404, "[Jwt] 리프레시 토큰 조회 실패"),
    JWT_NOT_MATCH(HttpStatus.BAD_REQUEST, 400, "[Jwt] 리프레시 토큰 불일치"),

    // Member
    MEMBER_NOT_FOUND(HttpStatus.NOT_FOUND, 404, "맴버를 찾을 수 없습니다."),
    LOGIN_MEMBER_NOT_FOUND(HttpStatus.NOT_FOUND, 404, "존재하지 않는 이메일입니다."),
    PASSWORD_NOT_CORRECT(HttpStatus.BAD_REQUEST, 400, "비밀번호가 일치하지 않습니다."),
    EMAIL_DUPLICATED(HttpStatus.BAD_REQUEST, 400, "이메일이 중복되었습니다."),
    NICKNAME_DUPLICATED(HttpStatus.BAD_REQUEST, 400, "닉네임이 중복되었습니다."),
    LOGIN_FAILED(HttpStatus.UNAUTHORIZED, 401, "로그인이 실패하였습니다."),

    // Mail
    EMAIL_SEND_FAILED(HttpStatus.INTERNAL_SERVER_ERROR, 500, "이메일 전송 실패"),
    EMAIL_VERIFICATION_FAILED(HttpStatus.BAD_REQUEST, 400, "이메일 검증 실패"),
    EMAIL_AUTH_NUMBER_NOT_FOUND(HttpStatus.BAD_REQUEST, 400, "인증 번호가 유효하지 않습니다."),
    EMAIL_MISMATCH(HttpStatus.BAD_REQUEST, 400, "이메일이 일치하지 않습니다."),

    // RequestBody
    INVALID_PARAMS(HttpStatus.BAD_REQUEST, 400, "유효하지 않은 데이터가 전송되었습니다.");

    private final HttpStatus httpStatus;
    private final Integer code;
    private final String message;
}
