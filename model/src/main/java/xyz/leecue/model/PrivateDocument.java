package xyz.leecue.model;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Date;

/**
 * @author LeeCue
 * @date 2021-04-01
 */

@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
@Data
@ToString
public class PrivateDocument extends Document{
    private Boolean isDelete = Boolean.FALSE;
    private Date deleteTime;
}
