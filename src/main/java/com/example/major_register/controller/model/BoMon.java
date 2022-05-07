package com.example.major_register.controller.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "t_bo_mon")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class BoMon {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String ten;
    @ManyToOne
    @JoinColumn(name = "khoa_id",nullable = false)
    private Khoa khoa;

    @OneToMany(fetch = FetchType.EAGER)
    @JoinColumn(name = "giao_vien_id", referencedColumnName = "id")
    private List<GiangVien> listGiangVien;

    @OneToMany(fetch = FetchType.LAZY)
    @JoinColumn(name = "mon_hoc_id", referencedColumnName = "id")
    private List<MonHoc> listMonHoc;

}
