package org.east.project.assist.model;

import java.math.BigDecimal;
import java.util.Date;

public class PurchaseOrderHeader {
    /**
     * 
     */
    private Long id;

    /**
     * OMS orderId
     */
    private Long orderId;

    /**
     * 类型
     */
    private Integer orderType;

    /**
     * 状态
     */
    private Integer status;

    /**
     * 供应商 -采购单有
     */
    private Integer acctId;

    /**
     * 供应商名称 -采购单有
     */
    private String acctName;

    /**
     * 仓库id
     */
    private Integer wareId;

    /**
     * 库房名称
     */
    private String wareName;

    /**
     * 快递编码
     */
    private Integer carrierId;

    /**
     * 快递名称
     */
    private String carrierName;

    /**
     * sku品种数
     */
    private Integer skuCnt;

    /**
     * sku数量
     */
    private Integer skuQty;

    /**
     * 称重商品总重
     */
    private BigDecimal totalWeight;

    /**
     * 通知日期 -采购单
     */
    private Date informDate;

    /**
     * 质检日期
     */
    private Date qcDate;

    /**
     * 质检人
     */
    private String qcName;

    /**
     * 备注
     */
    private String comments;

    /**
     * 关闭时间
     */
    private Date closeDate;

    /**
     * 关闭人
     */
    private String closeName;

    /**
     * 进入WMS日期
     */
    private Date createDate;

    /**
     * 采购员-采购单有
     */
    private String empName;

    /**
     * 是否自提，0：不自提，1：自提-采购单
     */
    private Short isPickUp;

    /**
     * 到货温度 -采购单
     */
    private String arrivalTemperature;

    /**
     * 到货温度2-采购单
     */
    private String arrivalTemperature2;

    /**
     * 更新日期
     */
    private Date updateDate;

    /**
     * 更新人
     */
    private String updateName;

    /**
     * 
     * @return id 
     */
    public Long getId() {
        return id;
    }

    /**
     * 
     * @param id 
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * OMS orderId
     * @return order_id OMS orderId
     */
    public Long getOrderId() {
        return orderId;
    }

    /**
     * OMS orderId
     * @param orderId OMS orderId
     */
    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    /**
     * 类型
     * @return order_type 类型
     */
    public Integer getOrderType() {
        return orderType;
    }

    /**
     * 类型
     * @param orderType 类型
     */
    public void setOrderType(Integer orderType) {
        this.orderType = orderType;
    }

    /**
     * 状态
     * @return status 状态
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * 状态
     * @param status 状态
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * 供应商 -采购单有
     * @return acct_id 供应商 -采购单有
     */
    public Integer getAcctId() {
        return acctId;
    }

    /**
     * 供应商 -采购单有
     * @param acctId 供应商 -采购单有
     */
    public void setAcctId(Integer acctId) {
        this.acctId = acctId;
    }

    /**
     * 供应商名称 -采购单有
     * @return acct_name 供应商名称 -采购单有
     */
    public String getAcctName() {
        return acctName;
    }

    /**
     * 供应商名称 -采购单有
     * @param acctName 供应商名称 -采购单有
     */
    public void setAcctName(String acctName) {
        this.acctName = acctName == null ? null : acctName.trim();
    }

    /**
     * 仓库id
     * @return ware_id 仓库id
     */
    public Integer getWareId() {
        return wareId;
    }

    /**
     * 仓库id
     * @param wareId 仓库id
     */
    public void setWareId(Integer wareId) {
        this.wareId = wareId;
    }

    /**
     * 库房名称
     * @return ware_name 库房名称
     */
    public String getWareName() {
        return wareName;
    }

    /**
     * 库房名称
     * @param wareName 库房名称
     */
    public void setWareName(String wareName) {
        this.wareName = wareName == null ? null : wareName.trim();
    }

    /**
     * 快递编码
     * @return carrier_id 快递编码
     */
    public Integer getCarrierId() {
        return carrierId;
    }

    /**
     * 快递编码
     * @param carrierId 快递编码
     */
    public void setCarrierId(Integer carrierId) {
        this.carrierId = carrierId;
    }

    /**
     * 快递名称
     * @return carrier_name 快递名称
     */
    public String getCarrierName() {
        return carrierName;
    }

    /**
     * 快递名称
     * @param carrierName 快递名称
     */
    public void setCarrierName(String carrierName) {
        this.carrierName = carrierName == null ? null : carrierName.trim();
    }

    /**
     * sku品种数
     * @return sku_cnt sku品种数
     */
    public Integer getSkuCnt() {
        return skuCnt;
    }

    /**
     * sku品种数
     * @param skuCnt sku品种数
     */
    public void setSkuCnt(Integer skuCnt) {
        this.skuCnt = skuCnt;
    }

    /**
     * sku数量
     * @return sku_qty sku数量
     */
    public Integer getSkuQty() {
        return skuQty;
    }

