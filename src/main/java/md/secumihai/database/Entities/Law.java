package md.secumihai.database.Entities;

import javax.persistence.*;
import java.sql.Blob;
import java.sql.Clob;
import java.time.LocalDate;
import java.util.Date;

/***
     THIS IS A ENTITY CLASS WHERE WILL BE MAPPED AND KEEPED ALL THE CHANGES
     ABOUT LEGE NR. 172 DIN 25-07-2014
     PRIVIND APROBAREA NOMENCLATURII COMBINATE A MĂRFURILOR
 ***/
@Entity
@Table(name = "Law")
public class Law {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private long id;

    @Column(name = "description")
    private String description;

    @Column(name = "initial_date")
    private LocalDate intialDate;

    @Column(name = "final_date")
    private LocalDate finalDate;

    @Lob
    @Column(name = "content", columnDefinition="BLOB")
    private byte[] content;

    public Law() {

    }

    public Law( String description, LocalDate intialDate, LocalDate finalDate, byte [] content) {
        this.description = description;
        this.intialDate = intialDate;
        this.finalDate = finalDate;
        this.content = content;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDate getIntialDate() {
        return intialDate;
    }

    public void setIntialDate(LocalDate intialDate) {
        this.intialDate = intialDate;
    }

    public LocalDate getFinalDate() {
        return finalDate;
    }

    public void setFinalDate(LocalDate finalDate) {
        this.finalDate = finalDate;
    }

    public byte[] getContent() {
        return content;
    }

    public void setContent(byte[] content) {
        this.content = content;
    }
}