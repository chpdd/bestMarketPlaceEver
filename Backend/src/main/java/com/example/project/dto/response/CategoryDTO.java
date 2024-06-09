package com.example.project.dto.response;

import com.example.project.entity.Category;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@AllArgsConstructor
public class CategoryDTO {
    private Integer categoryId;
    private String title;

    public CategoryDTO(Category category) {
        categoryId = category.getCategoryId();
        title = category.getTitle();
    }
}
