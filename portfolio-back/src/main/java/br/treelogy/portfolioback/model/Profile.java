package br.treelogy.portfolioback.model;

import javax.persistence.*;

@Entity
@Table(uniqueConstraints = @UniqueConstraint(columnNames = "id", name = "profile_id"))
public class Profile {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String linkLinkedin;
    private String linkGithub;
    private String linkEmail;
    private String photoHome;
    private String photoAbout;
    private String linkCurriculum;

    public String getLinkLinkedin() {
        return linkLinkedin;
    }

    public void setLinkLinkedin(String linkLinkedin) {
        this.linkLinkedin = linkLinkedin;
    }

    public String getLinkGithub() {
        return linkGithub;
    }

    public void setLinkGithub(String linkGithub) {
        this.linkGithub = linkGithub;
    }

    public String getLinkEmail() {
        return linkEmail;
    }

    public void setLinkEmail(String linkEmail) {
        this.linkEmail = linkEmail;
    }

    public String getPhotoHome() {
        return photoHome;
    }

    public void setPhotoHome(String photoHome) {
        this.photoHome = photoHome;
    }

    public String getPhotoAbout() {
        return photoAbout;
    }

    public void setPhotoAbout(String photoAbout) {
        this.photoAbout = photoAbout;
    }

    public String getLinkCurriculum() {
        return linkCurriculum;
    }

    public void setLinkCurriculum(String linkCurriculum) {
        this.linkCurriculum = linkCurriculum;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
