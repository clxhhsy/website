package com.forbetter.pojo;


import lombok.Data;

import java.io.Serializable;


@Data
public class SysUser implements Serializable
{
    private Integer userId;

    private String userName;

    private String userPassword;

    private static final long serialVersionUID = 1L;

    @Override
    public boolean equals(Object that)
    {
        if (this == that)
        {
            return true;
        }
        if (that == null)
        {
            return false;
        }
        if (getClass() != that.getClass())
        {
            return false;
        }
        SysUser other = (SysUser)that;
        return (this.getUserId() == null ? other.getUserId() == null : this.getUserId().equals(
            other.getUserId()))
               && (this.getUserName() == null ? other.getUserName() == null : this.getUserName().equals(
                   other.getUserName()))
               && (this.getUserPassword() == null ? other.getUserPassword() == null : this.getUserPassword().equals(
                   other.getUserPassword()));
    }

    @Override
    public int hashCode()
    {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getUserId() == null) ? 0 : getUserId().hashCode());
        result = prime * result + ((getUserName() == null) ? 0 : getUserName().hashCode());
        result = prime * result + ((getUserPassword() == null) ? 0 : getUserPassword().hashCode());
        return result;
    }

    @Override
    public String toString()
    {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", userId=").append(userId);
        sb.append(", userName=").append(userName);
        sb.append(", userPassword=").append(userPassword);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}