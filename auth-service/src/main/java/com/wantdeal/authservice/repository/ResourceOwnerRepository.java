package com.wantdeal.authservice.repository;

import com.wantdeal.authservice.entity.ResourceOwner;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ResourceOwnerRepository extends JpaRepository<ResourceOwner, Long> {

    public ResourceOwner findByUsername(String username);

}

