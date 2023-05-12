package bo.edu.ucb.sis213.internship.backend.entity;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "INTERNSHIP")
public class Internship {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "INTERNSHIP_ID")
    private Long internshipId;

    @Column(name = "COMPANY_ID", nullable = false)
    private int companyId;

    @Column(name = "TITLE", nullable = false, length = 30)
    private String title;

    @Column(name = "DESCRIPTION", nullable = false, length = 100)
    private String description;

    @Column(name = "DEADLINE", nullable = false)
    private Date deadline;

    @Column(name = "CREATE_DATE", nullable = false)
    private Date createDate;

    @Column(name = "STATUS", nullable = false)
    private boolean status;

    @Version
    @Column(name = "VERSION", nullable = false)
    private int version;

    @Column(name = "TX_DATE", nullable = false)
    private Date txDate;

    @Column(name = "TX_USER", nullable = false, length = 200)
    private String txUser;

    @Column(name = "TX_HOST", nullable = false, length = 200)
    private String txHost;

    // Constructor, getters, and setters

    // Constructor vacío (obligatorio para JPA)
    public Internship() {}

    // Constructor con los campos requeridos
    public Internship(int companyId, String title, String description, Date deadline, Date createDate,
                      boolean status, int version, Date txDate, String txUser, String txHost) {
        this.companyId = companyId;
        this.title = title;
        this.description = description;
        this.deadline = deadline;
        this.createDate = createDate;
        this.status = status;
        this.version = version;
        this.txDate = txDate;
        this.txUser = txUser;
        this.txHost = txHost;
    }

    public Long getInternshipId() {
        return internshipId;
    }

    public void setInternshipId(Long internshipId) {
        this.internshipId = internshipId;
    }

    public int getCompanyId() {
        return companyId;
    }

    public void setCompanyId(int companyId) {
        this.companyId = companyId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getDeadline() {
        return deadline;
    }

    public void setDeadline(Date deadline) {
        this.deadline = deadline;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public int getVersion() {
        return version;
    }

    public void setVersion(int version) {
        this.version = version;
    }

    public Date getTxDate() {
        return txDate;
    }

    public void setTxDate(Date txDate) {
        this.txDate = txDate;
    }

    public String getTxUser() {
        return txUser;
    }

    public void setTxUser(String txUser) {
        this.txUser = txUser;
    }

    public String getTxHost() {
        return txHost;
    }

    public void setTxHost(String txHost) {
        this.txHost = txHost;
    }

    @Override
    public String toString() {
        return "Internship{" +
                "internshipId=" + internshipId +
                ", companyId=" + companyId +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", deadline=" + deadline +
                ", createDate=" + createDate +
                ", status=" + status +
                ", version=" + version +
                ", txDate=" + txDate +
                ", txUser='" + txUser + '\'' +
                ", txHost='" + txHost + '\'' +
                '}';
    }
}
