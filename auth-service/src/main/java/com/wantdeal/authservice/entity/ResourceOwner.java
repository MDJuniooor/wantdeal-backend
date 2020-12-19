package com.wantdeal.authservice.entity;

import com.wantdeal.authservice.contant.UserRole;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import javax.persistence.*;
import java.util.Collection;

@ToString
@Entity
@Table(name = "RESOURCE_OWNER")
@Getter
@Setter
public class ResourceOwner implements UserDetails {

    private static final long serialVersionUID = -3699911426704150861L;

    @Id
    private Long id;

    private String username;

    @Column(length=400)
    private String password;

    @Column@Enumerated(EnumType.STRING)
    private UserRole role;

    @Transient
    private Collection<? extends GrantedAuthority> authorities;

    private boolean accountNonExpired = true;

    private boolean accountNonLocked = true;

    private boolean credentialsNonExpired = true;

    private boolean enabled = true;


}
