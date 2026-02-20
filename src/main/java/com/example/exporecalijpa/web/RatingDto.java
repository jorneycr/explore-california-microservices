package com.example.exporecalijpa.web;

import com.example.exporecalijpa.model.TourRating;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class RatingDto {

    @Min(0)
    @Max(5)
    private Integer score;

    @Size(max = 255)
    private String comment;

    @NotNull
    private Integer customerId;

    /**
     * Constructor to fully initialize the RatingDto
     *
     * @param score      score
     * @param comment    comment
     * @param customerId customer identifier
     */
    public RatingDto(Integer score, String comment, Integer customerId) {
        this.score = score;
        this.comment = comment;
        this.customerId = customerId;
    }

    public RatingDto(TourRating entity) {
        this.score = entity.getScore();
        this.comment = entity.getComment();
        this.customerId = entity.getCustomerId();
    }
}