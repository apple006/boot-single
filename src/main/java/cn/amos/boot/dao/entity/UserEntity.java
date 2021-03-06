package cn.amos.boot.dao.entity;

/**
 * PROJECT: boot
 * DATE: 2018/1/12
 *
 * @author DaoYuanWang
 */
public class UserEntity {

    private Long id;
    private String name;
    private Integer age;
    private String phoneNo;
    private String address;
    private String identityNo;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getIdentityNo() {
        return identityNo;
    }

    public void setIdentityNo(String identityNo) {
        this.identityNo = identityNo;
    }

    @Override
    public String toString() {
        return "UserEntity{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", phoneNo='" + phoneNo + '\'' +
                ", address='" + address + '\'' +
                ", identityNo='" + identityNo + '\'' +
                '}';
    }
}
