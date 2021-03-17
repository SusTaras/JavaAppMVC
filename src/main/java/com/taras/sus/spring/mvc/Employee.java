package com.taras.sus.spring.mvc;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.HashMap;
import java.util.Map;

@Getter
@Setter
@ToString
public class Employee {
    private String name;
    private String surname;
    private int salary;
    private String department;
    private String favouriteAnimal;
    private String car;
    private String carMessage;
    private Map<String, String> animals;
    private String[] languages;

    Employee() {
        animals = new HashMap<>();
        animals.put("https://secure.img1-fg.wfcdn.com/im/53299221/compr-r85/4307/43074449/hanging-pug-puppy-statue.jpg", "dog");
        animals.put("https://i.ytimg.com/vi/1Ne1hqOXKKI/maxresdefault.jpg", "cat");
        animals.put("https://wehco.media.clients.ellingtoncms.com/img/photos/2019/09/16/192968787_0916owls.jpg", "owl");
    }

}
