package org.example.web.dto;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;

public class BookIdToRemove {

    @NotNull
    @Positive
    private Integer id;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
