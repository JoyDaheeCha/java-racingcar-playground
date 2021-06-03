package Domain;

public class Name {
    String name = "";

    public Name(String name) {
        isValid(name);
        this.name = name;
    }

    private void isValid(String name) {
        if (name.length()==0 || name.length() > 5) {
            throw new IllegalArgumentException("자동차 이름은 1글자 이상이며, 5글자를 초과할 수 없습니다.");
        }
    }

    public String getName() {
        return name;
    }
}
