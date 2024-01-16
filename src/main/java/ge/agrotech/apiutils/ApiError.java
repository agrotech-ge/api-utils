package ge.agrotech.apiutils;

import lombok.Data;

@Data
public class ApiError {
    private String keyword;

    private Language language;

    @Data
    public static class Language {
        private String ka;
    }
}
