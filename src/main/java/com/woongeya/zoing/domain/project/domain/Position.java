package com.woongeya.zoing.domain.project.domain;

import com.woongeya.zoing.domain.project.presetation.dto.request.CreateProjectRequestDto;
import lombok.*;

import javax.persistence.*;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
@Table
public class Position {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "project_id")
    private Project project;

    @Builder
    public Position(String name, Project project) {
        this.name = name;
        this.project = project;
    }

    public void update(CreateProjectRequestDto request) {
        this.name = request.getName();
    }
}
