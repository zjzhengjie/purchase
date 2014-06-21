package com.wantdo.domain;

/**
 * FgSupplyfileId entity. @author MyEclipse Persistence Tools
 */

public class FgSupplyfileId implements java.io.Serializable {

	// Fields

	private String compno;
	private String ocode;

	// Constructors

	/** default constructor */
	public FgSupplyfileId() {
	}

	/** full constructor */
	public FgSupplyfileId(String compno, String ocode) {
		this.compno = compno;
		this.ocode = ocode;
	}

	// Property accessors

	public String getCompno() {
		return this.compno;
	}

	public void setCompno(String compno) {
		this.compno = compno;
	}

	public String getOcode() {
		return this.ocode;
	}

	public void setOcode(String ocode) {
		this.ocode = ocode;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof FgSupplyfileId))
			return false;
		FgSupplyfileId castOther = (FgSupplyfileId) other;

		return ((this.getCompno() == castOther.getCompno()) || (this
				.getCompno() != null && castOther.getCompno() != null && this
				.getCompno().equals(castOther.getCompno())))
				&& ((this.getOcode() == castOther.getOcode()) || (this
						.getOcode() != null && castOther.getOcode() != null && this
						.getOcode().equals(castOther.getOcode())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getCompno() == null ? 0 : this.getCompno().hashCode());
		result = 37 * result
				+ (getOcode() == null ? 0 : this.getOcode().hashCode());
		return result;
	}

}