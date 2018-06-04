package abstractinterpretation.randomFactory;

import abstractinterpretation.abstractTypes.DoubleLike;
import abstractinterpretation.abstractTypes.IntLike;

public interface RandomFactory<D extends DoubleLike<D>, I extends IntLike<I>> extends DoubleLikeRandomFactory<D>, IntLikeRandomFactory<I> {
}
