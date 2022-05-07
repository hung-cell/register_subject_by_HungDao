package com.example.major_register.controller.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;


@Entity
@Table(name = "t_hoc_ki")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class HocKi {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String ten;

    @ManyToOne
    @JoinColumn(name = "nam_hoc_id",nullable = false)
    private NamHoc namHoc;
    @ManyToOne
    @JoinColumn(name = "hoc_ki_id",nullable = false)
    private HocKi hocKi;
}
