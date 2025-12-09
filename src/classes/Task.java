package classes;

import java.time.LocalDate;

public class Task {

    private String description;
    private String status = "todo";
    private LocalDate createdAt;
    private LocalDate updatedAt;

    public Task(String description) {
        this.description = description;
        this.createdAt = LocalDate.now();
    }

    public String getDescription() {
        return this.description;
    }

    public void updateDescription(String description) {
        this.description = description;
        this.updatedAt = LocalDate.now();
    }

    public String getStatus() {
        return this.status;
    }

    public void updateStatus(String newStatus) {
        this.updatedAt = LocalDate.now();
        this.status = newStatus;
    }
}
