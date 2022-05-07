package com.example.major_register.controller.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;


@Entity
@Table(name = "t_ki_hoc")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class KiHoc {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private boolean dangHoc;
    private boolean dangDk;
//    @OneToMany(fetch = FetchType.EAGER)
//    @JoinColumn(name = "khoa_id", referencedColumnName = "id")
//    private List<BoMon> listBoMon;
//
//    @OneToMany(fetch = FetchType.LAZY)
//    @JoinColumn(name = "khoa_id", referencedColumnName = "id")
//    private List<SinhVienKhoa> listSinhVienKhoa;
}
