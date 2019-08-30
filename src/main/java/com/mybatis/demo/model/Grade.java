package com.mybatis.demo.model;

public class Grade
{
    public String GradeId;
    public String GradeName;

    public String getGradeLevel() {
        return GradeLevel;
    }

    public void setGradeLevel(String gradeLevel) {
        GradeLevel = gradeLevel;
    }

    public String GradeNuM;
    public String GradeLevel;

    public String getGradeId() {
        return GradeId;
    }

    public void setGradeId(String gradeId) {
        GradeId = gradeId;
    }

    public String getGradeName() {
        return GradeName;
    }

    public void setGradeName(String gradeName) {
        GradeName = gradeName;
    }

    public String getGradeNuM() {
        return GradeNuM;
    }

    public void setGradeNuM(String gradeNuM) {
        GradeNuM = gradeNuM;
    }
}
