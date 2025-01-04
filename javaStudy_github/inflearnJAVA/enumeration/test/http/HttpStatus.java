package enumeration.test.http;

public enum HttpStatus {
    OK(200,"OK"), BAD_REQUEST(400,"Bad Request"), NOT_FOUND(404,"Not Found"), INTERNAL_SERVER_ERROR(500, "Internal Server Error");

    private final int code;
    private final String message;

    HttpStatus(int code, String message) {
        this.code = code;
        this.message = message;
    }



    public int getCode(){
        return code;
    }

    public String getMessage(){
        return message;
    }

    public static HttpStatus findByCode(int code) {
        // 이 방식을 생각해내지 못했음!!
        // 그리고 그냥 values() 써도 되는 것인지?
        // -> HttpStatus.values()에서 HttpStatus. 생략됨!!!
        for (HttpStatus status : values()) {// HttpStatus[] values = values(); 와 HttpStatus status : values 이거 인라인으로 합칠 수 있음
            if (status.getCode() == code) {
                return status;
            }
        }
        return null;
    }

    public boolean isSuccess() {
        return (200 <= code && code < 300);
    }
}
