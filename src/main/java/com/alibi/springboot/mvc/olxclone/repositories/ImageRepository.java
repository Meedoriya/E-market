package com.alibi.springboot.mvc.olxclone.repositories;

import com.alibi.springboot.mvc.olxclone.models.Image;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ImageRepository extends JpaRepository<Image, Long> {
}
