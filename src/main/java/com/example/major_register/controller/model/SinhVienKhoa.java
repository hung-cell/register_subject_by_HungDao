package com.example.major_register.controller.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "t_sinh_vien_khoa")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class SinhVienKhoa {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String nienKhoa;
    @ManyToOne
    @JoinColumn(name = "khoa_id",nullable = false)
    private Khoa khoa;
    @ManyToOne
    @JoinColumn(name = "sinh_vien_id",nullable = false)
    private SinhVien sinhVien;
}
