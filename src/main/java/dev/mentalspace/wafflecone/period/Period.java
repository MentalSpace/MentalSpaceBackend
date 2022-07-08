package dev.mentalspace.wafflecone.period;

public class Period {
    public Long periodId;
    public Long teacherId;
    public Long subjectId;
    public Integer period;
    public String classCode;
    public boolean archived;

    boolean regenerateClassCode;
    boolean archivedOnly;
    
    public void setRegenerateClassCode(boolean regenerateClassCode) {
        this.regenerateClassCode = regenerateClassCode;
    }
    public void setArchivedOnly(boolean archivedOnly) {
        this.archivedOnly = archivedOnly;
    }

    public Period() {
    }
}
