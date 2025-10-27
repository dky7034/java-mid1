package lang.object.equals;

public class UserV2 {
    private String id;

    public UserV2(String id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object object) {
        // 1. 참조값 비교
        if (this == object) {
            return true;
        }

        // 2. 타입 체크
        if (object == null || !(object instanceof UserV2)) {
            return false;
        }

        // 3. 형변환 및 내용 비교
        UserV2 other = (UserV2) object;
        return id.equals(other.id);
    }
}
