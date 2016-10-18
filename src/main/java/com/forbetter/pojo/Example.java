/*
 * 文件名：Example
 * 版权：Copyright by lichen
 * 描述：
 * 修改人：lichen
 * 修改时间：2016/10/18
 * 跟踪单号：
 * 修改单号：
 * 修改内容：
 */
package com.forbetter.pojo;

import lombok.Data;

import java.io.Serializable;

/**
 * aa
 * <p>
 * Created On 2016年-10月-18日 17:19
 *
 * @author lichen
 * @version 1.0
 */
@Data
public class Example implements Serializable {

    private static final long serialVersionUID = 8222979288258216519L;

    private String name;
    private String developer;

}
