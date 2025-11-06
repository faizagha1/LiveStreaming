package com.livestream.userandauth.repository;

import com.livestream.userandauth.entity.PermissionEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface PermissionRepository extends JpaRepository<PermissionEntity, UUID> {
}
