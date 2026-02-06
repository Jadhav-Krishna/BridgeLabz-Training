package chatLogParser;

public interface MessageFilter<T> {
    boolean allow(T message);
}