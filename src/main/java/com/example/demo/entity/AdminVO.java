package com.example.demo.entity;

import java.io.Serializable;

/**
 * Created by Administrator on 2019/6/11.
 */
public class AdminVO implements Serializable {

    private Integer id;

    private String name;

    private Integer studentCount;

    private Integer teacherCount;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getStudentCount() {
        return studentCount;
    }

    public void setStudentCount(Integer studentCount) {
        this.studentCount = studentCount;
    }

    public Integer getTeacherCount() {
        return teacherCount;
    }

    public void setTeacherCount(Integer teacherCount) {
        this.teacherCount = teacherCount;
    }
}
