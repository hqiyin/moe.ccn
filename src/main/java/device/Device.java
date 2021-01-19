package device;

import lombok.Builder;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Data
@Builder
@Entity
@Table(name="device")
public class Device {
    @Id
    private int id;
    //名称
    @Column(name="")
    private String name;
    //资产编号
    @Column(name="")
    private String assetNumbers;
    //规格型号
    @Column(name="")
    private String model;
    //材质
    @Column(name="")
    private String material;
    //生产厂家
    @Column(name="")
    private String manufacturer;
    //出厂编号
    @Column(name="")
    private String factoryNumber;
    //验收日期
    @Column(name="")
    private Date acceptanceDate;
    //参数
    @Column(name="")
    private String parameter;
    //备注
    @Column(name="")
    private String remarks;


}
