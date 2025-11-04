public class Advisor implements ISupervisor {
    private String fullname;
    private String email;
    // còn người hướng dẫn không có ID
    public Advisor(String fullname, String email) {
        this.fullname = fullname;
        this.email = email;
    }
    // Getter và Setter cho các thuộc tính
    public String getFullname() {
        return fullname;
    }

    public String getEmail() {
        return email;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
