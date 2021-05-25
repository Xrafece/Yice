package com.xrafece.yice.entity;

import lombok.Data;

import javax.persistence.Id;

/**
 * @author Xrafece
 */
@Data
public class Admin {
    @Id
    Integer id;
    String username;
    String password;
}
