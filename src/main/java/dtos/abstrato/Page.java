package dtos.abstrato;


import java.util.List;

public abstract class Page<T> {
    private final int page;
    private final int size;
    private final List<T> content;

    protected Page(int page, int size, List<T> content) {
        this.page = page;
        this.size = size;
        this.content = content != null ? List.copyOf(content) : List.of();
    }
    public int getPage() { return page; }
    public int getSize() { return size; }
    public List<T> getContent() {
        if (content == null)
            return List.of();
        return content;
    }
}

