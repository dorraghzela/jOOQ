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
public class Columns extends TableImpl<Record> {

    private static final long serialVersionUID = -725566953;

    /**
     * The reference instance of <code>information_schema.COLUMNS</code>
     */
    public static final Columns COLUMNS = new Columns();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<Record> getRecordType() {
        return Record.class;
    }

    /**
     * The column <code>information_schema.COLUMNS.TABLE_CATALOG</code>.
     */
    public static final TableField<Record, String> TABLE_CATALOG = createField("TABLE_CATALOG", org.jooq.impl.SQLDataType.VARCHAR(64).nullable(false), COLUMNS, "");

    /**
     * The column <code>information_schema.COLUMNS.TABLE_SCHEMA</code>.
     */
    public static final TableField<Record, String> TABLE_SCHEMA = createField("TABLE_SCHEMA", org.jooq.impl.SQLDataType.VARCHAR(64).nullable(false), COLUMNS, "");

    /**
     * The column <code>information_schema.COLUMNS.TABLE_NAME</code>.
     */
    public static final TableField<Record, String> TABLE_NAME = createField("TABLE_NAME", org.jooq.impl.SQLDataType.VARCHAR(64).nullable(false), COLUMNS, "");

    /**
     * The column <code>information_schema.COLUMNS.COLUMN_NAME</code>.
     */
    public static final TableField<Record, String> COLUMN_NAME = createField("COLUMN_NAME", org.jooq.impl.SQLDataType.VARCHAR(64), COLUMNS, "");

    /**
     * The column <code>information_schema.COLUMNS.ORDINAL_POSITION</code>.
     */
    public static final TableField<Record, UInteger> ORDINAL_POSITION = createField("ORDINAL_POSITION", org.jooq.impl.SQLDataType.INTEGERUNSIGNED.nullable(false), COLUMNS, "");

    /**
     * The column <code>information_schema.COLUMNS.COLUMN_DEFAULT</code>.
     */
    public static final TableField<Record, String> COLUMN_DEFAULT = createField("COLUMN_DEFAULT", org.jooq.impl.SQLDataType.CLOB, COLUMNS, "");

    /**
     * The column <code>information_schema.COLUMNS.IS_NULLABLE</code>.
     */
    public static final TableField<Record, String> IS_NULLABLE = createField("IS_NULLABLE", org.jooq.impl.SQLDataType.VARCHAR(3).nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), COLUMNS, "");

    /**
     * The column <code>information_schema.COLUMNS.DATA_TYPE</code>.
     */
    public static final TableField<Record, String> DATA_TYPE = createField("DATA_TYPE", org.jooq.impl.SQLDataType.CLOB, COLUMNS, "");

    /**
     * The column <code>information_schema.COLUMNS.CHARACTER_MAXIMUM_LENGTH</code>.
     */
    public static final TableField<Record, Long> CHARACTER_MAXIMUM_LENGTH = createField("CHARACTER_MAXIMUM_LENGTH", org.jooq.impl.SQLDataType.BIGINT, COLUMNS, "");

    /**
     * The column <code>information_schema.COLUMNS.CHARACTER_OCTET_LENGTH</code>.
     */
    public static final TableField<Record, Long> CHARACTER_OCTET_LENGTH = createField("CHARACTER_OCTET_LENGTH", org.jooq.impl.SQLDataType.BIGINT, COLUMNS, "");

    /**
     * The column <code>information_schema.COLUMNS.NUMERIC_PRECISION</code>.
     */
    public static final TableField<Record, ULong> NUMERIC_PRECISION = createField("NUMERIC_PRECISION", org.jooq.impl.SQLDataType.BIGINTUNSIGNED, COLUMNS, "");

    /**
     * The column <code>information_schema.COLUMNS.NUMERIC_SCALE</code>.
     */
    public static final TableField<Record, ULong> NUMERIC_SCALE = createField("NUMERIC_SCALE", org.jooq.impl.SQLDataType.BIGINTUNSIGNED, COLUMNS, "");

    /**
     * The column <code>information_schema.COLUMNS.DATETIME_PRECISION</code>.
     */
    public static final TableField<Record, UInteger> DATETIME_PRECISION = createField("DATETIME_PRECISION", org.jooq.impl.SQLDataType.INTEGERUNSIGNED, COLUMNS, "");

    /**
     * The column <code>information_schema.COLUMNS.CHARACTER_SET_NAME</code>.
     */
    public static final TableField<Record, String> CHARACTER_SET_NAME = createField("CHARACTER_SET_NAME", org.jooq.impl.SQLDataType.VARCHAR(64), COLUMNS, "");

    /**
     * The column <code>information_schema.COLUMNS.COLLATION_NAME</code>.
     */
    public static final TableField<Record, String> COLLATION_NAME = createField("COLLATION_NAME", org.jooq.impl.SQLDataType.VARCHAR(64), COLUMNS, "");

    /**
     * The column <code>information_schema.COLUMNS.COLUMN_TYPE</code>.
     */
    public static final TableField<Record, String> COLUMN_TYPE = createField("COLUMN_TYPE", org.jooq.impl.SQLDataType.CLOB.nullable(false), COLUMNS, "");

    /**
     * The column <code>information_schema.COLUMNS.COLUMN_KEY</code>.
     */
    public static final TableField<Record, String> COLUMN_KEY = createField("COLUMN_KEY", org.jooq.impl.SQLDataType.VARCHAR(3).nullable(false), COLUMNS, "");

    /**
     * The column <code>information_schema.COLUMNS.EXTRA</code>.
     */
    public static final TableField<Record, String> EXTRA = createField("EXTRA", org.jooq.impl.SQLDataType.VARCHAR(57), COLUMNS, "");

    /**
     * The column <code>information_schema.COLUMNS.PRIVILEGES</code>.
     */
    public static final TableField<Record, String> PRIVILEGES = createField("PRIVILEGES", org.jooq.impl.SQLDataType.VARCHAR(154), COLUMNS, "");

    /**
     * The column <code>information_schema.COLUMNS.COLUMN_COMMENT</code>.
     */
    public static final TableField<Record, String> COLUMN_COMMENT = createField("COLUMN_COMMENT", org.jooq.impl.SQLDataType.CLOB.nullable(false), COLUMNS, "");

    /**
     * The column <code>information_schema.COLUMNS.GENERATION_EXPRESSION</code>.
     */
    public static final TableField<Record, String> GENERATION_EXPRESSION = createField("GENERATION_EXPRESSION", org.jooq.impl.SQLDataType.CLOB.nullable(false), COLUMNS, "");

    /**
     * No further instances allowed
     */
    private Columns() {
        this(DSL.name("COLUMNS"), null);
    }

    private Columns(Name alias, Table<Record> aliased) {
        this(alias, aliased, null);
    }

    private Columns(Name alias, Table<Record> aliased, Field<?>[] parameters) {
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
