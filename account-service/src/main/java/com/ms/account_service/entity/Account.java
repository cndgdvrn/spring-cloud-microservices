package com.ms.account_service.entity;


import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;
import java.util.Date;

@Data
@NoArgsConstructor
@ToString
@EqualsAndHashCode(of = {"id"})
@Document
public class Account implements Serializable {

    @Id
    private String id;

    @Indexed(unique = true)
    private String username;
    private String email;
    private String password;

    private Date createdAt = new Date();
    private Date updatedAt;
    private boolean active;


}
