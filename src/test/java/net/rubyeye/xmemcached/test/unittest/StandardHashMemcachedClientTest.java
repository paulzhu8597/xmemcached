package net.rubyeye.xmemcached.test.unittest;

import net.rubyeye.xmemcached.MemcachedClientBuilder;
import net.rubyeye.xmemcached.XMemcachedClientBuilder;
import net.rubyeye.xmemcached.utils.AddrUtil;

public class StandardHashMemcachedClientTest extends XMemcachedClientTest {

	@Override
	public MemcachedClientBuilder createBuilder() throws Exception {
		MemcachedClientBuilder builder = new XMemcachedClientBuilder(AddrUtil
				.getAddresses(properties.getProperty("test.memcached.servers")));
		return builder;
	}

	@Override
	public MemcachedClientBuilder createWeightedBuilder() throws Exception {
		MemcachedClientBuilder builder = XMemcachedClientBuilder
				.newMemcachedClientBuilder(AddrUtil
						.getAddressesWithWeight(properties
								.getProperty("test.memcached.weighted.servers")));
		return builder;
	}

}
