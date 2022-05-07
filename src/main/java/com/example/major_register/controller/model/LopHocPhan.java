package com.example.major_register.controller.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;


@Entity
@Table(name = "t_lop_hoc_phan")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class LopHocPhan {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String ten;
    private int siSoToiDa;
    private int siSoThucTe;


}
