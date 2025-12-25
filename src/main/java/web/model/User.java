package web.model;

import javax.persistence.*;

import javax.validation.constraints.*;


@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    @NotBlank(message = "Name cannot be empty")
    @Pattern(
            regexp = "^[^0-9]+$",
            message = "Name cannot include numbers"
    )
    private String firstName;

    @Column(name = "last_name")
    @NotBlank(message = "Last name cannot be empty")
    @Pattern(
            regexp = "^[^0-9]+$",
            message = "Фамилия не должна включать в себя цифры"
    )

    private String lastName;

    @Column(name = "email")
    @NotBlank(message = "Email cannot be empty")
    @Email(message = "Wrong email")
    private String email;

    public User() {}

    public User(String firstName, String lastName, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }

    public String toString() {
        return firstName + " " + lastName;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


}
