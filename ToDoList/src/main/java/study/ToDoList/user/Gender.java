package study.ToDoList.user;

import com.fasterxml.jackson.annotation.JsonCreator;
import lombok.Getter;

@Getter
public enum Gender {
    MALE("male"), FEMALE("female");

    private final String message;

    Gender(String message) {
        this.message = message;
    }

    @JsonCreator
    public static Gender from(String sub) {
        for (Gender gender : Gender.values()) {
            if (gender.getMessage().equals(sub)) {
                return gender;
            }
        }
        throw new RuntimeException("잘못된 성별");
    }
}
