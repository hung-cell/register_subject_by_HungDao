package com.example.major_register.controller.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;


@Entity
@Table(name = "t_nam_hoc")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class NamHoc {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String ten;
}
