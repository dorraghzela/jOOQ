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


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TableConstraints extends TableImpl<Record> {

    private static final long serialVersionUID = -794026735;

    /**
     * The reference instance of <code>information_schema.TABLE_CONSTRAINTS</code>
     */
    public static final TableConstraints TABLE_CONSTRAINTS = new TableConstraints();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<Record> getRecordType() {
        return Record.class;
    }

    /**
     * The column <code>information_schema.TABLE_CONSTRAINTS.CONSTRAINT_CATALOG</code>.
     */
    public static final TableField<Record, String> CONSTRAINT_CATALOG = createField("CONSTRAINT_CATALOG", org.jooq.impl.SQLDataType.VARCHAR(64).nullable(false), TABLE_CONSTRAINTS, "");

    /**
     * The column <code>information_schema.TABLE_CONSTRAINTS.CONSTRAINT_SCHEMA</code>.
     */
    public static final TableField<Record, String> CONSTRAINT_SCHEMA = createField("CONSTRAINT_SCHEMA", org.jooq.impl.SQLDataType.VARCHAR(64).nullable(false), TABLE_CONSTRAINTS, "");

    /**
     * The column <code>information_schema.TABLE_CONSTRAINTS.CONSTRAINT_NAME</code>.
     */
    public static final TableField<Record, String> CONSTRAINT_NAME = createField("CONSTRAINT_NAME", org.jooq.impl.SQLDataType.VARCHAR(64), TABLE_CONSTRAINTS, "");

    /**
     * The column <code>information_schema.TABLE_CONSTRAINTS.TABLE_SCHEMA</code>.
     */
    public static final TableField<Record, String> TABLE_SCHEMA = createField("TABLE_SCHEMA", org.jooq.impl.SQLDataType.VARCHAR(64).nullable(false), TABLE_CONSTRAINTS, "");

    /**
     * The column <code>information_schema.TABLE_CONSTRAINTS.TABLE_NAME</code>.
     */
    public static final TableField<Record, String> TABLE_NAME = createField("TABLE_NAME", org.jooq.impl.SQLDataType.VARCHAR(64).nullable(false), TABLE_CONSTRAINTS, "");

    /**
     * The column <code>information_schema.TABLE_CONSTRAINTS.CONSTRAINT_TYPE</code>.
     */
    public static final TableField<Record, String> CONSTRAINT_TYPE = createField("CONSTRAINT_TYPE", org.jooq.impl.SQLDataType.VARCHAR(11).nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), TABLE_CONSTRAINTS, "");

    /**
     * No further instances allowed
     */
    private TableConstraints() {
        this(DSL.name("TABLE_CONSTRAINTS"), null);
    }

    private TableConstraints(Name alias, Table<Record> aliased) {
        this(alias, aliased, null);
    }

    private TableConstraints(Name alias, Table<Record> aliased, Field<?>[] parameters) {
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
