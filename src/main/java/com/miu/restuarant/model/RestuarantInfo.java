package com.miu.restuarant.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@ToString

@Document(collation = "restuarantInfo")
public class RestuarantInfo {
    @Id
    private int id;
    private String title;
    private String location;
    private String description;
}
