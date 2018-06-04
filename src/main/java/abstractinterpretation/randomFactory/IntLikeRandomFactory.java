package abstractinterpretation.randomFactory;

import abstractinterpretation.abstractTypes.IntLike;

public interface IntLikeRandomFactory<T extends IntLike<T>> {
    T nextInt();
}
