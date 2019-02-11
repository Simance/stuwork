package com.doo.pojo;

public class ExamScore {
    private Integer id;

    private Integer stuId;

    private Integer score;

    public ExamScore(Integer id, Integer stuId, Integer score) {
        this.id = id;
        this.stuId = stuId;
        this.score = score;
    }

    public ExamScore() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getStuId() {
        return stuId;
    }

    public void setStuId(Integer stuId) {
        this.stuId = stuId;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }
}