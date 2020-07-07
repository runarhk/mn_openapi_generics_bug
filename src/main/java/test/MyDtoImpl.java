package test;

import java.time.Instant;

public class MyDtoImpl implements MyDto<Long> {

    private Long id;
    private Instant version;

    @Override
    public Long getId() {
        return id;
    }

    @Override
    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public Instant getVersion() {
        return version;
    }

    public void setVersion(Instant version) {
        this.version = version;
    }
}
