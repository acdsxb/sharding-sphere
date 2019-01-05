package com.zjc.shardingjdbc.model;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.Date;

/**
 * create by zhaojinchao on 2018/12/18
 */
@Data
@JsonAutoDetect(getterVisibility = JsonAutoDetect.Visibility.NONE,setterVisibility = JsonAutoDetect.Visibility.NONE)
public class User {
    @JsonProperty("id")
    private Long id;
    @JsonProperty("create_time")
    private Date createTime;
    @JsonProperty("update_time")
    private Date updateTIme;
}
