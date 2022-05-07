package com.example.major_register.controller.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;


@Entity
@Table(name = "t_mon_hoc_ki_hoc")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class MonHocKiHoc {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @ManyToOne
    @JoinColumn(name = "mon_hoc_id",nullable = false)
    private MonHoc monHoc;
    @ManyToOne
    @JoinColumn(name = "ki_hoc_id",nullable = false)
    private KiHoc KiHoc;
}
