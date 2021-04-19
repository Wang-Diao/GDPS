package xyz.leecue.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Date;

/**
 * @author LeeCue
 * @date 2021-04-01
 */
@Data
@ToString
@NoArgsConstructor
public class Document {
    private String fileId;
    private String filename;
    private String etag;
    private long size;
    private Date uploadTime;
    private long uploadUser;
    private int downloadTimes;
    private int updates;
    private Date updated;
    private String description;
}
