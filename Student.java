public class Student {
// Mỗi sinh viên có một người hướng dẫn (Teacher hoặc Advisor) để làm đề tài khoá luận
    private String fullname;
    private int ID;
    private String email;
    

    public Student(String fullname, int ID, String email) {
        this.fullname = fullname;
        this.ID = ID;
        this.email = email;
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


    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}