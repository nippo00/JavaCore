package lesson19.HomeWork;

import java.util.Objects;

public class File {

    private long id;
    private String name;
    private String format;
    private long size;

    public File(long id, String name, String format, long size) throws Exception {
        if (name == null || name.length() > 10) {
            throw new Exception(name + id + "name has more than 10 characters");
        } else {
            this.id = id;
            this.name = name;
            this.format = format;
            this.size = size;
        }
    }
    /*public File(long id, String name, String format, long size) {
        this.id = id;
        this.name = name;
        this.format = format;
        this.size = size;
    }*/

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    public long getSize() {
        return size;
    }

    public void setSize(long size) {
        this.size = size;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        File file = (File) o;
        return id == file.id &&
                size == file.size &&
                Objects.equals(name, file.name) &&
                Objects.equals(format, file.format);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, format, size);
    }

    @Override
    public String toString() {
        return "File{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", format='" + format + '\'' +
                ", size=" + size +
                '}';
    }
}