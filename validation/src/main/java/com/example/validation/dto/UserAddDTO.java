package com.example.validation.dto;

import lombok.Data;
import org.hibernate.validator.constraints.Length;
import javax.validation.constraints.*;

/**
 * @author SHUJINGPING
 */

@Data
public class UserAddDTO {
    @NotEmpty(message = "用户名不能为空")
    @Length(min = 5, max = 16, message = "用户名长度为 5-16 位")
    @Pattern(regexp = "^[A-Za-z0-9]+$", message = "用户名格式为数字以及字母")
    private String name;

    @NotNull
    @Positive(message = "年龄得为正整数")
    @Min(value = 18, message = "年齡最小不能小于18")
    private Integer age;

    @Override
    public String toString() {
        return "UserAddDTO{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                '}';
    }
}
