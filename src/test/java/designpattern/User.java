package designpattern;

import lombok.*;

import java.util.List;

@Data
@Builder
public class User {
    private long idx;
    private String username;
    private String email;
    private List<String> roles;
}
