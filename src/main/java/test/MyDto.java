package test;

import java.time.Instant;

public interface MyDto<ID> {

    ID getId();
    void setId(ID id);

    Instant getVersion();
    void setVersion(Instant version);
}
