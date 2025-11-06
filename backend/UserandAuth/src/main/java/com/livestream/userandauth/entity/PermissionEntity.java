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

public class PermissionEntity extends BaseEntity{
    private String permission;

    private String description;
}
