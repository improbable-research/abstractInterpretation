package abstractInterpretation.randomFactory;

import abstractInterpretation.IntLike;

public interface IntLikeRandomFactory<T extends IntLike<T>> {
    T nextInt();
}
