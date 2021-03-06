package com.example.springapp.Courses;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "courses")
public class CourseModel {
    @Id
    @GeneratedValue
    private long courseId;

    private String courseName;
    private String courseDescription;
    private String courseURL;
    private String bookURL;
    private String terminalURL;

    public CourseModel() {
    }

    public CourseModel(long courseId, String courseName, String courseDescription, String courseURL, String bookURL,
            String terminalURL) {
        this.courseId = courseId;
        this.courseName = courseName;
        this.courseDescription = courseDescription;
        this.courseURL = courseURL;
        this.bookURL = bookURL;
        this.terminalURL = terminalURL;
    }

    public long getCourseId() {
        return courseId;
    }

    public void setCourseId(long courseId) {
        this.courseId = courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseDescription() {
        return courseDescription;
    }

    public void setCourseDescription(String courseDescription) {
        this.courseDescription = courseDescription;
    }

    public String getCourseURL() {
        return courseURL;
    }

    public void setCourseURL(String courseURL) {
        this.courseURL = courseURL;
    }

    public String getBookURL() {
        return bookURL;
    }

    public void setBookURL(String bookURL) {
        this.bookURL = bookURL;
    }

    public String getTerminalURL() {
        return terminalURL;
    }

    public void setTerminalURL(String terminalURL) {
        this.terminalURL = terminalURL;
    }

}
