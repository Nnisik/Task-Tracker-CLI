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

    public void updateStatus() {
        this.updatedAt = LocalDate.now();
        switch(this.status) {
            case "todo":
                this.status = "in-progress";
                break;

            case "in-progress":
                this.status = "done";
                break;
        }
    }
}