    /**
     * sku数量
     * @param skuQty sku数量
     */
    public void setSkuQty(Integer skuQty) {
        this.skuQty = skuQty;
    }

    /**
     * 称重商品总重
     * @return total_weight 称重商品总重
     */
    public BigDecimal getTotalWeight() {
        return totalWeight;
    }

    /**
     * 称重商品总重
     * @param totalWeight 称重商品总重
     */
    public void setTotalWeight(BigDecimal totalWeight) {
        this.totalWeight = totalWeight;
    }

    /**
     * 通知日期 -采购单
     * @return inform_date 通知日期 -采购单
     */
    public Date getInformDate() {
        return informDate;
    }

    /**
     * 通知日期 -采购单
     * @param informDate 通知日期 -采购单
     */
    public void setInformDate(Date informDate) {
        this.informDate = informDate;
    }

    /**
     * 质检日期
     * @return qc_date 质检日期
     */
    public Date getQcDate() {
        return qcDate;
    }

    /**
     * 质检日期
     * @param qcDate 质检日期
     */
    public void setQcDate(Date qcDate) {
        this.qcDate = qcDate;
    }

    /**
     * 质检人
     * @return qc_name 质检人
     */
    public String getQcName() {
        return qcName;
    }

    /**
     * 质检人
     * @param qcName 质检人
     */
    public void setQcName(String qcName) {
        this.qcName = qcName == null ? null : qcName.trim();
    }

    /**
     * 备注
     * @return comments 备注
     */
    public String getComments() {
        return comments;
    }

    /**
     * 备注
     * @param comments 备注
     */
    public void setComments(String comments) {
        this.comments = comments == null ? null : comments.trim();
    }

    /**
     * 关闭时间
     * @return close_date 关闭时间
     */
    public Date getCloseDate() {
        return closeDate;
    }

    /**
     * 关闭时间
     * @param closeDate 关闭时间
     */
    public void setCloseDate(Date closeDate) {
        this.closeDate = closeDate;
    }

    /**
     * 关闭人
     * @return close_name 关闭人
     */
    public String getCloseName() {
        return closeName;
    }

    /**
     * 关闭人
     * @param closeName 关闭人
     */
    public void setCloseName(String closeName) {
        this.closeName = closeName == null ? null : closeName.trim();
    }

    /**
     * 进入WMS日期
     * @return create_date 进入WMS日期
     */
    public Date getCreateDate() {
        return createDate;
    }

    /**
     * 进入WMS日期
     * @param createDate 进入WMS日期
     */
    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    /**
     * 采购员-采购单有
     * @return emp_name 采购员-采购单有
     */
    public String getEmpName() {
        return empName;
    }

    /**
     * 采购员-采购单有
     * @param empName 采购员-采购单有
     */
    public void setEmpName(String empName) {
        this.empName = empName == null ? null : empName.trim();
    }

    /**
     * 是否自提，0：不自提，1：自提-采购单
     * @return is_pick_up 是否自提，0：不自提，1：自提-采购单
     */
    public Short getIsPickUp() {
        return isPickUp;
    }

    /**
     * 是否自提，0：不自提，1：自提-采购单
     * @param isPickUp 是否自提，0：不自提，1：自提-采购单
     */
    public void setIsPickUp(Short isPickUp) {
        this.isPickUp = isPickUp;
    }

    /**
     * 到货温度 -采购单
     * @return arrival_temperature 到货温度 -采购单
     */
    public String getArrivalTemperature() {
        return arrivalTemperature;
    }

    /**
     * 到货温度 -采购单
     * @param arrivalTemperature 到货温度 -采购单
     */
    public void setArrivalTemperature(String arrivalTemperature) {
        this.arrivalTemperature = arrivalTemperature == null ? null : arrivalTemperature.trim();
    }

    /**
     * 到货温度2-采购单
     * @return arrival_temperature2 到货温度2-采购单
     */
    public String getArrivalTemperature2() {
        return arrivalTemperature2;
    }

    /**
     * 到货温度2-采购单
     * @param arrivalTemperature2 到货温度2-采购单
     */
    public void setArrivalTemperature2(String arrivalTemperature2) {
        this.arrivalTemperature2 = arrivalTemperature2 == null ? null : arrivalTemperature2.trim();
    }

    /**
     * 更新日期
     * @return update_date 更新日期
     */
    public Date getUpdateDate() {
        return updateDate;
    }

    /**
     * 更新日期
     * @param updateDate 更新日期
     */
    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    /**
     * 更新人
     * @return update_name 更新人
     */
    public String getUpdateName() {
        return updateName;
    }

    /**
     * 更新人
     * @param updateName 更新人
     */
    public void setUpdateName(String updateName) {
        this.updateName = updateName == null ? null : updateName.trim();
    }
}