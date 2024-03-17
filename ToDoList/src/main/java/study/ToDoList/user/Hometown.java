package study.ToDoList.user;

import lombok.Getter;

@Getter
public enum Hometown {
    SEOUL("seoul"), INCHEON("incheon"), DAEGU("daegu"), DAEJEON("daejeon"),
    GYEONGGI("gyeonggi"), CHUNGCHEONG("chungcheong"), JEOLLA("jeolla"),
    GYEONGSANG("gyeonsang"), JEJU("jeju");

    private final String message;

    Hometown(String message) {
        this.message = message;
    }

    public static Hometown from(String sub) {
        for (Hometown hometown : Hometown.values()) {
            if (hometown.getMessage().equals(sub)) {
                return hometown;
            }
        }
        throw new RuntimeException("잘못된 고향");
    }
}

