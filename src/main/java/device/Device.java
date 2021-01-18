package device;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Getter
@Setter
@ToString
@Entity
@Table(name="device")
public class Device {

    @Getter
    @Setter
    @Id
    private int id;
    //名称
    @Getter
    @Setter
    @Column(name="")
    private String name;
    //资产编号
    @Getter
    @Setter
    @Column(name="")
    private String zcNumber;
    //规格型号
    @Getter
    @Setter
    @Column(name="")
    private String model;
    //材质
    @Getter
    @Setter
    @Column(name="")
    private String cz;
    //生产厂家
    @Getter
    @Setter
    @Column(name="")
    private String manufacturer;
    //出厂编号
    @Getter
    @Setter
    @Column(name="")
    private String factoryNumber;
    //进场时间
    @Getter
    @Setter
    @Column(name="")
    private Date entryTime;
    //参数
    @Getter
    @Setter
    @Column(name="")
    private String parameter;
    //备注
    @Getter
    @Setter
    @Column(name="")
    private String remarks;


}
