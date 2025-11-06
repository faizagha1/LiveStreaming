package com.livestream.userandauth.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ToString

public class RoleEntity extends BaseEntity {
    private String roleName;

    private String roleDescription;
}
