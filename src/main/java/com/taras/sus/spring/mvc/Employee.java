package com.taras.sus.spring.mvc;

import com.taras.sus.spring.mvc.validation.CheckEmail;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.validation.constraints.*;
import java.util.HashMap;
import java.util.Map;

@Getter
@Setter
@ToString
public class Employee {
    @Size(min = 2, message = "Minimum 2 symbols for field name")
    private String name;
    @NotBlank(message = "Surname is required field")
    private String surname;
    @Min(value = 0, message = "Salary can't be negative")
    @Max(value = 25000, message = "Don't be a liar!")
    private int salary;
    private String department;
    private String favouriteAnimal;
    private String car;
    private String carMessage;
    private Map<String, String> animals;
    private String[] languages;
    @Pattern(
            regexp = "\\+380\\d{9}",
            message = "Use Ukrainian phone number")
    private String phoneNumber;
    @CheckEmail
    private String email;

    Employee() {
        animals = new HashMap<>();
        animals.put("https://secure.img1-fg.wfcdn.com/im/53299221/compr-r85/4307/43074449/hanging-pug-puppy-statue.jpg", "dog");
        animals.put("https://i.ytimg.com/vi/1Ne1hqOXKKI/maxresdefault.jpg", "cat");
        animals.put("https://wehco.media.clients.ellingtoncms.com/img/photos/2019/09/16/192968787_0916owls.jpg", "owl");
    }

}
