package org.oop.encapsulation;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import lombok.experimental.Accessors;
/*
Encapsulation is a mechanism that restricts direct access to some of an object's components.
Encapsulation is used to:
- Control the data that is stored in an object.
- Prevent the accidental modification of data.
- Hide the internal representation of an object.
- Provide a simple interface to interact with an object.
To encapsulate a class:
- Private fields with public getters (e.g., Customer class)
- Provide public setter and getter methods to modify and view the variables' values.
- Validation in setter methods*/

@Accessors(chain = true)
@Data
public class Customer {
  @NotBlank
  private String customerNumber;
  @NotNull
  private String fullName;
  private String address;
  @Email
  private String email;
  private String dateOfBirth;


  public void updateEmail(String email) {
    //TODO: Add email validation
    this.email = email;
  }

}
