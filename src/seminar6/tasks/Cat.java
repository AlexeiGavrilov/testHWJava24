package seminar6.tasks;

import java.util.Objects;

public class Cat {
    public String name;
    public int age;

    public boolean isSill;
    public String diagnozes;

    public Owner owner;

    public Cat(String name, int age, boolean isSill, String diagnozes, Owner owner) {
        this.name = name;
        this.age = age;
        this.isSill = isSill;
        this.diagnozes = diagnozes;
        this.owner = owner;
    }

    @Override
    public String toString() {
        return String.format("Cat {name = %s, age = %s, isSill = %s, diagnoz = %s, owner = %s}", name, age, isSill, diagnozes, owner);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != this.getClass()) {
            return false;
        }
        Cat cat = (Cat) obj;
        return cat.name.equals(this.name) && cat.age == this.age && cat.isSill == this.isSill &&
                cat.diagnozes.equals(this.diagnozes);

    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = prime * result + age;
        result = prime * result + ((diagnozes == null) ? 0 : diagnozes.hashCode());
        return result;
    }
}
