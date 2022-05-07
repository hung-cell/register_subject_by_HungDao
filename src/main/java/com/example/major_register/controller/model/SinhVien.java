package com.example.major_register.controller.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "t_sinh_vien")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class SinhVien {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String userName;
    private String password;
    private Date ngaySinh;
    private String email;
    private String diaChi;
    private String soDienThoai;
    @OneToMany(fetch = FetchType.LAZY)
    @JoinColumn(name = "sinh_vien_id", referencedColumnName = "id")
    private List<SinhVienKhoa> listSinhVienKhoa;
}
