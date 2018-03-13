package com.raouf.backend.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.Objects;

/**
 * Driver
 */
@Validated

public class Driver {
    @JsonProperty("firstname")
    private String firstname = null;

    @JsonProperty("lastname")
    private String lastname = null;

    @JsonProperty("mail")
    private String mail = null;

    @JsonProperty("phone")
    private Integer phone = null;

    @JsonProperty("address")
    private Address address = null;

    @JsonProperty("id")
    private Long id = null;

    public Driver firstname(String firstname) {
        this.firstname = firstname;
        return this;
    }

    /**
     * Get firstname
     *
     * @return firstname
     **/
    @ApiModelProperty(example = "John", required = true, value = "")
    @NotNull


    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public Driver lastname(String lastname) {
        this.lastname = lastname;
        return this;
    }

    /**
     * Get lastname
     *
     * @return lastname
     **/
    @ApiModelProperty(example = "Doe", required = true, value = "")
    @NotNull


    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public Driver mail(String mail) {
        this.mail = mail;
        return this;
    }

    /**
     * Get mail
     *
     * @return mail
     **/
    @ApiModelProperty(example = "john.doe@gmail.com", required = true, value = "")
    @NotNull


    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public Driver phone(Integer phone) {
        this.phone = phone;
        return this;
    }

    /**
     * Get phone
     *
     * @return phone
     **/
    @ApiModelProperty(example = "6.28001234E8", required = true, value = "")
    @NotNull


    public Integer getPhone() {
        return phone;
    }

    public void setPhone(Integer phone) {
        this.phone = phone;
    }

    public Driver address(Address address) {
        this.address = address;
        return this;
    }

    /**
     * Get address
     *
     * @return address
     **/
    @ApiModelProperty(value = "")

    @Valid

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Driver id(Long id) {
        this.id = id;
        return this;
    }

    /**
     * Get id
     *
     * @return id
     **/
    @ApiModelProperty(value = "")


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Driver driver = (Driver) o;
        return Objects.equals(this.firstname, driver.firstname) &&
                Objects.equals(this.lastname, driver.lastname) &&
                Objects.equals(this.mail, driver.mail) &&
                Objects.equals(this.phone, driver.phone) &&
                Objects.equals(this.address, driver.address) &&
                Objects.equals(this.id, driver.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstname, lastname, mail, phone, address, id);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Driver {\n");

        sb.append("    firstname: ").append(toIndentedString(firstname)).append("\n");
        sb.append("    lastname: ").append(toIndentedString(lastname)).append("\n");
        sb.append("    mail: ").append(toIndentedString(mail)).append("\n");
        sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
        sb.append("    address: ").append(toIndentedString(address)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }
}

