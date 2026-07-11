package com.fran.chiodi.web;

import jakarta.persistence.Entity; //JPA entity, looks the whole class and maps it to a table on the db
import jakarta.persistence.GeneratedValue;//create unique id selectors for each elemnt of the talbe
import jakarta.persistence.GenerationType;//Enum, strategy of the number name creation for the ids on the db
import jakarta.persistence.Id;//label for specific variable in the class, it made primary keys (unique identifier for each row)
import lombok.Data;//generate this J methods: getters and setters -> getiD(), setId(), getName(), toString(to show data)
import lombok.NoArgsConstructor;//if i dont provide a empty Cons, the db will crash
import lombok.AllArgsConstructor;//forces lombok to create a cons that inlcude every variable on my class
@Entity;
@Table(name="pics");
@Data;
@NoArgsConstructor;
public class Pics{
    @Id
    @GeneratedValue(strastegy = GenerationType.IDENTITY)

}
