public class KLTN<T extends Student, V extends ISupervisor> implements Comparable<KLTN<?, ?>> {
    private T student;
    private V supervisor;
    private String tenDetai;
    public KLTN(T student, V supervisor, String tenDetai) {
        this.student = student;
        this.supervisor = supervisor;
        this.tenDetai = tenDetai;
    }

    public T getStudent() {
        return student;
    }

    public V getSupervisor() {
        return supervisor;
    }    
    public String getTenDetai() {
        return tenDetai;
    }

    public void setStudent(T student) {
        this.student = student;
    }

    public void setSupervisor(V supervisor) {
        this.supervisor = supervisor;
    }

    public void setTenDetai(String tenDetai) {
        this.tenDetai = tenDetai;
    }

    public String toString() {
        return "KLTN{" +
                "student=" + student.getFullname() +
                ", supervisor=" + supervisor.getFullname() +
                ", tenDetai='" + tenDetai + '\'' +
                '}';
    }

    public int compareTo(KLTN<?, ?> other) {
        return this.tenDetai.compareTo(other.tenDetai);
    }
}
