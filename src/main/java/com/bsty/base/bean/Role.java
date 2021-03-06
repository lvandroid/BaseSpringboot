package com.bsty.base.bean;

import lombok.Data;
import org.springframework.security.core.GrantedAuthority;

@Data
public class Role implements GrantedAuthority {
    private Long id;
    private String name;
    private String description;
    private boolean rootRole;

    @Override
    public String getAuthority() {
        return name;
    }
}
