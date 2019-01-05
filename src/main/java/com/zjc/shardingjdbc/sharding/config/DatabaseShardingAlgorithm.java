package com.zjc.shardingjdbc.sharding.config;


import io.shardingsphere.api.algorithm.sharding.PreciseShardingValue;
import io.shardingsphere.api.algorithm.sharding.standard.PreciseShardingAlgorithm;
import org.springframework.context.annotation.Configuration;

import java.util.Collection;

/**
 * create by zhaojinchao on 2018/12/18
 */
@Configuration
public class DatabaseShardingAlgorithm implements PreciseShardingAlgorithm<Long> {

    private static final long algorithm = 2;

    @Override
    public String doSharding(Collection<String> availableTargetNames, PreciseShardingValue<Long> shardingValue) {
        for (String name : availableTargetNames) {
            if (name.endsWith(shardingValue.getValue() % algorithm + "")) {
                return name;
            }
        }
        throw new IllegalArgumentException();
    }
}
