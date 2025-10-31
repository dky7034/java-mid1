package enumeration.test;

public enum AuthGrade {
    GUEST(1, "손님"),
    LOGIN(2, "로그인 회원"),
    ADMIN(3, "관리자");

    private final int level;
    private final String Description;

    AuthGrade(int level, String Description) {
        this.level = level;
        this.Description = Description;
    }

    public int getLevel() {
        return level;
    }

    public String getDescription() {
        return Description;
    }
}
