package com.example.major_register.controller.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "t_dang_ki_hoc")
public class DangKiHoc {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @ManyToOne
    @JoinColumn(name = "sinh_vien_khoa_id",nullable = false)
    private SinhVienKhoa sinhVienKhoa;
    @ManyToOne
    @JoinColumn(name = "lop_hoc_phan_id",nullable = false)
    private LopHocPhan lopHocPhan;
}
