public class Maybe<T> {
    private final T data;
    private final boolean none;

    public Maybe() {
        this.data = null;
        this.none = true;
    }

    public Maybe(T data) {
        this.data = data;
        this.none = false;
    }

    public boolean isSome() {
        return !none;
    }

    public boolean isNone() {
        return none;
    }

    public T get() {
        if(none) {
            throw new MaybeException(
                "Can't get from none");
        }
        return data;
    }

    public boolean equals(Object o) {
        if(!(o instanceof Maybe)) {
            return false;
        }
        Maybe that = (Maybe)o;
        return this.none == that.none
            && this.data == that.data;
    }
}
