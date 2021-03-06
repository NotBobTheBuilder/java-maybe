public class MaybeExample {
    public static void main(String[] args) {
        Maybe<Integer> three = Maybe.some(3);
        print(three.isSome() ? three.get() : "None");

        Maybe<Integer> none = Maybe.none();
        print(none.isSome() ? none.get() : "None");

        // If you want to be explicit, say:
        // Maybe.<Integer>none()
    }

    private static void print(Object o) {
        System.out.println(o);
    }
}