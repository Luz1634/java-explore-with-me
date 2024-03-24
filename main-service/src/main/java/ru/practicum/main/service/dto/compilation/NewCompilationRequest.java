package ru.practicum.main.service.dto.compilation;

import lombok.*;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.Set;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@ToString
public class NewCompilationRequest {
    private Set<Long> events;
    private boolean pinned;
    @NotBlank(message = "Поле title пустое или null")
    @Size(min = 1, max = 50, message = "Поле title должно быть от 1 до 50 символов")
    private String title;
}
