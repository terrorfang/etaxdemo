package com.pccth.questionnaire.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "CUST_QUESTIONNAIRE")
public class Questionnaire {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long cqid;
    private String age;
    private String gender;
    private String EDUCATION;
    private String OCCUPATION;
    private String CURRENTUSER;
    private String FUTUREINTERESTING;
    private String POLICYTERMS;
    private String REASONAVAILABILITY;
    private String SUPPORTREQUEST;
    private String SATIS_BENEFITS;
    private String SATIS_PERFORMANCES;
    private String SATIS_COMPANIES;
    private String SATIS_RELIABLE;
    private String SATIS_CONFIDENCES;
    private String SATISFACTIONOVERALL;
    private String SUGGESTION;

    public Questionnaire() {
    }

    public Questionnaire(String age, String gender, String eDUCATION, String oCCUPATION, String cURRENTUSER,
            String fUTUREINTERESTING, String pOLICYTERMS, String rEASONAVAILABILITY, String sUPPORTREQUEST,
            String sATIS_BENEFITS, String sATIS_PERFORMANCES, String sATIS_COMPANIES, String sATIS_RELIABLE,
            String sATIS_CONFIDENCES, String sATISFACTIONOVERALL, String sUGGESTION) {
        this.age = age;
        this.gender = gender;
        EDUCATION = eDUCATION;
        OCCUPATION = oCCUPATION;
        CURRENTUSER = cURRENTUSER;
        FUTUREINTERESTING = fUTUREINTERESTING;
        POLICYTERMS = pOLICYTERMS;
        REASONAVAILABILITY = rEASONAVAILABILITY;
        SUPPORTREQUEST = sUPPORTREQUEST;
        SATIS_BENEFITS = sATIS_BENEFITS;
        SATIS_PERFORMANCES = sATIS_PERFORMANCES;
        SATIS_COMPANIES = sATIS_COMPANIES;
        SATIS_RELIABLE = sATIS_RELIABLE;
        SATIS_CONFIDENCES = sATIS_CONFIDENCES;
        SATISFACTIONOVERALL = sATISFACTIONOVERALL;
        SUGGESTION = sUGGESTION;
    }

    public Long getCqid() {
        return cqid;
    }

    public void setCqid(Long cqid) {
        this.cqid = cqid;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getEDUCATION() {
        return EDUCATION;
    }

    public void setEDUCATION(String eDUCATION) {
        EDUCATION = eDUCATION;
    }

    public String getOCCUPATION() {
        return OCCUPATION;
    }

    public void setOCCUPATION(String oCCUPATION) {
        OCCUPATION = oCCUPATION;
    }

    public String getCURRENTUSER() {
        return CURRENTUSER;
    }

    public void setCURRENTUSER(String cURRENTUSER) {
        CURRENTUSER = cURRENTUSER;
    }

    public String getFUTUREINTERESTING() {
        return FUTUREINTERESTING;
    }

    public void setFUTUREINTERESTING(String fUTUREINTERESTING) {
        FUTUREINTERESTING = fUTUREINTERESTING;
    }

    public String getPOLICYTERMS() {
        return POLICYTERMS;
    }

    public void setPOLICYTERMS(String pOLICYTERMS) {
        POLICYTERMS = pOLICYTERMS;
    }

    public String getREASONAVAILABILITY() {
        return REASONAVAILABILITY;
    }

    public void setREASONAVAILABILITY(String rEASONAVAILABILITY) {
        REASONAVAILABILITY = rEASONAVAILABILITY;
    }

    public String getSUPPORTREQUEST() {
        return SUPPORTREQUEST;
    }

    public void setSUPPORTREQUEST(String sUPPORTREQUEST) {
        SUPPORTREQUEST = sUPPORTREQUEST;
    }

    public String getSATIS_BENEFITS() {
        return SATIS_BENEFITS;
    }

    public void setSATIS_BENEFITS(String sATIS_BENEFITS) {
        SATIS_BENEFITS = sATIS_BENEFITS;
    }

    public String getSATIS_PERFORMANCES() {
        return SATIS_PERFORMANCES;
    }

    public void setSATIS_PERFORMANCES(String sATIS_PERFORMANCES) {
        SATIS_PERFORMANCES = sATIS_PERFORMANCES;
    }

    public String getSATIS_COMPANIES() {
        return SATIS_COMPANIES;
    }

    public void setSATIS_COMPANIES(String sATIS_COMPANIES) {
        SATIS_COMPANIES = sATIS_COMPANIES;
    }

    public String getSATIS_RELIABLE() {
        return SATIS_RELIABLE;
    }

    public void setSATIS_RELIABLE(String sATIS_RELIABLE) {
        SATIS_RELIABLE = sATIS_RELIABLE;
    }

    public String getSATIS_CONFIDENCES() {
        return SATIS_CONFIDENCES;
    }

    public void setSATIS_CONFIDENCES(String sATIS_CONFIDENCES) {
        SATIS_CONFIDENCES = sATIS_CONFIDENCES;
    }

    public String getSATISFACTIONOVERALL() {
        return SATISFACTIONOVERALL;
    }

    public void setSATISFACTIONOVERALL(String sATISFACTIONOVERALL) {
        SATISFACTIONOVERALL = sATISFACTIONOVERALL;
    }

    public String getSUGGESTION() {
        return SUGGESTION;
    }

    public void setSUGGESTION(String sUGGESTION) {
        SUGGESTION = sUGGESTION;
    }


}
