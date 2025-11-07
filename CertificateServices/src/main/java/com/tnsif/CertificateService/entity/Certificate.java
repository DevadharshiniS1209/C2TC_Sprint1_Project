package com.tnsif.CertificateService.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "certificate")
public class Certificate {

    @Id
    @Column(name = "certificate_id")
    private int certificateId;

    @Column(name = "student_name")
    private String studentName;

    @Column(name = "course_name")
    private String courseName;

    @Column(name = "college_name")
    private String collegeName;

    @Column(name = "issue_date")
    private String issueDate;

    @Column(name = "valid_until")
    private String validUntil;

    @Column(name = "status")
    private String status;

    public Certificate() {}

    public Certificate(int certificateId, String studentName, String courseName,
                       String collegeName, String issueDate, String validUntil, String status) {
        this.certificateId = certificateId;
        this.studentName = studentName;
        this.courseName = courseName;
        this.collegeName = collegeName;
        this.issueDate = issueDate;
        this.validUntil = validUntil;
        this.status = status;
    }

    // Getters and Setters
    public int getCertificateId() { return certificateId; }
    public void setCertificateId(int certificateId) { this.certificateId = certificateId; }
    public String getStudentName() { return studentName; }
    public void setStudentName(String studentName) { this.studentName = studentName; }
    public String getCourseName() { return courseName; }
    public void setCourseName(String courseName) { this.courseName = courseName; }
    public String getCollegeName() { return collegeName; }
    public void setCollegeName(String collegeName) { this.collegeName = collegeName; }
    public String getIssueDate() { return issueDate; }
    public void setIssueDate(String issueDate) { this.issueDate = issueDate; }
    public String getValidUntil() { return validUntil; }
    public void setValidUntil(String validUntil) { this.validUntil = validUntil; }
    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }
}
