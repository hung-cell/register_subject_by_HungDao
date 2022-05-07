package com.example.major_register.controller.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "t_giang_vien")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class GiangVien {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private Date ngaySinh;
    private String email;
    private String diaChi;
    private String soDienThoai;

}
