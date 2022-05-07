package com.example.major_register.controller.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;


@Entity
@Table(name = "t_mon_hoc")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class MonHoc {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String ten;
    private int soTC;
    @OneToMany
    @JoinColumn(name = "mon_hoc_tien_quuyet_id",nullable = false)
    private List<MonHoc>  listMonHocTienQuyet;
}
