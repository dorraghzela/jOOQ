/*
 * This file is generated by jOOQ.
*/
package org.jooq.meta.mysql.information_schema.tables;


import org.jooq.Field;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;
import org.jooq.meta.mysql.information_schema.InformationSchema;
import org.jooq.types.UInteger;
import org.jooq.types.ULong;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Statistics extends TableImpl<Record> {

    private static final long serialVersionUID = -2655452;

    /**
     * The reference instance of <code>information_schema.STATISTICS</code>
     */
    public static final Statistics STATISTICS = new Statistics();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<Record> getRecordType() {
        return Record.class;
    }

    /**
     * The column <code>information_schema.STATISTICS.TABLE_CATALOG</code>.
     */
    public static final TableField<Record, String> TABLE_CATALOG = createField("TABLE_CATALOG", org.jooq.impl.SQLDataType.VARCHAR(64).nullable(false), STATISTICS, "");

    /**
     * The column <code>information_schema.STATISTICS.TABLE_SCHEMA</code>.
     */
    public static final TableField<Record, String> TABLE_SCHEMA = createField("TABLE_SCHEMA", org.jooq.impl.SQLDataType.VARCHAR(64).nullable(false), STATISTICS, "");

    /**
     * The column <code>information_schema.STATISTICS.TABLE_NAME</code>.
     */
    public static final TableField<Record, String> TABLE_NAME = createField("TABLE_NAME", org.jooq.impl.SQLDataType.VARCHAR(64).nullable(false), STATISTICS, "");

    /**
     * The column <code>information_schema.STATISTICS.NON_UNIQUE</code>.
     */
    public static final TableField<Record, String> NON_UNIQUE = createField("NON_UNIQUE", org.jooq.impl.SQLDataType.VARCHAR(1).nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), STATISTICS, "");

    /**
     * The column <code>information_schema.STATISTICS.INDEX_SCHEMA</code>.
     */
    public static final TableField<Record, String> INDEX_SCHEMA = createField("INDEX_SCHEMA", org.jooq.impl.SQLDataType.VARCHAR(64).nullable(false), STATISTICS, "");

    /**
     * The column <code>information_schema.STATISTICS.INDEX_NAME</code>.
     */
    public static final TableField<Record, String> INDEX_NAME = createField("INDEX_NAME", org.jooq.impl.SQLDataType.VARCHAR(64), STATISTICS, "");

    /**
     * The column <code>information_schema.STATISTICS.SEQ_IN_INDEX</code>.
     */
    public static final TableField<Record, UInteger> SEQ_IN_INDEX = createField("SEQ_IN_INDEX", org.jooq.impl.SQLDataType.INTEGERUNSIGNED.nullable(false), STATISTICS, "");

    /**
     * The column <code>information_schema.STATISTICS.COLUMN_NAME</code>.
     */
    public static final TableField<Record, String> COLUMN_NAME = createField("COLUMN_NAME", org.jooq.impl.SQLDataType.VARCHAR(64), STATISTICS, "");

    /**
     * The column <code>information_schema.STATISTICS.COLLATION</code>.
     */
    public static final TableField<Record, String> COLLATION = createField("COLLATION", org.jooq.impl.SQLDataType.VARCHAR(1), STATISTICS, "");

    /**
     * The column <code>information_schema.STATISTICS.CARDINALITY</code>.
     */
    public static final TableField<Record, ULong> CARDINALITY = createField("CARDINALITY", org.jooq.impl.SQLDataType.BIGINTUNSIGNED, STATISTICS, "");

    /**
     * The column <code>information_schema.STATISTICS.SUB_PART</code>.
     */
    public static final TableField<Record, Long> SUB_PART = createField("SUB_PART", org.jooq.impl.SQLDataType.BIGINT, STATISTICS, "");

    /**
     * The column <code>information_schema.STATISTICS.PACKED</code>.
     */
    public static final TableField<Record, byte[]> PACKED = createField("PACKED", org.jooq.impl.SQLDataType.BINARY, STATISTICS, "");

    /**
     * The column <code>information_schema.STATISTICS.NULLABLE</code>.
     */
    public static final TableField<Record, String> NULLABLE = createField("NULLABLE", org.jooq.impl.SQLDataType.VARCHAR(3).nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), STATISTICS, "");

    /**
     * The column <code>information_schema.STATISTICS.INDEX_TYPE</code>.
     */
    public static final TableField<Record, String> INDEX_TYPE = createField("INDEX_TYPE", org.jooq.impl.SQLDataType.VARCHAR(11).nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), STATISTICS, "");

    /**
     * The column <code>information_schema.STATISTICS.COMMENT</code>.
     */
    public static final TableField<Record, String> COMMENT = createField("COMMENT", org.jooq.impl.SQLDataType.VARCHAR(8).nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), STATISTICS, "");

    /**
     * The column <code>information_schema.STATISTICS.INDEX_COMMENT</code>.
     */
    public static final TableField<Record, String> INDEX_COMMENT = createField("INDEX_COMMENT", org.jooq.impl.SQLDataType.VARCHAR(2048).nullable(false), STATISTICS, "");

    /**
     * The column <code>information_schema.STATISTICS.IS_VISIBLE</code>.
     */
    public static final TableField<Record, String> IS_VISIBLE = createField("IS_VISIBLE", org.jooq.impl.SQLDataType.VARCHAR(3).nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), STATISTICS, "");

    /**
     * No further instances allowed
     */
    private Statistics() {
        this(DSL.name("STATISTICS"), null);
    }

    private Statistics(Name alias, Table<Record> aliased) {
        this(alias, aliased, null);
    }

    private Statistics(Name alias, Table<Record> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return InformationSchema.INFORMATION_SCHEMA;
    }
}
