/*
 * This file is generated by jOOQ.
*/
package org.jooq.meta.hsqldb.information_schema.tables;


import org.jooq.Field;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;
import org.jooq.meta.hsqldb.information_schema.InformationSchema;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Columns extends TableImpl<Record> {

    private static final long serialVersionUID = 1106014057;

    /**
     * The reference instance of <code>INFORMATION_SCHEMA.COLUMNS</code>
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
     * The column <code>INFORMATION_SCHEMA.COLUMNS.TABLE_CATALOG</code>.
     */
    public final TableField<Record, String> TABLE_CATALOG = createField("TABLE_CATALOG", org.jooq.impl.SQLDataType.VARCHAR.length(128), this, "");

    /**
     * The column <code>INFORMATION_SCHEMA.COLUMNS.TABLE_SCHEMA</code>.
     */
    public final TableField<Record, String> TABLE_SCHEMA = createField("TABLE_SCHEMA", org.jooq.impl.SQLDataType.VARCHAR.length(128), this, "");

    /**
     * The column <code>INFORMATION_SCHEMA.COLUMNS.TABLE_NAME</code>.
     */
    public final TableField<Record, String> TABLE_NAME = createField("TABLE_NAME", org.jooq.impl.SQLDataType.VARCHAR.length(128), this, "");

    /**
     * The column <code>INFORMATION_SCHEMA.COLUMNS.COLUMN_NAME</code>.
     */
    public final TableField<Record, String> COLUMN_NAME = createField("COLUMN_NAME", org.jooq.impl.SQLDataType.VARCHAR.length(128), this, "");

    /**
     * The column <code>INFORMATION_SCHEMA.COLUMNS.ORDINAL_POSITION</code>.
     */
    public final TableField<Record, Long> ORDINAL_POSITION = createField("ORDINAL_POSITION", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>INFORMATION_SCHEMA.COLUMNS.COLUMN_DEFAULT</code>.
     */
    public final TableField<Record, String> COLUMN_DEFAULT = createField("COLUMN_DEFAULT", org.jooq.impl.SQLDataType.VARCHAR.length(65536), this, "");

    /**
     * The column <code>INFORMATION_SCHEMA.COLUMNS.IS_NULLABLE</code>.
     */
    public final TableField<Record, String> IS_NULLABLE = createField("IS_NULLABLE", org.jooq.impl.SQLDataType.VARCHAR.length(3), this, "");

    /**
     * The column <code>INFORMATION_SCHEMA.COLUMNS.DATA_TYPE</code>.
     */
    public final TableField<Record, String> DATA_TYPE = createField("DATA_TYPE", org.jooq.impl.SQLDataType.VARCHAR.length(65536), this, "");

    /**
     * The column <code>INFORMATION_SCHEMA.COLUMNS.CHARACTER_MAXIMUM_LENGTH</code>.
     */
    public final TableField<Record, Long> CHARACTER_MAXIMUM_LENGTH = createField("CHARACTER_MAXIMUM_LENGTH", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>INFORMATION_SCHEMA.COLUMNS.CHARACTER_OCTET_LENGTH</code>.
     */
    public final TableField<Record, Long> CHARACTER_OCTET_LENGTH = createField("CHARACTER_OCTET_LENGTH", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>INFORMATION_SCHEMA.COLUMNS.NUMERIC_PRECISION</code>.
     */
    public final TableField<Record, Long> NUMERIC_PRECISION = createField("NUMERIC_PRECISION", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>INFORMATION_SCHEMA.COLUMNS.NUMERIC_PRECISION_RADIX</code>.
     */
    public final TableField<Record, Long> NUMERIC_PRECISION_RADIX = createField("NUMERIC_PRECISION_RADIX", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>INFORMATION_SCHEMA.COLUMNS.NUMERIC_SCALE</code>.
     */
    public final TableField<Record, Long> NUMERIC_SCALE = createField("NUMERIC_SCALE", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>INFORMATION_SCHEMA.COLUMNS.DATETIME_PRECISION</code>.
     */
    public final TableField<Record, Long> DATETIME_PRECISION = createField("DATETIME_PRECISION", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>INFORMATION_SCHEMA.COLUMNS.INTERVAL_TYPE</code>.
     */
    public final TableField<Record, String> INTERVAL_TYPE = createField("INTERVAL_TYPE", org.jooq.impl.SQLDataType.VARCHAR.length(65536), this, "");

    /**
     * The column <code>INFORMATION_SCHEMA.COLUMNS.INTERVAL_PRECISION</code>.
     */
    public final TableField<Record, Long> INTERVAL_PRECISION = createField("INTERVAL_PRECISION", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>INFORMATION_SCHEMA.COLUMNS.CHARACTER_SET_CATALOG</code>.
     */
    public final TableField<Record, String> CHARACTER_SET_CATALOG = createField("CHARACTER_SET_CATALOG", org.jooq.impl.SQLDataType.VARCHAR.length(65536), this, "");

    /**
     * The column <code>INFORMATION_SCHEMA.COLUMNS.CHARACTER_SET_SCHEMA</code>.
     */
    public final TableField<Record, String> CHARACTER_SET_SCHEMA = createField("CHARACTER_SET_SCHEMA", org.jooq.impl.SQLDataType.VARCHAR.length(128), this, "");

    /**
     * The column <code>INFORMATION_SCHEMA.COLUMNS.CHARACTER_SET_NAME</code>.
     */
    public final TableField<Record, String> CHARACTER_SET_NAME = createField("CHARACTER_SET_NAME", org.jooq.impl.SQLDataType.VARCHAR.length(128), this, "");

    /**
     * The column <code>INFORMATION_SCHEMA.COLUMNS.COLLATION_CATALOG</code>.
     */
    public final TableField<Record, String> COLLATION_CATALOG = createField("COLLATION_CATALOG", org.jooq.impl.SQLDataType.VARCHAR.length(128), this, "");

    /**
     * The column <code>INFORMATION_SCHEMA.COLUMNS.COLLATION_SCHEMA</code>.
     */
    public final TableField<Record, String> COLLATION_SCHEMA = createField("COLLATION_SCHEMA", org.jooq.impl.SQLDataType.VARCHAR.length(128), this, "");

    /**
     * The column <code>INFORMATION_SCHEMA.COLUMNS.COLLATION_NAME</code>.
     */
    public final TableField<Record, String> COLLATION_NAME = createField("COLLATION_NAME", org.jooq.impl.SQLDataType.VARCHAR.length(128), this, "");

    /**
     * The column <code>INFORMATION_SCHEMA.COLUMNS.DOMAIN_CATALOG</code>.
     */
    public final TableField<Record, String> DOMAIN_CATALOG = createField("DOMAIN_CATALOG", org.jooq.impl.SQLDataType.VARCHAR.length(128), this, "");

    /**
     * The column <code>INFORMATION_SCHEMA.COLUMNS.DOMAIN_SCHEMA</code>.
     */
    public final TableField<Record, String> DOMAIN_SCHEMA = createField("DOMAIN_SCHEMA", org.jooq.impl.SQLDataType.VARCHAR.length(128), this, "");

    /**
     * The column <code>INFORMATION_SCHEMA.COLUMNS.DOMAIN_NAME</code>.
     */
    public final TableField<Record, String> DOMAIN_NAME = createField("DOMAIN_NAME", org.jooq.impl.SQLDataType.VARCHAR.length(128), this, "");

    /**
     * The column <code>INFORMATION_SCHEMA.COLUMNS.UDT_CATALOG</code>.
     */
    public final TableField<Record, String> UDT_CATALOG = createField("UDT_CATALOG", org.jooq.impl.SQLDataType.VARCHAR.length(128), this, "");

    /**
     * The column <code>INFORMATION_SCHEMA.COLUMNS.UDT_SCHEMA</code>.
     */
    public final TableField<Record, String> UDT_SCHEMA = createField("UDT_SCHEMA", org.jooq.impl.SQLDataType.VARCHAR.length(128), this, "");

    /**
     * The column <code>INFORMATION_SCHEMA.COLUMNS.UDT_NAME</code>.
     */
    public final TableField<Record, String> UDT_NAME = createField("UDT_NAME", org.jooq.impl.SQLDataType.VARCHAR.length(128), this, "");

    /**
     * The column <code>INFORMATION_SCHEMA.COLUMNS.SCOPE_CATALOG</code>.
     */
    public final TableField<Record, String> SCOPE_CATALOG = createField("SCOPE_CATALOG", org.jooq.impl.SQLDataType.VARCHAR.length(128), this, "");

    /**
     * The column <code>INFORMATION_SCHEMA.COLUMNS.SCOPE_SCHEMA</code>.
     */
    public final TableField<Record, String> SCOPE_SCHEMA = createField("SCOPE_SCHEMA", org.jooq.impl.SQLDataType.VARCHAR.length(128), this, "");

    /**
     * The column <code>INFORMATION_SCHEMA.COLUMNS.SCOPE_NAME</code>.
     */
    public final TableField<Record, String> SCOPE_NAME = createField("SCOPE_NAME", org.jooq.impl.SQLDataType.VARCHAR.length(128), this, "");

    /**
     * The column <code>INFORMATION_SCHEMA.COLUMNS.MAXIMUM_CARDINALITY</code>.
     */
    public final TableField<Record, Long> MAXIMUM_CARDINALITY = createField("MAXIMUM_CARDINALITY", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>INFORMATION_SCHEMA.COLUMNS.DTD_IDENTIFIER</code>.
     */
    public final TableField<Record, String> DTD_IDENTIFIER = createField("DTD_IDENTIFIER", org.jooq.impl.SQLDataType.VARCHAR.length(128), this, "");

    /**
     * The column <code>INFORMATION_SCHEMA.COLUMNS.IS_SELF_REFERENCING</code>.
     */
    public final TableField<Record, String> IS_SELF_REFERENCING = createField("IS_SELF_REFERENCING", org.jooq.impl.SQLDataType.VARCHAR.length(3), this, "");

    /**
     * The column <code>INFORMATION_SCHEMA.COLUMNS.IS_IDENTITY</code>.
     */
    public final TableField<Record, String> IS_IDENTITY = createField("IS_IDENTITY", org.jooq.impl.SQLDataType.VARCHAR.length(3), this, "");

    /**
     * The column <code>INFORMATION_SCHEMA.COLUMNS.IDENTITY_GENERATION</code>.
     */
    public final TableField<Record, String> IDENTITY_GENERATION = createField("IDENTITY_GENERATION", org.jooq.impl.SQLDataType.VARCHAR.length(65536), this, "");

    /**
     * The column <code>INFORMATION_SCHEMA.COLUMNS.IDENTITY_START</code>.
     */
    public final TableField<Record, String> IDENTITY_START = createField("IDENTITY_START", org.jooq.impl.SQLDataType.VARCHAR.length(65536), this, "");

    /**
     * The column <code>INFORMATION_SCHEMA.COLUMNS.IDENTITY_INCREMENT</code>.
     */
    public final TableField<Record, String> IDENTITY_INCREMENT = createField("IDENTITY_INCREMENT", org.jooq.impl.SQLDataType.VARCHAR.length(65536), this, "");

    /**
     * The column <code>INFORMATION_SCHEMA.COLUMNS.IDENTITY_MAXIMUM</code>.
     */
    public final TableField<Record, String> IDENTITY_MAXIMUM = createField("IDENTITY_MAXIMUM", org.jooq.impl.SQLDataType.VARCHAR.length(65536), this, "");

    /**
     * The column <code>INFORMATION_SCHEMA.COLUMNS.IDENTITY_MINIMUM</code>.
     */
    public final TableField<Record, String> IDENTITY_MINIMUM = createField("IDENTITY_MINIMUM", org.jooq.impl.SQLDataType.VARCHAR.length(65536), this, "");

    /**
     * The column <code>INFORMATION_SCHEMA.COLUMNS.IDENTITY_CYCLE</code>.
     */
    public final TableField<Record, String> IDENTITY_CYCLE = createField("IDENTITY_CYCLE", org.jooq.impl.SQLDataType.VARCHAR.length(3), this, "");

    /**
     * The column <code>INFORMATION_SCHEMA.COLUMNS.IS_GENERATED</code>.
     */
    public final TableField<Record, String> IS_GENERATED = createField("IS_GENERATED", org.jooq.impl.SQLDataType.VARCHAR.length(65536), this, "");

    /**
     * The column <code>INFORMATION_SCHEMA.COLUMNS.GENERATION_EXPRESSION</code>.
     */
    public final TableField<Record, String> GENERATION_EXPRESSION = createField("GENERATION_EXPRESSION", org.jooq.impl.SQLDataType.VARCHAR.length(65536), this, "");

    /**
     * The column <code>INFORMATION_SCHEMA.COLUMNS.IS_UPDATABLE</code>.
     */
    public final TableField<Record, String> IS_UPDATABLE = createField("IS_UPDATABLE", org.jooq.impl.SQLDataType.VARCHAR.length(3), this, "");

    /**
     * The column <code>INFORMATION_SCHEMA.COLUMNS.DECLARED_DATA_TYPE</code>.
     */
    public final TableField<Record, String> DECLARED_DATA_TYPE = createField("DECLARED_DATA_TYPE", org.jooq.impl.SQLDataType.VARCHAR.length(65536), this, "");

    /**
     * The column <code>INFORMATION_SCHEMA.COLUMNS.DECLARED_NUMERIC_PRECISION</code>.
     */
    public final TableField<Record, Long> DECLARED_NUMERIC_PRECISION = createField("DECLARED_NUMERIC_PRECISION", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>INFORMATION_SCHEMA.COLUMNS.DECLARED_NUMERIC_SCALE</code>.
     */
    public final TableField<Record, Long> DECLARED_NUMERIC_SCALE = createField("DECLARED_NUMERIC_SCALE", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * Create a <code>INFORMATION_SCHEMA.COLUMNS</code> table reference
     */
    public Columns() {
        this(DSL.name("COLUMNS"), null);
    }

    /**
     * Create an aliased <code>INFORMATION_SCHEMA.COLUMNS</code> table reference
     */
    public Columns(String alias) {
        this(DSL.name(alias), COLUMNS);
    }

    /**
     * Create an aliased <code>INFORMATION_SCHEMA.COLUMNS</code> table reference
     */
    public Columns(Name alias) {
        this(alias, COLUMNS);
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

    /**
     * {@inheritDoc}
     */
    @Override
    public Columns as(String alias) {
        return new Columns(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Columns as(Name alias) {
        return new Columns(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Columns rename(String name) {
        return new Columns(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Columns rename(Name name) {
        return new Columns(name, null);
    }
}
