package org.east.project.assist.model;

import java.math.BigDecimal;
import java.util.Date;

public class PurchaseOrderDetail {
    /**
     * 唯一主键
     */
    private Long id;

    /**
     * 订单id--WMS订单ID
     */
    private Long orderId;

    /**
     * 订单分录号
     */
    private Integer orderLineNo;

    /**
     * 商品编号
     */
    private Integer skuId;

    /**
     * 单位名称
     */
    private String unitName;

    /**
     * 订单商品数量（通知数量）-或重量
     */
    private BigDecimal orderQty;

    /**
     * 收货数量-或重量
     */
    private BigDecimal recQty;

    /**
     * 差异数量-或重量
     */
    private BigDecimal discrepQty;

    /**
     * 是否需要上传: 1称重, 2不称重
     */
    private Byte weightFlag;

    /**
     * 进入WMS时间
     */
    private Date createDate;

    /**
     * 乐观锁
     */
    private Integer version;

    /**
     * 唯一主键
     * @return id 唯一主键
     */
    public Long getId() {
        return id;
    }

    /**
     * 唯一主键
     * @param id 唯一主键
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 订单id--WMS订单ID
     * @return order_id 订单id--WMS订单ID
     */
    public Long getOrderId() {
        return orderId;
    }

    /**
     * 订单id--WMS订单ID
     * @param orderId 订单id--WMS订单ID
     */
    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    /**
     * 订单分录号
     * @return order_line_no 订单分录号
     */
    public Integer getOrderLineNo() {
        return orderLineNo;
    }

    /**
     * 订单分录号
     * @param orderLineNo 订单分录号
     */
    public void setOrderLineNo(Integer orderLineNo) {
        this.orderLineNo = orderLineNo;
    }

    /**
     * 商品编号
     * @return sku_id 商品编号
     */
    public Integer getSkuId() {
        return skuId;
    }

    /**
     * 商品编号
     * @param skuId 商品编号
     */
    public void setSkuId(Integer skuId) {
        this.skuId = skuId;
    }

    /**
     * 单位名称
     * @return unit_name 单位名称
     */
    public String getUnitName() {
        return unitName;
    }

    /**
     * 单位名称
     * @param unitName 单位名称
     */
    public void setUnitName(String unitName) {
        this.unitName = unitName == null ? null : unitName.trim();
    }

    /**
     * 订单商品数量（通知数量）-或重量
     * @return order_qty 订单商品数量（通知数量）-或重量
     */
    public BigDecimal getOrderQty() {
        return orderQty;
    }

    /**
     * 订单商品数量（通知数量）-或重量
     * @param orderQty 订单商品数量（通知数量）-或重量
     */
    public void setOrderQty(BigDecimal orderQty) {
        this.orderQty = orderQty;
    }

    /**
     * 收货数量-或重量
     * @return rec_qty 收货数量-或重量
     */
    public BigDecimal getRecQty() {
        return recQty;
    }

    /**
     * 收货数量-或重量
     * @param recQty 收货数量-或重量
     */
    public void setRecQty(BigDecimal recQty) {
        this.recQty = recQty;
    }

    /**
     * 差异数量-或重量
     * @return discrep_qty 差异数量-或重量
     */
    public BigDecimal getDiscrepQty() {
        return discrepQty;
    }

    /**
     * 差异数量-或重量
     * @param discrepQty 差异数量-或重量
     */
    public void setDiscrepQty(BigDecimal discrepQty) {
        this.discrepQty = discrepQty;
    }

    /**
     * 是否需要上传: 1称重, 2不称重
     * @return weight_flag 是否需要上传: 1称重, 2不称重
     */
    public Byte getWeightFlag() {
        return weightFlag;
    }

    /**
     * 是否需要上传: 1称重, 2不称重
     * @param weightFlag 是否需要上传: 1称重, 2不称重
     */
    public void setWeightFlag(Byte weightFlag) {
        this.weightFlag = weightFlag;
    }

    /**
     * 进入WMS时间
     * @return create_date 进入WMS时间
     */
    public Date getCreateDate() {
        return createDate;
    }

    /**
     * 进入WMS时间
     * @param createDate 进入WMS时间
     */
    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    /**
     * 乐观锁
     * @return version 乐观锁
     */
    public Integer getVersion() {
        return version;
    }

    /**
     * 乐观锁
     * @param version 乐观锁
     */
    public void setVersion(Integer version) {
        this.version = version;
    }
}