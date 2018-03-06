package io.doov.core.dsl.lang;

/**
 * First step for creating mapping rule.
 * Associates field with type {@link I} and {@link J} with a bi-converter.
 *
 * @param <I> 1st in type
 * @param <J> 2nd in type
 */
public interface BiStepMap<I, J> {

    /**
     * Returns bi step mapping
     *
     * @param typeConverter bi type converter
     * @param <O>           out type
     * @return bi step mapping
     */
    <O> BiStepMapping<I, J, O> using(BiTypeConverter<I, J, O> typeConverter);

}
