package xyz.leecue.model;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * @author LeeCue
 * @date 2021-04-01
 */
@EqualsAndHashCode(callSuper = true)
@Data
@ToString
@NoArgsConstructor
public class PublicDocument extends Document {
    private Boolean locked = Boolean.FALSE;
}
