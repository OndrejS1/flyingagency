package flyingagency.oar.objected.flyingagency.model;

import lombok.Data;
import org.hibernate.validator.constraints.Length;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.validation.constraints.Email;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.Date;

@Data
@Document(collection = "passengers")
public class Passenger implements Serializable {

    @Id
    private String passengerId;

    @NotNull(message = "first name cannot be null")
    private String firstName;

    @Min(2)
    @Max(100)
    private int age;

    @NotNull(message = "last name cannot be null")
    private String lastName;

    @NotNull(message = "nationality cannot be null")
    private Nationality nationality;

    @NotNull(message = "date of birth cannot be null")
    private Date dateOfBirth;

    @Email
    private String email;

    @NotNull(message = "phone cannot be null")
    private String phone;
}
