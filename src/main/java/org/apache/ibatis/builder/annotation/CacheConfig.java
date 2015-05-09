package org.apache.ibatis.builder.annotation;

/**
 * @author phoenix
 */
public class CacheConfig {
    private final boolean flushCache;
    private final boolean useCache;
    
    public CacheConfig(boolean flushCache, boolean useCache) {
        this.flushCache = flushCache;
        this.useCache = useCache;
    }

    public boolean isFlushCache() {
        return flushCache;
    }

    public boolean isUseCache() {
        return useCache;
    }
}
