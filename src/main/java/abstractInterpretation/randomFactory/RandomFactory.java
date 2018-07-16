package abstractInterpretation.randomFactory;

import abstractInterpretation.DoubleLike;
import abstractInterpretation.IntLike;

public interface RandomFactory<D extends DoubleLike<D>, I extends IntLike<I>> extends DoubleLikeRandomFactory<D>, IntLikeRandomFactory<I> {
}
