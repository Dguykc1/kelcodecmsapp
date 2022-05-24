package codeblaze.cmsshoppingcart.models;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import codeblaze.cmsshoppingcart.models.data.Page;
public interface PageRepository extends JpaRepository<Page,Integer> {
   Page findBySlug(String slug);
   @Query("select p from Page p where p.id !=:id and p.slug = :slug")
   // Page findBySlug(int id,String slug);
   Page findBySlugAndIdNot(String slug,int id);
}
