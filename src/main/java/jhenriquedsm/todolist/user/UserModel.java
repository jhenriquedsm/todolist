package jhenriquedsm.todolist.user;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data // Getters and Setters
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class UserModel {
    private String username;
    private String name;
    private String password;
}
