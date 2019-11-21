package android.database.sqlite;

/**
 * A stripped-down java.util.function.Consumer replacement for LineageOS 12.1,
 * since it requires jdk 7 and therefore cannot use java 8 features.
 * https://github.com/cm12-amami/discussion/issues/61
 */
public interface Consumer<T> {
    void accept(T t);
}
