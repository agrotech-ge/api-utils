package ge.agrotech.apiutils;

import lombok.Data;

import java.util.Map;

@Data

public class ApplicationInfo {
    private String keyword;
    private Map<String, Object> meta;
}
