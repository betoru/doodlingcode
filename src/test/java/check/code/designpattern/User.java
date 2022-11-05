package check.code.designpattern;

import lombok.*;

import java.util.List;

@Getter
@Setter
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class User {
    private long idx;
    private String username;
    private String email;
    private List<String> roles;
}
