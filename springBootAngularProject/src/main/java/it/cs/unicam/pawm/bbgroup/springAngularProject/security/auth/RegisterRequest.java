package it.cs.unicam.pawm.bbgroup.springAngularProject.security.auth;

import it.cs.unicam.pawm.bbgroup.springAngularProject.model.user.Role;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class RegisterRequest {

  private String firstname;
  private String lastname;
  private String email;
  private String password;
  private Role role;
}
