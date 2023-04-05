package com.yeonoo.masterdata.item.domain;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.Data;

@Data
public class SemiDTO {
	
	//Field
	private String companyCode;			//회사코드
	private String itemCode;			//item코드
	private String itemName;			//품명
	private String itemNo;				//품번
	private String itemType;			//유형
	private String itemSpecification;	//규격
	private String itemStockUnit;		//재고단위
	private int lotSize;				//lotsize
	private int buyPrice;				//매입가격
	private int salesPrice;				//매출가격
	private String memo;				//비고
	private String useyn;				//사용여부
	@JsonFormat(shape=JsonFormat.Shape.STRING, pattern="yyyy-MM-dd-hh-mm")
	private Date createdate;	//등록일시
	@JsonFormat(shape=JsonFormat.Shape.STRING, pattern="yyyy-MM-dd-hh-mm")
	private Date updatedate;	//수정일시
	
	//baseConstructor
	public SemiDTO() {}

	// all parameter
	public SemiDTO(String companyCode, String itemCode, String itemName, String itemNo, String itemType,
			String itemSpecification, String itemStockUnit, int lotSize, int buyPrice, int salesPrice, String memo,
			String useyn, Date createdate, Date updatedate) {
		this.companyCode = companyCode;
		this.itemCode = itemCode;
		this.itemName = itemName;
		this.itemNo = itemNo;
		this.itemType = itemType;
		this.itemSpecification = itemSpecification;
		this.itemStockUnit = itemStockUnit;
		this.lotSize = lotSize;
		this.buyPrice = buyPrice;
		this.salesPrice = salesPrice;
		this.memo = memo;
		this.useyn = useyn;
		this.createdate = createdate;
		this.updatedate = updatedate;
	}

	//getter & setter
	
	public String getCompanyCode() {
		return companyCode;
	}
	
	public void setCompanyCode(String companyCode) {
		this.companyCode = companyCode;
	}
	
	public String getItemCode() {
		return itemCode;
	}



	public void setItemCode(String itemCode) {
		this.itemCode = itemCode;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public String getItemNo() {
		return itemNo;
	}

	public void setItemNo(String itemNo) {
		this.itemNo = itemNo;
	}

	public String getItemType() {
		return itemType;
	}

	public void setItemType(String itemType) {
		this.itemType = itemType;
	}

	public String getItemSpecification() {
		return itemSpecification;
	}

	public void setItemSpecification(String itemSpecification) {
		this.itemSpecification = itemSpecification;
	}

	public String getItemStockUnit() {
		return itemStockUnit;
	}

	public void setItemStockUnit(String itemStockUnit) {
		this.itemStockUnit = itemStockUnit;
	}

	public int getLotSize() {
		return lotSize;
	}

	public void setLotSize(int lotSize) {
		this.lotSize = lotSize;
	}

	public int getBuyPrice() {
		return buyPrice;
	}

	public void setBuyPrice(int buyPrice) {
		this.buyPrice = buyPrice;
	}

	public int getSalesPrice() {
		return salesPrice;
	}

	public void setSalesPrice(int salesPrice) {
		this.salesPrice = salesPrice;
	}

	public String getMemo() {
		return memo;
	}

	public void setMemo(String memo) {
		this.memo = memo;
	}

	public String getUseyn() {
		return useyn;
	}

	public void setUseyn(String useyn) {
		this.useyn = useyn;
	}

	public Date getCreatedate() {
		return createdate;
	}

	public void setCreatedate(Date createdate) {
		this.createdate = createdate;
	}

	public Date getUpdatedate() {
		return updatedate;
	}

	public void setUpdatedate(Date updatedate) {
		this.updatedate = updatedate;
	}

	
	//toString()
	@Override
	public String toString() {
		return "RawDTO [itemCode=" + itemCode + ", itemName=" + itemName + ", itemNo=" + itemNo + ", itemType="
				+ itemType + ", itemSpecification=" + itemSpecification + ", itemStockUnit=" + itemStockUnit
				+ ", lotSize=" + lotSize + ", buyPrice=" + buyPrice + ", salesPrice=" + salesPrice + ", memo=" + memo
				+ ", useyn=" + useyn + ", createdate=" + createdate + ", updatedate=" + updatedate + "]";
	}

	
	
	
	
}



