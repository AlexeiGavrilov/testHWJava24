package seminar6.tasks;

import java.util.Objects;

public class Owner {
    public String name;

    public String phone;

    public Owner(String name, String phone) {
        this.name = name;
        this.phone = phone;
    }


    @Override
    public String toString() {
        return String.format("Owner {Name = %s, Phone = %s}", name, phone);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != this.getClass()) {
            return false;
        }

        return Objects.equals(this, obj);


    }
}
