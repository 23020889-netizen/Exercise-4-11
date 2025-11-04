public class Teacher implements ISupervisor {
    private String fullname;
    private int ID;
    private String email;
    private String title; // Chức danh giảng viên

    public Teacher(String fullname, int ID, String email, String title) {
        this.fullname = fullname;
        this.ID = ID;
        this.email = email;
        this.title = title;
    }

    // Getter và Setter cho các thuộc tính
    public String getFullname() {
        return fullname;
    }

    public int getID() {
        return ID;
    }

    public String getEmail() {
        return email;
    }

    public String getTitle() {
        return title;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setTitle(String title) {
        this.title = title;
    }

}
