/*
 * This file is generated by jOOQ.
*/
package org.jooq.meta.postgres.pg_catalog;


import org.jooq.AggregateFunction;
import org.jooq.Configuration;
import org.jooq.Field;
import org.jooq.meta.postgres.pg_catalog.routines.Count1;
import org.jooq.meta.postgres.pg_catalog.routines.Count2;
import org.jooq.meta.postgres.pg_catalog.routines.FormatType;


/**
 * Convenience access to all stored procedures and functions in pg_catalog
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Routines {

    /**
     * Get <code>pg_catalog.count</code> as a field.
     */
    public static AggregateFunction<Long> count1(Object __1) {
        Count1 f = new Count1();
        f.set__1(__1);

        return f.asAggregateFunction();
    }

    /**
     * Get <code>pg_catalog.count</code> as a field.
     */
    public static AggregateFunction<Long> count1(Field<Object> __1) {
        Count1 f = new Count1();
        f.set__1(__1);

        return f.asAggregateFunction();
    }

    /**
     * Get <code>pg_catalog.count</code> as a field.
     */
    public static AggregateFunction<Long> count2() {
        Count2 f = new Count2();

        return f.asAggregateFunction();
    }

    /**
     * Call <code>pg_catalog.format_type</code>
     */
    public static String formatType(Configuration configuration, Long __1, Integer __2) {
        FormatType f = new FormatType();
        f.set__1(__1);
        f.set__2(__2);

        f.execute(configuration);
        return f.getReturnValue();
    }

    /**
     * Get <code>pg_catalog.format_type</code> as a field.
     */
    public static Field<String> formatType(Long __1, Integer __2) {
        FormatType f = new FormatType();
        f.set__1(__1);
        f.set__2(__2);

        return f.asField();
    }

    /**
     * Get <code>pg_catalog.format_type</code> as a field.
     */
    public static Field<String> formatType(Field<Long> __1, Field<Integer> __2) {
        FormatType f = new FormatType();
        f.set__1(__1);
        f.set__2(__2);

        return f.asField();
    }
}
