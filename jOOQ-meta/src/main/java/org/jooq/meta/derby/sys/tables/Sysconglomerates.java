/**
 * This class is generated by jOOQ
 */
package org.jooq.meta.derby.sys.tables;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings("all")
public class Sysconglomerates extends org.jooq.impl.TableImpl<org.jooq.Record> {

	private static final long serialVersionUID = 1621303140;

	/**
	 * The singleton instance of <code>SYS.SYSCONGLOMERATES</code>
	 */
	public static final org.jooq.meta.derby.sys.tables.Sysconglomerates SYSCONGLOMERATES = new org.jooq.meta.derby.sys.tables.Sysconglomerates();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.Record> getRecordType() {
		return org.jooq.Record.class;
	}

	/**
	 * The column <code>SYS.SYSCONGLOMERATES.SCHEMAID</code>.
	 */
	public static final org.jooq.TableField<org.jooq.Record, java.lang.String> SCHEMAID = createField("SCHEMAID", org.jooq.impl.SQLDataType.CHAR, SYSCONGLOMERATES);

	/**
	 * The column <code>SYS.SYSCONGLOMERATES.TABLEID</code>.
	 */
	public static final org.jooq.TableField<org.jooq.Record, java.lang.String> TABLEID = createField("TABLEID", org.jooq.impl.SQLDataType.CHAR, SYSCONGLOMERATES);

	/**
	 * The column <code>SYS.SYSCONGLOMERATES.CONGLOMERATENUMBER</code>.
	 */
	public static final org.jooq.TableField<org.jooq.Record, java.lang.Long> CONGLOMERATENUMBER = createField("CONGLOMERATENUMBER", org.jooq.impl.SQLDataType.BIGINT, SYSCONGLOMERATES);

	/**
	 * The column <code>SYS.SYSCONGLOMERATES.CONGLOMERATENAME</code>.
	 */
	public static final org.jooq.TableField<org.jooq.Record, java.lang.String> CONGLOMERATENAME = createField("CONGLOMERATENAME", org.jooq.impl.SQLDataType.VARCHAR, SYSCONGLOMERATES);

	/**
	 * The column <code>SYS.SYSCONGLOMERATES.ISINDEX</code>.
	 */
	public static final org.jooq.TableField<org.jooq.Record, java.lang.Boolean> ISINDEX = createField("ISINDEX", org.jooq.impl.SQLDataType.BOOLEAN, SYSCONGLOMERATES);

	/**
	 * The column <code>SYS.SYSCONGLOMERATES.DESCRIPTOR</code>.
	 */
	public static final org.jooq.TableField<org.jooq.Record, java.lang.String> DESCRIPTOR = createField("DESCRIPTOR", org.jooq.impl.SQLDataType.CLOB, SYSCONGLOMERATES);

	/**
	 * The column <code>SYS.SYSCONGLOMERATES.ISCONSTRAINT</code>.
	 */
	public static final org.jooq.TableField<org.jooq.Record, java.lang.Boolean> ISCONSTRAINT = createField("ISCONSTRAINT", org.jooq.impl.SQLDataType.BOOLEAN, SYSCONGLOMERATES);

	/**
	 * The column <code>SYS.SYSCONGLOMERATES.CONGLOMERATEID</code>.
	 */
	public static final org.jooq.TableField<org.jooq.Record, java.lang.String> CONGLOMERATEID = createField("CONGLOMERATEID", org.jooq.impl.SQLDataType.CHAR, SYSCONGLOMERATES);

	/**
	 * No further instances allowed
	 */
	private Sysconglomerates() {
		super("SYSCONGLOMERATES", org.jooq.meta.derby.sys.Sys.SYS);
	}
}
