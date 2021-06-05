package com.swchoi.webservice.springboot.domain.positions;

import com.swchoi.webservice.springboot.domain.BaseTimeEntity;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter
@NoArgsConstructor
@Entity
public class Positions extends BaseTimeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 500, nullable = false)
    private String job_title;

    @Column(columnDefinition = "TEXT", nullable = false)
    private String job_description;

    @Column(length = 500, nullable = false)
    private String hiring_firm;

    @Builder
    public Positions(String job_title, String job_description, String hiring_firm) {
        this.job_title = job_title;
        this.job_description = job_description;
        this.hiring_firm = hiring_firm;
    }

    public void update(String job_title, String job_description) {
        this.job_title = job_title;
        this.job_description = job_description;
    }
}